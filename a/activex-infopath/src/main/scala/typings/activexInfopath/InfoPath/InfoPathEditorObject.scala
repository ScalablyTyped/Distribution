package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoPathEditorObject extends js.Object {
  
  def CloseDocument(): Unit = js.native
  
  var DataConnectionBaseUrl: String = js.native
  
  def FlushDocument(): Unit = js.native
  
  var Host: js.Any = js.native
  
  var HostName: String = js.native
  
  @JSName("InfoPath.InfoPathEditorObject_typekey")
  var InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject = js.native
  
  def Load(bstrURL: String): Unit = js.native
  
  def LoadFromStream(punkStream: js.Any): Unit = js.native
  
  def NewFromSolution(bstrSolutionURI: String): Unit = js.native
  
  def NewFromSolutionWithData(bstrURLXSN: String, punkStream: js.Any, dwBehavior: Double): Unit = js.native
  
  def SetInitEventHandler(handler: IInitEventHandler): Unit = js.native
  
  def SetNotifyHostEventHandler(pHandler: INotifyHostEventHandler): Unit = js.native
  
  def SetSubmitToHostEventHandler(pHandler: ISubmitToHostEventHandler): Unit = js.native
  
  val XDocument: _XDocument = js.native
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
  
  @scala.inline
  implicit class InfoPathEditorObjectOps[Self <: InfoPathEditorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloseDocument(value: () => Unit): Self = this.set("CloseDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataConnectionBaseUrl(value: String): Self = this.set("DataConnectionBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushDocument(value: () => Unit): Self = this.set("FlushDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHost(value: js.Any): Self = this.set("Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: String): Self = this.set("HostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotInfoPathEditorObject_typekey(value: InfoPathEditorObject): Self = this.set("InfoPath.InfoPathEditorObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("Load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadFromStream(value: js.Any => Unit): Self = this.set("LoadFromStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewFromSolution(value: String => Unit): Self = this.set("NewFromSolution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewFromSolutionWithData(value: (String, js.Any, Double) => Unit): Self = this.set("NewFromSolutionWithData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetInitEventHandler(value: IInitEventHandler => Unit): Self = this.set("SetInitEventHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotifyHostEventHandler(value: INotifyHostEventHandler => Unit): Self = this.set("SetNotifyHostEventHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubmitToHostEventHandler(value: ISubmitToHostEventHandler => Unit): Self = this.set("SetSubmitToHostEventHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
  }
}
