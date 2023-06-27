package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaultsFeatureForm extends StObject {
  
  /**
  		 * String indicating the [groupDisplay](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#groupDisplay) and how they will be displayed to the end user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
  		 */
  var groupDisplay: js.UndefOr[String] = js.undefined
}
object SupportingWidgetDefaultsFeatureForm {
  
  inline def apply(): SupportingWidgetDefaultsFeatureForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportingWidgetDefaultsFeatureForm] (val x: Self) extends AnyVal {
    
    inline def setGroupDisplay(value: String): Self = StObject.set(x, "groupDisplay", value.asInstanceOf[js.Any])
    
    inline def setGroupDisplayUndefined: Self = StObject.set(x, "groupDisplay", js.undefined)
  }
}
