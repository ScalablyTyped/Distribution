package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkAssociationsVisibleElements extends StObject {
  
  /**
    * Indicates whether to display a slider that adjusts the [maxAllowableAssociations](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#maxAllowableAssociations).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkAssociations.html#VisibleElements)
    */
  var maxAllowableAssociationsSlider: Boolean
}
object UtilityNetworkAssociationsVisibleElements {
  
  inline def apply(maxAllowableAssociationsSlider: Boolean): UtilityNetworkAssociationsVisibleElements = {
    val __obj = js.Dynamic.literal(maxAllowableAssociationsSlider = maxAllowableAssociationsSlider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilityNetworkAssociationsVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkAssociationsVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setMaxAllowableAssociationsSlider(value: Boolean): Self = StObject.set(x, "maxAllowableAssociationsSlider", value.asInstanceOf[js.Any])
  }
}
