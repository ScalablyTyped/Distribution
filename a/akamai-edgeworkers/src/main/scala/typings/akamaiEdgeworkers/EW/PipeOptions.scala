package typings.akamaiEdgeworkers.EW

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
  
  inline def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  
  extension [Self <: PipeOptions](x: Self) {
    
    inline def setPreventAbort(value: Boolean): Self = StObject.set(x, "preventAbort", value.asInstanceOf[js.Any])
    
    inline def setPreventAbortUndefined: Self = StObject.set(x, "preventAbort", js.undefined)
    
    inline def setPreventCancel(value: Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
    
    inline def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
    
    inline def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    
    inline def setSignal(value: Aborted): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
