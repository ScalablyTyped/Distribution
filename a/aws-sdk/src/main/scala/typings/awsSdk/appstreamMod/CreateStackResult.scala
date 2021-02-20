package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStackResult extends StObject {
  
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typings.awsSdk.appstreamMod.Stack] = js.native
}
object CreateStackResult {
  
  @scala.inline
  def apply(): CreateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackResult]
  }
  
  @scala.inline
  implicit class CreateStackResultMutableBuilder[Self <: CreateStackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStack(value: Stack): Self = StObject.set(x, "Stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "Stack", js.undefined)
  }
}
