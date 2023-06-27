package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaultsAttachments extends StObject {
  
  /**
  		 * The capabilities needed for the attachments widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
  		 */
  var capabilities: js.UndefOr[AttachmentsCapabilities] = js.undefined
  
  /**
  		 * String indicating how to [display](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#displayType) the attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
  		 */
  var displayType: js.UndefOr[String] = js.undefined
}
object SupportingWidgetDefaultsAttachments {
  
  inline def apply(): SupportingWidgetDefaultsAttachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportingWidgetDefaultsAttachments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportingWidgetDefaultsAttachments] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: AttachmentsCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setDisplayType(value: String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
  }
}
