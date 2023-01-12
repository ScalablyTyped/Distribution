package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2CreateRouteTableAction extends StObject {
  
  /**
    * A description of the CreateRouteTable action.
    */
  var Description: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * Information about the ID of a VPC.
    */
  var VpcId: ActionTarget
}
object EC2CreateRouteTableAction {
  
  inline def apply(VpcId: ActionTarget): EC2CreateRouteTableAction = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2CreateRouteTableAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EC2CreateRouteTableAction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: LengthBoundedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setVpcId(value: ActionTarget): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
