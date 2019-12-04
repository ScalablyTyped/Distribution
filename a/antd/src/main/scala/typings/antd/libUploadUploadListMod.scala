package typings.antd

import typings.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typings.antd.libUploadInterfaceMod.UploadFile
import typings.antd.libUploadInterfaceMod.UploadListProps
import typings.antd.libUploadUploadListMod.UploadList
import typings.react.reactMod.Component
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/UploadList", JSImport.Namespace)
@js.native
object libUploadUploadListMod extends js.Object {
  @js.native
  trait UploadList
    extends Component[UploadListProps, js.Any, js.Any] {
    @JSName("componentDidUpdate")
    def componentDidUpdate_MUploadList(): Unit = js.native
    def handleClose(file: UploadFile[_]): Unit = js.native
    def handleDownload(file: UploadFile[_]): Unit = js.native
    def handlePreview(file: UploadFile[_], e: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    def renderUploadList(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends UploadList
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_File = js.native
  }
  
}

