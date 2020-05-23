package typings.antd.modalMod

import org.scalablytyped.runtime.Instantiable0
import typings.antd.anon.ConfirmLoading
import typings.antd.confirmMod.ModalFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {destroyAll (): void,   useModal  :typeof useModal,   defaultProps  :{  width  :number,   transitionName  :string,   maskTransitionName  :string,   confirmLoading  :boolean,   visible  :boolean,   okType  :antd.antd/lib/button/button.LegacyButtonType}, new (): antd.antd/lib/modal/Modal.default} & antd.antd/lib/modal/confirm.ModalStaticFunctions */
@js.native
trait Modal
  extends Instantiable0[typings.antd.modalModalMod.default] {
  var confirm: ModalFunc = js.native
  var defaultProps: ConfirmLoading = js.native
  var error: ModalFunc = js.native
  var info: ModalFunc = js.native
  var success: ModalFunc = js.native
  var warn: ModalFunc = js.native
  var warning: ModalFunc = js.native
  def destroyAll(): Unit = js.native
}

