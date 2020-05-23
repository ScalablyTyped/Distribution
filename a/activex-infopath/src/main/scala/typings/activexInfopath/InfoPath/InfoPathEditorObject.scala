package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoPathEditorObject extends js.Object {
  var DataConnectionBaseUrl: String
  var Host: js.Any
  var HostName: String
  @JSName("InfoPath.InfoPathEditorObject_typekey")
  var InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject
  val XDocument: _XDocument
  def CloseDocument(): Unit
  def FlushDocument(): Unit
  def Load(bstrURL: String): Unit
  def LoadFromStream(punkStream: js.Any): Unit
  def NewFromSolution(bstrSolutionURI: String): Unit
  def NewFromSolutionWithData(bstrURLXSN: String, punkStream: js.Any, dwBehavior: Double): Unit
  def SetInitEventHandler(handler: IInitEventHandler): Unit
  def SetNotifyHostEventHandler(pHandler: INotifyHostEventHandler): Unit
  def SetSubmitToHostEventHandler(pHandler: ISubmitToHostEventHandler): Unit
}

object InfoPathEditorObject {
  @scala.inline
  def apply(
    CloseDocument: () => Unit,
    DataConnectionBaseUrl: String,
    FlushDocument: () => Unit,
    Host: js.Any,
    HostName: String,
    InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject,
    Load: String => Unit,
    LoadFromStream: js.Any => Unit,
    NewFromSolution: String => Unit,
    NewFromSolutionWithData: (String, js.Any, Double) => Unit,
    SetInitEventHandler: IInitEventHandler => Unit,
    SetNotifyHostEventHandler: INotifyHostEventHandler => Unit,
    SetSubmitToHostEventHandler: ISubmitToHostEventHandler => Unit,
    XDocument: _XDocument
  ): InfoPathEditorObject = {
    val __obj = js.Dynamic.literal(CloseDocument = js.Any.fromFunction0(CloseDocument), DataConnectionBaseUrl = DataConnectionBaseUrl.asInstanceOf[js.Any], FlushDocument = js.Any.fromFunction0(FlushDocument), Host = Host.asInstanceOf[js.Any], HostName = HostName.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), LoadFromStream = js.Any.fromFunction1(LoadFromStream), NewFromSolution = js.Any.fromFunction1(NewFromSolution), NewFromSolutionWithData = js.Any.fromFunction3(NewFromSolutionWithData), SetInitEventHandler = js.Any.fromFunction1(SetInitEventHandler), SetNotifyHostEventHandler = js.Any.fromFunction1(SetNotifyHostEventHandler), SetSubmitToHostEventHandler = js.Any.fromFunction1(SetSubmitToHostEventHandler), XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.InfoPathEditorObject_typekey")(InfoPathDotInfoPathEditorObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoPathEditorObject]
  }
}

