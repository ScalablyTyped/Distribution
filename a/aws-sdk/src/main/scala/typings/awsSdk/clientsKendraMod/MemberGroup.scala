package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberGroup extends StObject {
  
  /**
    * The identifier of the data source for the sub group you want to map to a group.
    */
  var DataSourceId: js.UndefOr[typings.awsSdk.clientsKendraMod.DataSourceId] = js.undefined
  
  /**
    * The identifier of the sub group you want to map to a group.
    */
  var GroupId: typings.awsSdk.clientsKendraMod.GroupId
}
object MemberGroup {
  
  inline def apply(GroupId: GroupId): MemberGroup = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberGroup]
  }
  
  extension [Self <: MemberGroup](x: Self) {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setGroupId(value: GroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
