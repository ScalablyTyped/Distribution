package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubnetGroupRequest extends StObject {
  
  /**
    * A description of the subnet group
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group
    */
  var SubnetGroupName: String
  
  /**
    * The EC2 subnet IDs for the subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
}
object UpdateSubnetGroupRequest {
  
  inline def apply(SubnetGroupName: String): UpdateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubnetGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSubnetGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
