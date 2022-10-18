package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetGroupResponse extends StObject {
  
  /**
    * The newly-created subnet group
    */
  var SubnetGroup: js.UndefOr[typings.awsSdk.clientsMemorydbMod.SubnetGroup] = js.undefined
}
object CreateSubnetGroupResponse {
  
  inline def apply(): CreateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetGroupResponse]
  }
  
  extension [Self <: CreateSubnetGroupResponse](x: Self) {
    
    inline def setSubnetGroup(value: SubnetGroup): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
  }
}
