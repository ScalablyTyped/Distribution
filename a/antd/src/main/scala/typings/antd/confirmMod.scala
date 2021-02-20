package typings.antd

import typings.antd.anon.Destroy
import typings.antd.anon.RootPrefixCls
import typings.antd.anon.Update
import typings.antd.modalModalMod.ModalFuncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod {
  
  @JSImport("antd/lib/modal/confirm", JSImport.Default)
  @js.native
  def default(config: ModalFuncProps): Update = js.native
  
  @JSImport("antd/lib/modal/confirm", "globalConfig")
  @js.native
  def globalConfig(hasRootPrefixCls: RootPrefixCls): Unit = js.native
  
  @JSImport("antd/lib/modal/confirm", "withConfirm")
  @js.native
  def withConfirm(props: ModalFuncProps): ModalFuncProps = js.native
  
  @JSImport("antd/lib/modal/confirm", "withError")
  @js.native
  def withError(props: ModalFuncProps): ModalFuncProps = js.native
  
  @JSImport("antd/lib/modal/confirm", "withInfo")
  @js.native
  def withInfo(props: ModalFuncProps): ModalFuncProps = js.native
  
  @JSImport("antd/lib/modal/confirm", "withSuccess")
  @js.native
  def withSuccess(props: ModalFuncProps): ModalFuncProps = js.native
  
  @JSImport("antd/lib/modal/confirm", "withWarn")
  @js.native
  def withWarn(props: ModalFuncProps): ModalFuncProps = js.native
  
  type ConfigUpdate = ModalFuncProps | (js.Function1[/* prevConfig */ ModalFuncProps, ModalFuncProps])
  
  type ModalFunc = js.Function1[/* props */ ModalFuncProps, Destroy]
  
  @js.native
  trait ModalStaticFunctions extends StObject {
    
    var confirm: ModalFunc = js.native
    
    var error: ModalFunc = js.native
    
    var info: ModalFunc = js.native
    
    var success: ModalFunc = js.native
    
    var warn: ModalFunc = js.native
    
    var warning: ModalFunc = js.native
  }
  object ModalStaticFunctions {
    
    @scala.inline
    def apply(
      confirm: /* props */ ModalFuncProps => Destroy,
      error: /* props */ ModalFuncProps => Destroy,
      info: /* props */ ModalFuncProps => Destroy,
      success: /* props */ ModalFuncProps => Destroy,
      warn: /* props */ ModalFuncProps => Destroy,
      warning: /* props */ ModalFuncProps => Destroy
    ): ModalStaticFunctions = {
      val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[ModalStaticFunctions]
    }
    
    @scala.inline
    implicit class ModalStaticFunctionsMutableBuilder[Self <: ModalStaticFunctions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirm(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccess(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarning(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
}
