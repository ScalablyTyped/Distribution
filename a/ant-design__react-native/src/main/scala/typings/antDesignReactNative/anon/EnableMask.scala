package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableMask extends StObject {
  
  var enableMask: js.UndefOr[Boolean] = js.native
  
  var enableStack: js.UndefOr[Boolean] = js.native
}
object EnableMask {
  
  @scala.inline
  def apply(): EnableMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableMask]
  }
  
  @scala.inline
  implicit class EnableMaskMutableBuilder[Self <: EnableMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableMask(value: Boolean): Self = StObject.set(x, "enableMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMaskUndefined: Self = StObject.set(x, "enableMask", js.undefined)
    
    @scala.inline
    def setEnableStack(value: Boolean): Self = StObject.set(x, "enableStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableStackUndefined: Self = StObject.set(x, "enableStack", js.undefined)
  }
}
