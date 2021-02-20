package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncObject extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Name: String = js.native
  
  @JSName("Outlook.SyncObject_typekey")
  var OutlookDotSyncObject_typekey: SyncObject = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  def Start(): Unit = js.native
  
  def Stop(): Unit = js.native
}
object SyncObject {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotSyncObject_typekey: SyncObject,
    Parent: js.Any,
    Session: NameSpace,
    Start: () => Unit,
    Stop: () => Unit
  ): SyncObject = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Start = js.Any.fromFunction0(Start), Stop = js.Any.fromFunction0(Stop))
    __obj.updateDynamic("Outlook.SyncObject_typekey")(OutlookDotSyncObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncObject]
  }
  
  @scala.inline
  implicit class SyncObjectMutableBuilder[Self <: SyncObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotSyncObject_typekey(value: SyncObject): Self = StObject.set(x, "Outlook.SyncObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "Start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "Stop", js.Any.fromFunction0(value))
  }
}
