package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStackResult extends StObject {
  
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Stack] = js.undefined
}
object CreateStackResult {
  
  inline def apply(): CreateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStackResult] (val x: Self) extends AnyVal {
    
    inline def setStack(value: Stack): Self = StObject.set(x, "Stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "Stack", js.undefined)
  }
}
