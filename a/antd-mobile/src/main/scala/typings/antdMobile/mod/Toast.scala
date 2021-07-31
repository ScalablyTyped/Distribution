package typings.antdMobile.mod

import typings.antdMobile.anon.PartialIToastConfig
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("antd-mobile", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "Toast.LONG")
  @js.native
  def LONG: Double = js.native
  @scala.inline
  def LONG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Toast.SHORT")
  @js.native
  def SHORT: Double = js.native
  @scala.inline
  def SHORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def config(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[Unit]
  @scala.inline
  def config(conf: PartialIToastConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def fail(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def fail(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fail(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  @scala.inline
  def info(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def info(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def info(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def info(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def info(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def info(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def info(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def info(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def loading(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def loading(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def loading(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def loading(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def loading(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def loading(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def loading(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def loading(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def offline(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def offline(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def offline(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def offline(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def offline(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def offline(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def offline(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def offline(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def show(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def show(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(content: ReactNode, duration: Double, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(content: ReactNode, duration: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def success(content: ReactNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def success(content: ReactNode, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def success(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def success(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def success(content: ReactNode, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def success(content: ReactNode, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def success(content: ReactNode, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def success(content: ReactNode, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
