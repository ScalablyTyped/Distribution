package typings.antd.anon

import typings.antd.antdStrings.warn
import typings.antd.confirmMod.ModalStaticFunctions
import typings.react.mod.ReactElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.Function1[/* hasRootPrefixCls */ RootPrefixCls, Unit]
  
  def destroyAll(): Unit
  
  var useModal: js.Function0[js.Tuple2[Omit[ModalStaticFunctions, warn], ReactElement]]
}
object Config {
  
  inline def apply(
    config: /* hasRootPrefixCls */ RootPrefixCls => Unit,
    destroyAll: () => Unit,
    useModal: () => js.Tuple2[Omit[ModalStaticFunctions, warn], ReactElement]
  ): Config = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), destroyAll = js.Any.fromFunction0(destroyAll), useModal = js.Any.fromFunction0(useModal))
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: /* hasRootPrefixCls */ RootPrefixCls => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    
    inline def setDestroyAll(value: () => Unit): Self = StObject.set(x, "destroyAll", js.Any.fromFunction0(value))
    
    inline def setUseModal(value: () => js.Tuple2[Omit[ModalStaticFunctions, warn], ReactElement]): Self = StObject.set(x, "useModal", js.Any.fromFunction0(value))
  }
}
