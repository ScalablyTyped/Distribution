package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackOutput extends StObject {
  
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackId] = js.undefined
}
object UpdateStackOutput {
  
  inline def apply(): UpdateStackOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStackOutput] (val x: Self) extends AnyVal {
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
