package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICallOptions extends StObject {
  
  var disclose_me: js.UndefOr[Boolean] = js.native
  
  var receive_progress: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ICallOptions {
  
  @scala.inline
  def apply(): ICallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICallOptions]
  }
  
  @scala.inline
  implicit class ICallOptionsMutableBuilder[Self <: ICallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisclose_me(value: Boolean): Self = StObject.set(x, "disclose_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisclose_meUndefined: Self = StObject.set(x, "disclose_me", js.undefined)
    
    @scala.inline
    def setReceive_progress(value: Boolean): Self = StObject.set(x, "receive_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceive_progressUndefined: Self = StObject.set(x, "receive_progress", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
