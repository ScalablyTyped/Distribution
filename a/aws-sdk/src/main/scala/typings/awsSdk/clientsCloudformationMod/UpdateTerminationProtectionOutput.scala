package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTerminationProtectionOutput extends StObject {
  
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackId] = js.undefined
}
object UpdateTerminationProtectionOutput {
  
  inline def apply(): UpdateTerminationProtectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTerminationProtectionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTerminationProtectionOutput] (val x: Self) extends AnyVal {
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
