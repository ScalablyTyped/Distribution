package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflict extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Item: js.Any
  
  val Name: String
  
  /* private */ @JSName("Outlook.Conflict_typekey")
  var OutlookDotConflict_typekey: Conflict
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  val Type: OlObjectClass
}
object Conflict {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Item: js.Any,
    Name: String,
    OutlookDotConflict_typekey: Conflict,
    Parent: js.Any,
    Session: NameSpace,
    Type: OlObjectClass
  ): Conflict = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Conflict_typekey")(OutlookDotConflict_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
  
  extension [Self <: Conflict](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotConflict_typekey(value: Conflict): Self = StObject.set(x, "Outlook.Conflict_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setType(value: OlObjectClass): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
