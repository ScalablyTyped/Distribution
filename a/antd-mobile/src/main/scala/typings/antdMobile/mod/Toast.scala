package typings.antdMobile.mod

import typings.antdMobile.anon.PartialIToastConfig
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile", "Toast")
@js.native
object Toast extends js.Object {
  var LONG: Double = js.native
  var SHORT: Double = js.native
  def config(): Unit = js.native
  def config(conf: PartialIToastConfig): Unit = js.native
  def fail(content: ReactNode): Unit = js.native
  def fail(content: ReactNode, duration: Double): Unit = js.native
  def fail(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = js.native
  def fail(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = js.native
  def hide(): Unit = js.native
  def info(content: ReactNode): Unit = js.native
  def info(content: ReactNode, duration: Double): Unit = js.native
  def info(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = js.native
  def info(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = js.native
  def loading(content: ReactNode): Unit = js.native
  def loading(content: ReactNode, duration: Double): Unit = js.native
  def loading(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = js.native
  def loading(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = js.native
  def offline(content: ReactNode): Unit = js.native
  def offline(content: ReactNode, duration: Double): Unit = js.native
  def offline(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = js.native
  def offline(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = js.native
  def show(content: ReactNode): Unit = js.native
  def show(content: ReactNode, duration: Double): Unit = js.native
  def show(content: ReactNode, duration: Double, mask: Boolean): Unit = js.native
  def success(content: ReactNode): Unit = js.native
  def success(content: ReactNode, duration: Double): Unit = js.native
  def success(content: ReactNode, duration: Double, onClose: js.Function0[Unit]): Unit = js.native
  def success(content: ReactNode, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = js.native
}

