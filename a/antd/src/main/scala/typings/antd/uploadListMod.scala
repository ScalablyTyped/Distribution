package typings.antd

import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadListProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/UploadList", JSImport.Namespace)
@js.native
object uploadListMod extends js.Object {
  @js.native
  trait UploadList
    extends Component[UploadListProps, js.Any, js.Any] {
    @JSName("componentDidUpdate")
    def componentDidUpdate_MUploadList(): Unit = js.native
    def handleActionIconRender(customIcon: ReactNode, callback: js.Function0[Unit]): Element = js.native
    def handleActionIconRender(customIcon: ReactNode, callback: js.Function0[Unit], title: String): Element = js.native
    def handleClose(file: UploadFile[_]): Unit = js.native
    def handleDownload(file: UploadFile[_]): Unit = js.native
    def handleIconRender(file: UploadFile[_]): js.UndefOr[js.Object | Null] = js.native
    def handlePreview(file: UploadFile[_], e: SyntheticEvent[HTMLElement, Event_]): Unit = js.native
    def renderUploadList(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends UploadList
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonListType = js.native
  }
  
}

