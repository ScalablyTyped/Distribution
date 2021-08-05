package typings.antdMobile

import typings.antdMobile.anon.PartialIToastConfig
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  object default {
    
    @JSImport("antd-mobile/lib/toast", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/toast", "default.LONG")
    @js.native
    def LONG: Double = js.native
    inline def LONG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/toast", "default.SHORT")
    @js.native
    def SHORT: Double = js.native
    inline def SHORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(x.asInstanceOf[js.Any])
    
    inline def config(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[Unit]
    inline def config(conf: PartialIToastConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fail(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def fail(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fail(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fail(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fail(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fail(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fail(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fail(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
    
    inline def info(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def info(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def info(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def info(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def info(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def info(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def info(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def info(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loading(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loading(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loading(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loading(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loading(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loading(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loading(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loading(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def offline(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def offline(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def offline(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def offline(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def offline(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def offline(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def offline(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def offline(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def show(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def show(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def show(content: ReactNode, duration: Double, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def show(content: ReactNode, duration: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def success(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def success(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def success(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def success(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def success(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def success(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def success(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def success(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait IToastConfig extends StObject {
    
    var duration: Double
    
    var mask: Boolean
  }
  object IToastConfig {
    
    inline def apply(duration: Double, mask: Boolean): IToastConfig = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToastConfig]
    }
    
    extension [Self <: IToastConfig](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    }
  }
}
