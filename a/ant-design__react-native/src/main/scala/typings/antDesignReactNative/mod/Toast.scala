package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Duration
import typings.antDesignReactNative.toastMod.IToastConfigurable
import typings.antDesignReactNative.toastMod.IToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("@ant-design/react-native", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Toast.LONG")
  @js.native
  def LONG: Double = js.native
  @scala.inline
  def LONG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Toast.SHORT")
  @js.native
  def SHORT: Double = js.native
  @scala.inline
  def SHORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def config(props: IToastConfigurable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@ant-design/react-native", "Toast.defaultConfig")
  @js.native
  def defaultConfig: IToastConfigurable = js.native
  @scala.inline
  def defaultConfig_=(x: IToastConfigurable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
  
  /**
    *
    * @param props: toast props
    */
  @scala.inline
  def fail(props: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def fail(props: String, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: String, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: String, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: String, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: String, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def fail(props: IToastProps, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getConfig(): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[Duration]
  
  /**
    *
    * @param props: toast props
    */
  @scala.inline
  def info(props: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def info(props: String, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: String, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: String, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: String, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: String, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def info(props: IToastProps, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    *
    * @param props: toast props
    */
  @scala.inline
  def loading(props: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def loading(props: String, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: String, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: String, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: String, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: String, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def loading(props: IToastProps, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    *
    * @param props: toast props
    */
  @scala.inline
  def offline(props: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def offline(props: String, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: String, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: String, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: String, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: String, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offline(props: IToastProps, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@ant-design/react-native", "Toast.remove")
  @js.native
  def remove: js.Function1[/* key */ Double, Unit] = js.native
  
  @JSImport("@ant-design/react-native", "Toast.removeAll")
  @js.native
  def removeAll: js.Function0[Unit] = js.native
  @scala.inline
  def removeAll_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def remove_=(x: js.Function1[/* key */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  /**
    * @deprecated use Toast.info instead
    */
  @scala.inline
  def show(props: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def show(props: String, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def show(props: String, duration: Double, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def show(props: String, duration: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def show(props: IToastProps): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def show(props: IToastProps, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def show(props: IToastProps, duration: Double, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def show(props: IToastProps, duration: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    *
    * @param props: toast props
    */
  @scala.inline
  def success(props: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def success(props: String, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: String, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: String, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: String, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: String, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps, duration: Double, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps, duration: Unit, onClose: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def success(props: IToastProps, duration: Unit, onClose: Unit, mask: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(props.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Double]
}
