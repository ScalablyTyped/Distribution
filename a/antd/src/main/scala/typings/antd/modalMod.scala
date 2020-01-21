package typings.antd

import typings.antd.modalModalMod.ModalFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class default ()
    extends typings.antd.modalModalMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var confirm: ModalFunc = js.native
    var defaultProps: AnonConfirmLoading = js.native
    var error: ModalFunc = js.native
    var info: ModalFunc = js.native
    var propTypes: AnonArgsCancelText = js.native
    var success: ModalFunc = js.native
    var warn: ModalFunc = js.native
    var warning: ModalFunc = js.native
    def destroyAll(): Unit = js.native
  }
  
}

