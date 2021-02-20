package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingSink[W] extends StObject {
  
  var abort: js.UndefOr[WritableStreamErrorCallback] = js.native
  
  var close: js.UndefOr[WritableStreamDefaultControllerCloseCallback] = js.native
  
  var start: js.UndefOr[WritableStreamDefaultControllerStartCallback] = js.native
  
  var `type`: js.UndefOr[scala.Nothing] = js.native
  
  var write: js.UndefOr[WritableStreamDefaultControllerWriteCallback[W]] = js.native
}
object UnderlyingSink {
  
  @scala.inline
  def apply[W](): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
  
  @scala.inline
  implicit class UnderlyingSinkMutableBuilder[Self <: UnderlyingSink[_], W] (val x: Self with UnderlyingSink[W]) extends AnyVal {
    
    @scala.inline
    def setAbort(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setClose(value: () => Unit | js.Thenable[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ WritableStreamDefaultController => Unit | js.Thenable[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setWrite(value: (W, /* controller */ WritableStreamDefaultController) => Unit | js.Thenable[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
