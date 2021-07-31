package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackResult extends StObject {
  
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typings.awsSdk.appstreamMod.Stack] = js.undefined
}
object UpdateStackResult {
  
  @scala.inline
  def apply(): UpdateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackResult]
  }
  
  @scala.inline
  implicit class UpdateStackResultMutableBuilder[Self <: UpdateStackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStack(value: Stack): Self = StObject.set(x, "Stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "Stack", js.undefined)
  }
}
