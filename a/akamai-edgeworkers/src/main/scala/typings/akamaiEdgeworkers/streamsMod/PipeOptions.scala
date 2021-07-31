package typings.akamaiEdgeworkers.streamsMod

import typings.akamaiEdgeworkers.anon.Aborted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeOptions extends StObject {
  
  var preventAbort: js.UndefOr[Boolean] = js.undefined
  
  var preventCancel: js.UndefOr[Boolean] = js.undefined
  
  var preventClose: js.UndefOr[Boolean] = js.undefined
  
  var signal: js.UndefOr[Aborted] = js.undefined
}
object PipeOptions {
  
  @scala.inline
  def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  
  @scala.inline
  implicit class PipeOptionsMutableBuilder[Self <: PipeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventAbort(value: Boolean): Self = StObject.set(x, "preventAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventAbortUndefined: Self = StObject.set(x, "preventAbort", js.undefined)
    
    @scala.inline
    def setPreventCancel(value: Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    
    @scala.inline
    def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    @scala.inline
    def setSignal(value: Aborted): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
