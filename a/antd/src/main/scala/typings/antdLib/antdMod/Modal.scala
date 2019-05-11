package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Modal")
@js.native
class Modal ()
  extends antdLib.libModalMod.default

/* static members */
@JSImport("antd", "Modal")
@js.native
object Modal extends js.Object {
  @JSName("confirm")
  var confirm_Original: antdLib.libModalModalMod.ModalFunc = js.native
  var defaultProps: antdLib.Anon_CancelButtonDisabled = js.native
  @JSName("error")
  var error_Original: antdLib.libModalModalMod.ModalFunc = js.native
  @JSName("info")
  var info_Original: antdLib.libModalModalMod.ModalFunc = js.native
  var propTypes: antdLib.Anon_AlignArgs = js.native
  @JSName("success")
  var success_Original: antdLib.libModalModalMod.ModalFunc = js.native
  @JSName("warn")
  var warn_Original: antdLib.libModalModalMod.ModalFunc = js.native
  @JSName("warning")
  var warning_Original: antdLib.libModalModalMod.ModalFunc = js.native
  def confirm(props: antdLib.libModalModalMod.ModalFuncProps): antdLib.Anon_DestroyNewConfig = js.native
  def destroyAll(): scala.Unit = js.native
  def error(props: antdLib.libModalModalMod.ModalFuncProps): antdLib.Anon_DestroyNewConfig = js.native
  def info(props: antdLib.libModalModalMod.ModalFuncProps): antdLib.Anon_DestroyNewConfig = js.native
  def success(props: antdLib.libModalModalMod.ModalFuncProps): antdLib.Anon_DestroyNewConfig = js.native
  def warn(props: antdLib.libModalModalMod.ModalFuncProps): antdLib.Anon_DestroyNewConfig = js.native
  def warning(props: antdLib.libModalModalMod.ModalFuncProps): antdLib.Anon_DestroyNewConfig = js.native
}

