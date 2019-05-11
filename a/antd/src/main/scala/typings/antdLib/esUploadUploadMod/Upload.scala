package typings
package antdLib.esUploadUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload
  extends reactLib.reactMod.Component[
      antdLib.esUploadInterfaceMod.UploadProps, 
      antdLib.esUploadInterfaceMod.UploadState, 
      js.Any
    ] {
  var progressTimer: js.Any = js.native
  var recentUploadStatus: scala.Boolean | js.Thenable[_] = js.native
  var upload: js.Any = js.native
  def autoUpdateProgress(`_`: js.Any, file: antdLib.esUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def beforeUpload(file: antdLib.esUploadInterfaceMod.RcFile, fileList: js.Array[antdLib.esUploadInterfaceMod.RcFile]): scala.Boolean | js.Thenable[_] = js.native
  def clearProgressTimer(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MUpload(): scala.Unit = js.native
  def handleManualRemove(file: antdLib.esUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def handleRemove(file: antdLib.esUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def onChange(info: antdLib.esUploadInterfaceMod.UploadChangeParam[antdLib.esUploadInterfaceMod.UploadFile]): scala.Unit = js.native
  def onError(error: stdLib.Error, response: js.Any, file: antdLib.esUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def onFileDrop(e: reactLib.reactMod.DragEvent[stdLib.HTMLDivElement]): scala.Unit = js.native
  def onProgress(e: antdLib.Anon_Percent, file: antdLib.esUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def onStart(file: antdLib.esUploadInterfaceMod.RcFile): scala.Unit = js.native
  def onSuccess(response: js.Any, file: antdLib.esUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def renderUpload(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderUploadList(locale: antdLib.esUploadInterfaceMod.UploadLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveUpload(node: js.Any): scala.Unit = js.native
}

