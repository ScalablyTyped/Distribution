package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsTableCardColumnProperties extends StObject {
  
  /**
    * Header text for the column.
    */
  var header: js.UndefOr[String] = js.native
  
  /**
    * Horizontal alignment of content w.r.t column. If unspecified, content
    * will be aligned to the leading edge.
    */
  var horizontalAlignment: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.native
}
object GoogleActionsV2UiElementsTableCardColumnProperties {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsTableCardColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardColumnProperties]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsTableCardColumnPropertiesMutableBuilder[Self <: GoogleActionsV2UiElementsTableCardColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
