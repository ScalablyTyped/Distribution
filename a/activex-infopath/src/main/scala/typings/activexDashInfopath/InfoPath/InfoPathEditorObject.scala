package typings.activexDashInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.InfoPathEditorObject")
@js.native
class InfoPathEditorObject protected () extends js.Object {
  var DataConnectionBaseUrl: String = js.native
  var Host: js.Any = js.native
  var HostName: String = js.native
  @JSName("InfoPath.InfoPathEditorObject_typekey")
  var InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject = js.native
  val XDocument: _XDocument = js.native
  def CloseDocument(): Unit = js.native
  def FlushDocument(): Unit = js.native
  def Load(bstrURL: String): Unit = js.native
  def LoadFromStream(punkStream: js.Any): Unit = js.native
  def NewFromSolution(bstrSolutionURI: String): Unit = js.native
  def NewFromSolutionWithData(bstrURLXSN: String, punkStream: js.Any, dwBehavior: Double): Unit = js.native
  def SetInitEventHandler(handler: IInitEventHandler): Unit = js.native
  def SetNotifyHostEventHandler(pHandler: INotifyHostEventHandler): Unit = js.native
  def SetSubmitToHostEventHandler(pHandler: ISubmitToHostEventHandler): Unit = js.native
}

