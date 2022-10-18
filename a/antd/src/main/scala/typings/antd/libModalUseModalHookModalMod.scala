package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libModalModalMod.ModalFuncProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalUseModalHookModalMod extends Shortcut {
  
  @JSImport("antd/lib/modal/useModal/HookModal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HookModalProps & RefAttributes[HookModalRef]] = js.native
  
  trait HookModalProps extends StObject {
    
    def afterClose(): Unit
    
    var config: ModalFuncProps
  }
  object HookModalProps {
    
    inline def apply(afterClose: () => Unit, config: ModalFuncProps): HookModalProps = {
      val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookModalProps]
    }
    
    extension [Self <: HookModalProps](x: Self) {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setConfig(value: ModalFuncProps): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait HookModalRef extends StObject {
    
    def destroy(): Unit
    
    def update(config: ModalFuncProps): Unit
  }
  object HookModalRef {
    
    inline def apply(destroy: () => Unit, update: ModalFuncProps => Unit): HookModalRef = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[HookModalRef]
    }
    
    extension [Self <: HookModalRef](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: ModalFuncProps => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[HookModalProps & RefAttributes[HookModalRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libModalUseModalHookModalMod.foo` */
  override def _to: ForwardRefExoticComponent[HookModalProps & RefAttributes[HookModalRef]] = default
}
