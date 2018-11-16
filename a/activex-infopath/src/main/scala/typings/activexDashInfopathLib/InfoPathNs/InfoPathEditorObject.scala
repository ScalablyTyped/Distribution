package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.InfoPathEditorObject")
@js.native
class InfoPathEditorObject protected () extends js.Object {
  var DataConnectionBaseUrl: java.lang.String = js.native
  var Host: js.Any = js.native
  var HostName: java.lang.String = js.native
  var `InfoPath.InfoPathEditorObject_typekey`: InfoPathEditorObject = js.native
  val XDocument: _XDocument = js.native
  def CloseDocument(): scala.Unit = js.native
  def FlushDocument(): scala.Unit = js.native
  def Load(bstrURL: java.lang.String): scala.Unit = js.native
  def LoadFromStream(punkStream: js.Any): scala.Unit = js.native
  def NewFromSolution(bstrSolutionURI: java.lang.String): scala.Unit = js.native
  def NewFromSolutionWithData(bstrURLXSN: java.lang.String, punkStream: js.Any, dwBehavior: scala.Double): scala.Unit = js.native
  def SetInitEventHandler(handler: IInitEventHandler): scala.Unit = js.native
  def SetNotifyHostEventHandler(pHandler: INotifyHostEventHandler): scala.Unit = js.native
  def SetSubmitToHostEventHandler(pHandler: ISubmitToHostEventHandler): scala.Unit = js.native
}

