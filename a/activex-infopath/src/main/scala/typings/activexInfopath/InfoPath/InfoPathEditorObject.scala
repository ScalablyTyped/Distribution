package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoPathEditorObject extends StObject {
  
  def CloseDocument(): Unit
  
  var DataConnectionBaseUrl: String
  
  def FlushDocument(): Unit
  
  var Host: Any
  
  var HostName: String
  
  /* private */ @JSName("InfoPath.InfoPathEditorObject_typekey")
  var InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject
  
  def Load(bstrURL: String): Unit
  
  def LoadFromStream(punkStream: Any): Unit
  
  def NewFromSolution(bstrSolutionURI: String): Unit
  
  def NewFromSolutionWithData(bstrURLXSN: String, punkStream: Any, dwBehavior: Double): Unit
  
  def SetInitEventHandler(handler: IInitEventHandler): Unit
  
  def SetNotifyHostEventHandler(pHandler: INotifyHostEventHandler): Unit
  
  def SetSubmitToHostEventHandler(pHandler: ISubmitToHostEventHandler): Unit
  
  val XDocument: _XDocument
}
object InfoPathEditorObject {
  
  inline def apply(
    CloseDocument: () => Unit,
    DataConnectionBaseUrl: String,
    FlushDocument: () => Unit,
    Host: Any,
    HostName: String,
    InfoPathDotInfoPathEditorObject_typekey: InfoPathEditorObject,
    Load: String => Unit,
    LoadFromStream: Any => Unit,
    NewFromSolution: String => Unit,
    NewFromSolutionWithData: (String, Any, Double) => Unit,
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
  implicit open class MutableBuilder[Self <: InfoPathEditorObject] (val x: Self) extends AnyVal {
    
    inline def setCloseDocument(value: () => Unit): Self = StObject.set(x, "CloseDocument", js.Any.fromFunction0(value))
    
    inline def setDataConnectionBaseUrl(value: String): Self = StObject.set(x, "DataConnectionBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setFlushDocument(value: () => Unit): Self = StObject.set(x, "FlushDocument", js.Any.fromFunction0(value))
    
    inline def setHost(value: Any): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostName(value: String): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotInfoPathEditorObject_typekey(value: InfoPathEditorObject): Self = StObject.set(x, "InfoPath.InfoPathEditorObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => Unit): Self = StObject.set(x, "Load", js.Any.fromFunction1(value))
    
    inline def setLoadFromStream(value: Any => Unit): Self = StObject.set(x, "LoadFromStream", js.Any.fromFunction1(value))
    
    inline def setNewFromSolution(value: String => Unit): Self = StObject.set(x, "NewFromSolution", js.Any.fromFunction1(value))
    
    inline def setNewFromSolutionWithData(value: (String, Any, Double) => Unit): Self = StObject.set(x, "NewFromSolutionWithData", js.Any.fromFunction3(value))
    
    inline def setSetInitEventHandler(value: IInitEventHandler => Unit): Self = StObject.set(x, "SetInitEventHandler", js.Any.fromFunction1(value))
    
    inline def setSetNotifyHostEventHandler(value: INotifyHostEventHandler => Unit): Self = StObject.set(x, "SetNotifyHostEventHandler", js.Any.fromFunction1(value))
    
    inline def setSetSubmitToHostEventHandler(value: ISubmitToHostEventHandler => Unit): Self = StObject.set(x, "SetSubmitToHostEventHandler", js.Any.fromFunction1(value))
    
    inline def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
