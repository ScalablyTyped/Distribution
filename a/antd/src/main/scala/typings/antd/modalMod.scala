package typings.antd

import typings.antd.anon.OmitModalStaticFunctionsw
import typings.antd.anon.PartialModalProps
import typings.antd.anon.RootPrefixCls
import typings.antd.anon.WeakValidationMapModalPro
import typings.antd.confirmMod.ModalFunc
import typings.antd.modalModalMod.ModalProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  /* Inlined antd.antd/lib/modal/Modal.ModalInterface & antd.antd/lib/modal/confirm.ModalStaticFunctions & {destroyAll (): void,   config :(hasRootPrefixCls : {  rootPrefixCls :string | undefined}): void} */
  @js.native
  trait Modal extends js.Object {
    var config: js.Function1[/* hasRootPrefixCls */ RootPrefixCls, Unit] = js.native
    var confirm: ModalFunc = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialModalProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var error: ModalFunc = js.native
    var info: ModalFunc = js.native
    var propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
    var success: ModalFunc = js.native
    var useModal: js.Function0[js.Tuple2[OmitModalStaticFunctionsw, ReactElement]] = js.native
    var warn: ModalFunc = js.native
    var warning: ModalFunc = js.native
    def apply(props: PropsWithChildren[ModalProps]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[ModalProps], context: js.Any): ReactElement | Null = js.native
    def destroyAll(): Unit = js.native
  }
  
  val default: Modal = js.native
}

