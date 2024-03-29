package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlookBarShortcut extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Name: String
  
  /* private */ @JSName("Outlook.OutlookBarShortcut_typekey")
  var OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut
  
  val Parent: Any
  
  val Session: NameSpace
  
  def SetIcon(Icon: Any): Unit
  
  val Target: Any
}
object OutlookBarShortcut {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut,
    Parent: Any,
    Session: NameSpace,
    SetIcon: Any => Unit,
    Target: Any
  ): OutlookBarShortcut = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetIcon = js.Any.fromFunction1(SetIcon), Target = Target.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarShortcut_typekey")(OutlookDotOutlookBarShortcut_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarShortcut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlookBarShortcut] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOutlookBarShortcut_typekey(value: OutlookBarShortcut): Self = StObject.set(x, "Outlook.OutlookBarShortcut_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSetIcon(value: Any => Unit): Self = StObject.set(x, "SetIcon", js.Any.fromFunction1(value))
    
    inline def setTarget(value: Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
