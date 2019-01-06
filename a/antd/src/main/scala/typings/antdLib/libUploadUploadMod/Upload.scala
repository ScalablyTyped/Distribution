package typings
package antdLib.libUploadUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload
  extends reactLib.reactMod.Component[
      antdLib.libUploadInterfaceMod.UploadProps, 
      antdLib.libUploadInterfaceMod.UploadState, 
      js.Any
    ] {
  var progressTimer: js.Any = js.native
  var recentUploadStatus: scala.Boolean | js.Thenable[_] = js.native
  var upload: js.Any = js.native
  def autoUpdateProgress(`_`: js.Any, file: antdLib.libUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def beforeUpload(
    file: antdLib.libUploadInterfaceMod.RcFile,
    fileList: js.Array[antdLib.libUploadInterfaceMod.RcFile]
  ): scala.Boolean | js.Thenable[_] = js.native
  def clearProgressTimer(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MUpload(): scala.Unit = js.native
  def handleManualRemove(file: antdLib.libUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def handleRemove(file: antdLib.libUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def onChange(info: antdLib.libUploadInterfaceMod.UploadChangeParam): scala.Unit = js.native
  def onError(error: nodeLib.Error, response: js.Any, file: antdLib.libUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def onFileDrop(e: reactLib.reactMod.ReactNs.DragEvent[reactLib.HTMLDivElement]): scala.Unit = js.native
  def onProgress(e: antdLib.Anon_Percent, file: antdLib.libUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def onStart(file: antdLib.libUploadInterfaceMod.RcFile): scala.Unit = js.native
  def onSuccess(response: js.Any, file: antdLib.libUploadInterfaceMod.UploadFile): scala.Unit = js.native
  def renderUpload(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderUploadList(locale: antdLib.libUploadInterfaceMod.UploadLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveUpload(node: js.Any): scala.Unit = js.native
}

