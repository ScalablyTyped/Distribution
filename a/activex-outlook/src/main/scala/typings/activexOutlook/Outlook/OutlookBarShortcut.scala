package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarShortcut extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.OutlookBarShortcut_typekey")
  var OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  def SetIcon(Icon: js.Any): Unit = js.native
  
  val Target: js.Any = js.native
}
object OutlookBarShortcut {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut,
    Parent: js.Any,
    Session: NameSpace,
    SetIcon: js.Any => Unit,
    Target: js.Any
  ): OutlookBarShortcut = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetIcon = js.Any.fromFunction1(SetIcon), Target = Target.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarShortcut_typekey")(OutlookDotOutlookBarShortcut_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarShortcut]
  }
  
  @scala.inline
  implicit class OutlookBarShortcutMutableBuilder[Self <: OutlookBarShortcut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOutlookBarShortcut_typekey(value: OutlookBarShortcut): Self = StObject.set(x, "Outlook.OutlookBarShortcut_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIcon(value: js.Any => Unit): Self = StObject.set(x, "SetIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
