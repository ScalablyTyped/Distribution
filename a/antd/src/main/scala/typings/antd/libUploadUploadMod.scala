package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typings.antd.libUploadInterfaceMod.RcFile
import typings.antd.libUploadInterfaceMod.UploadChangeParam
import typings.antd.libUploadInterfaceMod.UploadFile
import typings.antd.libUploadInterfaceMod.UploadLocale
import typings.antd.libUploadInterfaceMod.UploadProps
import typings.antd.libUploadInterfaceMod.UploadState
import typings.antd.libUploadUploadMod.Upload
import typings.react.reactMod.Component
import typings.react.reactMod.DragEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Error
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object libUploadUploadMod extends js.Object {
  @js.native
  trait Upload
    extends Component[UploadProps, UploadState, js.Any] {
    var progressTimer: js.Any = js.native
    var recentUploadStatus: Boolean | js.Thenable[_] = js.native
    var upload: js.Any = js.native
    def autoUpdateProgress(`_`: js.Any, file: UploadFile[_]): Unit = js.native
    def beforeUpload(file: RcFile, fileList: js.Array[RcFile]): Boolean | js.Thenable[Unit] = js.native
    def clearProgressTimer(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MUpload(): Unit = js.native
    def handleRemove(file: UploadFile[_]): Unit = js.native
    def onChange(info: UploadChangeParam[UploadFile[_]]): Unit = js.native
    def onError(error: Error, response: js.Any, file: UploadFile[_]): Unit = js.native
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    def onProgress(e: Anon_Percent, file: UploadFile[_]): Unit = js.native
    def onStart(file: RcFile): Unit = js.native
    def onSuccess(response: js.Any, file: UploadFile[_], xhr: js.Any): Unit = js.native
    def renderUpload(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
    def renderUploadList(locale: UploadLocale): Element = js.native
    def saveUpload(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Upload {
    def this(props: UploadProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typings.antd.libUploadDraggerMod.default] = js.native
    var defaultProps: Anon_AcceptAction = js.native
    def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileListAny | Null = js.native
  }
  
}

