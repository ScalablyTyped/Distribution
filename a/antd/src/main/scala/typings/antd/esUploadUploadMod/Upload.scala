package typings.antd.esUploadUploadMod

import typings.antd.Anon_Percent
import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esUploadInterfaceMod.RcFile
import typings.antd.esUploadInterfaceMod.UploadChangeParam
import typings.antd.esUploadInterfaceMod.UploadFile
import typings.antd.esUploadInterfaceMod.UploadLocale
import typings.antd.esUploadInterfaceMod.UploadProps
import typings.antd.esUploadInterfaceMod.UploadState
import typings.react.reactMod.Component
import typings.react.reactMod.DragEvent
import typings.react.reactMod.Global.JSXNs.Element
import typings.std.Error
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload
  extends Component[UploadProps, UploadState, js.Any] {
  var progressTimer: js.Any = js.native
  var recentUploadStatus: Boolean | js.Thenable[_] = js.native
  var upload: js.Any = js.native
  def autoUpdateProgress(`_`: js.Any, file: UploadFile): Unit = js.native
  def beforeUpload(file: RcFile, fileList: js.Array[RcFile]): Boolean | js.Thenable[Unit] = js.native
  def clearProgressTimer(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MUpload(): Unit = js.native
  def handleManualRemove(file: UploadFile): Unit = js.native
  def handleRemove(file: UploadFile): Unit = js.native
  def onChange(info: UploadChangeParam[UploadFile]): Unit = js.native
  def onError(error: Error, response: js.Any, file: UploadFile): Unit = js.native
  def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
  def onProgress(e: Anon_Percent, file: UploadFile): Unit = js.native
  def onStart(file: RcFile): Unit = js.native
  def onSuccess(response: js.Any, file: UploadFile): Unit = js.native
  def renderUpload(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderUploadList(locale: UploadLocale): Element = js.native
  def saveUpload(node: js.Any): Unit = js.native
}

