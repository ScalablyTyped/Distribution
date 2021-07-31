package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlCategoryColor
import typings.activexOutlook.Outlook.OlCategoryShortcutKey
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexStdole.stdole.OLE_COLOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Category")
@js.native
class Category protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Category {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val CategoryBorderColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  override val CategoryGradientBottomColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  override val CategoryGradientTopColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  override val CategoryID: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var Color: OlCategoryColor = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Category_typekey")
  var OutlookDotCategory_typekey: typings.activexOutlook.Outlook.Category = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShortcutKey: OlCategoryShortcutKey = js.native
}
