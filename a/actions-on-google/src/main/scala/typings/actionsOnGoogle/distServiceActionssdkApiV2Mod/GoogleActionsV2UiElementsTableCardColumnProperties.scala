package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsTableCardColumnProperties extends StObject {
  
  /**
    * Header text for the column.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * Horizontal alignment of content w.r.t column. If unspecified, content
    * will be aligned to the leading edge.
    */
  var horizontalAlignment: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.undefined
}
object GoogleActionsV2UiElementsTableCardColumnProperties {
  
  inline def apply(): GoogleActionsV2UiElementsTableCardColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardColumnProperties]
  }
  
  extension [Self <: GoogleActionsV2UiElementsTableCardColumnProperties](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHorizontalAlignment(value: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
