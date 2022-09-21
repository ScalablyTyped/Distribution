package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlookBarGroup extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Name: String
  
  /* private */ @JSName("Outlook.OutlookBarGroup_typekey")
  var OutlookDotOutlookBarGroup_typekey: OutlookBarGroup
  
  val Parent: Any
  
  val Session: NameSpace
  
  val Shortcuts: OutlookBarShortcuts
  
  var ViewType: OlOutlookBarViewType
}
object OutlookBarGroup {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarGroup_typekey: OutlookBarGroup,
    Parent: Any,
    Session: NameSpace,
    Shortcuts: OutlookBarShortcuts,
    ViewType: OlOutlookBarViewType
  ): OutlookBarGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Shortcuts = Shortcuts.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarGroup_typekey")(OutlookDotOutlookBarGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarGroup]
  }
  
  extension [Self <: OutlookBarGroup](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOutlookBarGroup_typekey(value: OutlookBarGroup): Self = StObject.set(x, "Outlook.OutlookBarGroup_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setShortcuts(value: OutlookBarShortcuts): Self = StObject.set(x, "Shortcuts", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: OlOutlookBarViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
  }
}
