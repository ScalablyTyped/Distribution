package typings
package antdLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Modal")
@js.native
class Modal ()
  extends antdLib.esModalMod.default

/* static members */
@JSImport("antd/es", "Modal")
@js.native
object Modal extends js.Object {
  @JSName("confirm")
  var confirm_Original: antdLib.esModalModalMod.ModalFunc = js.native
  var defaultProps: antdLib.Anon_CancelButtonDisabled = js.native
  @JSName("error")
  var error_Original: antdLib.esModalModalMod.ModalFunc = js.native
  @JSName("info")
  var info_Original: antdLib.esModalModalMod.ModalFunc = js.native
  var propTypes: antdLib.Anon_AlignArgs = js.native
  @JSName("success")
  var success_Original: antdLib.esModalModalMod.ModalFunc = js.native
  @JSName("warn")
  var warn_Original: antdLib.esModalModalMod.ModalFunc = js.native
  @JSName("warning")
  var warning_Original: antdLib.esModalModalMod.ModalFunc = js.native
  def confirm(props: antdLib.esModalModalMod.ModalFuncProps): antdLib.Anon_Destroy = js.native
  def destroyAll(): scala.Unit = js.native
  def error(props: antdLib.esModalModalMod.ModalFuncProps): antdLib.Anon_Destroy = js.native
  def info(props: antdLib.esModalModalMod.ModalFuncProps): antdLib.Anon_Destroy = js.native
  def success(props: antdLib.esModalModalMod.ModalFuncProps): antdLib.Anon_Destroy = js.native
  def warn(props: antdLib.esModalModalMod.ModalFuncProps): antdLib.Anon_Destroy = js.native
  def warning(props: antdLib.esModalModalMod.ModalFuncProps): antdLib.Anon_Destroy = js.native
}

