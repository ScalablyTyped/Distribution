package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceGroup extends StObject {
  
  /**
    * The identifier of the data source group you want to add to your list of data source groups. This is for filtering search results based on the groups' access to documents in that data source.
    */
  var DataSourceId: typings.awsSdk.clientsKendraMod.DataSourceId
  
  /**
    * The identifier of the group you want to add to your list of groups. This is for filtering search results based on the groups' access to documents.
    */
  var GroupId: PrincipalName
}
object DataSourceGroup {
  
  inline def apply(DataSourceId: DataSourceId, GroupId: PrincipalName): DataSourceGroup = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceGroup] (val x: Self) extends AnyVal {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: PrincipalName): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
