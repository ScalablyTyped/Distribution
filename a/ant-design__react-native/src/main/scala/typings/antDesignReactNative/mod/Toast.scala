package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Duration
import typings.antDesignReactNative.toastMod.IToastConfigurable
import typings.antDesignReactNative.toastMod.IToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native", "Toast")
@js.native
object Toast extends js.Object {
  var LONG: Double = js.native
  var SHORT: Double = js.native
  var defaultConfig: IToastConfigurable = js.native
  var removeAll: js.Function0[Unit] = js.native
  def config(props: IToastConfigurable): Unit = js.native
  /**
    *
    * @param props: toast props
    * @deprecated duration: use props instead
    * @deprecated onClose: use props instead
    * @deprecated mask: use props instead
    */
  def fail(props: String): Double = js.native
  def fail(
    props: String,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def fail(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def fail(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def fail(props: String, duration: Double): Double = js.native
  def fail(props: String, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def fail(props: String, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def fail(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def fail(props: IToastProps): Double = js.native
  def fail(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def fail(props: IToastProps, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def fail(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.Function0[Unit],
    mask: Boolean
  ): Double = js.native
  def fail(props: IToastProps, duration: Double): Double = js.native
  def fail(props: IToastProps, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def fail(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def fail(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def getConfig(): Duration = js.native
  /**
    *
    * @param props: toast props
    * @deprecated duration: use props instead
    * @deprecated onClose: use props instead
    * @deprecated mask: use props instead
    */
  def info(props: String): Double = js.native
  def info(
    props: String,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def info(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def info(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def info(props: String, duration: Double): Double = js.native
  def info(props: String, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def info(props: String, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def info(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def info(props: IToastProps): Double = js.native
  def info(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def info(props: IToastProps, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def info(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.Function0[Unit],
    mask: Boolean
  ): Double = js.native
  def info(props: IToastProps, duration: Double): Double = js.native
  def info(props: IToastProps, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def info(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def info(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  /**
    *
    * @param props: toast props
    * @deprecated duration: use props instead
    * @deprecated onClose: use props instead
    * @deprecated mask: use props instead
    */
  def loading(props: String): Double = js.native
  def loading(
    props: String,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def loading(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def loading(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def loading(props: String, duration: Double): Double = js.native
  def loading(props: String, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def loading(props: String, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def loading(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def loading(props: IToastProps): Double = js.native
  def loading(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def loading(props: IToastProps, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def loading(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.Function0[Unit],
    mask: Boolean
  ): Double = js.native
  def loading(props: IToastProps, duration: Double): Double = js.native
  def loading(props: IToastProps, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def loading(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def loading(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  /**
    *
    * @param props: toast props
    * @deprecated duration: use props instead
    * @deprecated onClose: use props instead
    * @deprecated mask: use props instead
    */
  def offline(props: String): Double = js.native
  def offline(
    props: String,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def offline(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def offline(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def offline(props: String, duration: Double): Double = js.native
  def offline(props: String, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def offline(props: String, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def offline(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def offline(props: IToastProps): Double = js.native
  def offline(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def offline(props: IToastProps, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def offline(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.Function0[Unit],
    mask: Boolean
  ): Double = js.native
  def offline(props: IToastProps, duration: Double): Double = js.native
  def offline(props: IToastProps, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def offline(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def offline(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def remove(key: Double): Unit = js.native
  /**
    * @deprecated use Toast.info instead
    */
  def show(props: String): Double = js.native
  def show(props: String, duration: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def show(props: String, duration: Double): Double = js.native
  def show(props: String, duration: Double, mask: Boolean): Double = js.native
  def show(props: IToastProps): Double = js.native
  def show(props: IToastProps, duration: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def show(props: IToastProps, duration: Double): Double = js.native
  def show(props: IToastProps, duration: Double, mask: Boolean): Double = js.native
  /**
    *
    * @param props: toast props
    * @deprecated duration: use props instead
    * @deprecated onClose: use props instead
    * @deprecated mask: use props instead
    */
  def success(props: String): Double = js.native
  def success(
    props: String,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def success(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def success(props: String, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def success(props: String, duration: Double): Double = js.native
  def success(props: String, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def success(props: String, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def success(props: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
  def success(props: IToastProps): Double = js.native
  def success(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.UndefOr[scala.Nothing],
    mask: Boolean
  ): Double = js.native
  def success(props: IToastProps, duration: js.UndefOr[scala.Nothing], onClose: js.Function0[Unit]): Double = js.native
  def success(
    props: IToastProps,
    duration: js.UndefOr[scala.Nothing],
    onClose: js.Function0[Unit],
    mask: Boolean
  ): Double = js.native
  def success(props: IToastProps, duration: Double): Double = js.native
  def success(props: IToastProps, duration: Double, onClose: js.UndefOr[scala.Nothing], mask: Boolean): Double = js.native
  def success(props: IToastProps, duration: Double, onClose: js.Function0[Unit]): Double = js.native
  def success(props: IToastProps, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Double = js.native
}

