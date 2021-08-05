package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val CategoryBorderColor: OLE_COLOR
  
  val CategoryGradientBottomColor: OLE_COLOR
  
  val CategoryGradientTopColor: OLE_COLOR
  
  val CategoryID: String
  
  val Class: OlObjectClass
  
  var Color: OlCategoryColor
  
  var Name: String
  
  /* private */ @JSName("Outlook.Category_typekey")
  var OutlookDotCategory_typekey: Category
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  var ShortcutKey: OlCategoryShortcutKey
}
object Category {
  
  inline def apply(
    Application: Application,
    CategoryBorderColor: OLE_COLOR,
    CategoryGradientBottomColor: OLE_COLOR,
    CategoryGradientTopColor: OLE_COLOR,
    CategoryID: String,
    Class: OlObjectClass,
    Color: OlCategoryColor,
    Name: String,
    OutlookDotCategory_typekey: Category,
    Parent: js.Any,
    Session: NameSpace,
    ShortcutKey: OlCategoryShortcutKey
  ): Category = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CategoryBorderColor = CategoryBorderColor.asInstanceOf[js.Any], CategoryGradientBottomColor = CategoryGradientBottomColor.asInstanceOf[js.Any], CategoryGradientTopColor = CategoryGradientTopColor.asInstanceOf[js.Any], CategoryID = CategoryID.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShortcutKey = ShortcutKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Category_typekey")(OutlookDotCategory_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategoryBorderColor(value: OLE_COLOR): Self = StObject.set(x, "CategoryBorderColor", value.asInstanceOf[js.Any])
    
    inline def setCategoryGradientBottomColor(value: OLE_COLOR): Self = StObject.set(x, "CategoryGradientBottomColor", value.asInstanceOf[js.Any])
    
    inline def setCategoryGradientTopColor(value: OLE_COLOR): Self = StObject.set(x, "CategoryGradientTopColor", value.asInstanceOf[js.Any])
    
    inline def setCategoryID(value: String): Self = StObject.set(x, "CategoryID", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setColor(value: OlCategoryColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotCategory_typekey(value: Category): Self = StObject.set(x, "Outlook.Category_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setShortcutKey(value: OlCategoryShortcutKey): Self = StObject.set(x, "ShortcutKey", value.asInstanceOf[js.Any])
  }
}
