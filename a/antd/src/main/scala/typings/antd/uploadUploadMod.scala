package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.anon.Accept
import typings.antd.anon.FileList
import typings.antd.anon.Percent
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.uploadInterfaceMod.RcFile
import typings.antd.uploadInterfaceMod.UploadChangeParam
import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadLocale
import typings.antd.uploadInterfaceMod.UploadProps
import typings.antd.uploadInterfaceMod.UploadState
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.global.JSX.Element
import typings.std.Error
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object uploadUploadMod extends js.Object {
  @js.native
  trait Upload
    extends Component[UploadProps[js.Any], UploadState[js.Any], js.Any] {
    var progressTimer: js.Any = js.native
    var recentUploadStatus: Boolean | js.Thenable[_] = js.native
    var upload: js.Any = js.native
    def beforeUpload(file: RcFile, fileList: js.Array[RcFile]): Boolean | js.Thenable[Unit] = js.native
    def clearProgressTimer(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MUpload(): Unit = js.native
    def handleRemove(file: UploadFile[_]): Unit = js.native
    def onChange(info: UploadChangeParam[UploadFile[_]]): Unit = js.native
    def onError(error: Error, response: js.Any, file: UploadFile[_]): Unit = js.native
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    def onProgress(e: Percent, file: UploadFile[_]): Unit = js.native
    def onStart(file: RcFile): Unit = js.native
    def onSuccess(response: js.Any, file: UploadFile[_], xhr: js.Any): Unit = js.native
    def renderUpload(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
    def renderUploadList(locale: UploadLocale): Element = js.native
    def saveUpload(node: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RcUpload */ js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Upload {
    def this(props: UploadProps[_]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typings.antd.draggerMod.default] = js.native
    var defaultProps: Accept = js.native
    def getDerivedStateFromProps(nextProps: UploadProps[_]): FileList | Null = js.native
  }
  
}

