package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVirtualMachineInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual machine.
    */
  var ResourceArn: typings.awsSdk.clientsBackupgatewayMod.ResourceArn
}
object GetVirtualMachineInput {
  
  inline def apply(ResourceArn: ResourceArn): GetVirtualMachineInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVirtualMachineInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVirtualMachineInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
