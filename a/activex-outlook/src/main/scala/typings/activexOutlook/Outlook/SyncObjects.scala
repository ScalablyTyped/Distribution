package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncObjects extends StObject {
  
  val AppFolders: SyncObject
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Item(Index: js.Any): SyncObject
  
  @JSName("Outlook.SyncObjects_typekey")
  var OutlookDotSyncObjects_typekey: SyncObjects
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object SyncObjects {
  
  @scala.inline
  def apply(
    AppFolders: SyncObject,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => SyncObject,
    OutlookDotSyncObjects_typekey: SyncObjects,
    Parent: js.Any,
    Session: NameSpace
  ): SyncObjects = {
    val __obj = js.Dynamic.literal(AppFolders = AppFolders.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SyncObjects_typekey")(OutlookDotSyncObjects_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncObjects]
  }
  
  @scala.inline
  implicit class SyncObjectsMutableBuilder[Self <: SyncObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppFolders(value: SyncObject): Self = StObject.set(x, "AppFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SyncObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotSyncObjects_typekey(value: SyncObjects): Self = StObject.set(x, "Outlook.SyncObjects_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
