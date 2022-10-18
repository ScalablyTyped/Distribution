package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupQuery extends StObject {
  
  /**
    * The name of the resource group that is associated with the specified resource query.
    */
  var GroupName: typings.awsSdk.clientsResourcegroupsMod.GroupName
  
  /**
    * The resource query that determines which AWS resources are members of the associated resource group.
    */
  var ResourceQuery: typings.awsSdk.clientsResourcegroupsMod.ResourceQuery
}
object GroupQuery {
  
  inline def apply(GroupName: GroupName, ResourceQuery: ResourceQuery): GroupQuery = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], ResourceQuery = ResourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupQuery]
  }
  
  extension [Self <: GroupQuery](x: Self) {
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
  }
}
