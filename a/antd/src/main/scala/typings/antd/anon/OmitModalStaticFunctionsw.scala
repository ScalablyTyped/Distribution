package typings.antd.anon

import typings.antd.confirmMod.ModalFunc
import typings.antd.modalModalMod.ModalFuncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd.antd/lib/modal/confirm.ModalStaticFunctions, 'warn'> */
@js.native
trait OmitModalStaticFunctionsw extends StObject {
  
  var confirm: ModalFunc = js.native
  
  var error: ModalFunc = js.native
  
  var info: ModalFunc = js.native
  
  var success: ModalFunc = js.native
  
  var warning: ModalFunc = js.native
}
object OmitModalStaticFunctionsw {
  
  @scala.inline
  def apply(
    confirm: /* props */ ModalFuncProps => Destroy,
    error: /* props */ ModalFuncProps => Destroy,
    info: /* props */ ModalFuncProps => Destroy,
    success: /* props */ ModalFuncProps => Destroy,
    warning: /* props */ ModalFuncProps => Destroy
  ): OmitModalStaticFunctionsw = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[OmitModalStaticFunctionsw]
  }
  
  @scala.inline
  implicit class OmitModalStaticFunctionswMutableBuilder[Self <: OmitModalStaticFunctionsw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirm(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarning(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
  }
}
