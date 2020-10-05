package typings.antd

import typings.antd.anon.IsImageUrl
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadListProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/upload/UploadList", JSImport.Namespace)
@js.native
object uploadListMod extends js.Object {
  @js.native
  trait UploadList
    extends Component[UploadListProps[js.Any], js.Any, js.Any] {
    @JSName("componentDidUpdate")
    def componentDidUpdate_MUploadList(): Unit = js.native
    def handleActionIconRender(customIcon: ReactNode, callback: js.Function0[Unit], prefixCls: String): Element = js.native
    def handleActionIconRender(customIcon: ReactNode, callback: js.Function0[Unit], prefixCls: String, title: String): Element = js.native
    def handleClose(file: UploadFile[_]): Unit = js.native
    def handleDownload(file: UploadFile[_]): Unit = js.native
    def handleIconRender(file: UploadFile[_]): js.UndefOr[js.Object | Null] = js.native
    def handlePreview(file: UploadFile[_], e: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    def renderUploadList(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends UploadList
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: IsImageUrl = js.native
  }
  
}

