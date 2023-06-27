package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RampTitle extends StObject {
  
  /**
  		 * The field name used in a visual variable of a renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
  		 */
  var field: String
  
  /**
  		 * If provided, the normalization field name used in a visual variable of a renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
  		 */
  var normField: String
  
  /**
  		 * If `true`, the legend formats to display the field and normalization field as a ratio.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
  		 */
  var ratio: Boolean
  
  /**
  		 * If `true`, the legend formats to display the field and normalization field as a percentage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
  		 */
  var ratioPercent: Boolean
  
  /**
  		 * If `true`, the legend formats to display the field and normalization field as a percentage of total.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
  		 */
  var ratioPercentTotal: Boolean
}
object RampTitle {
  
  inline def apply(
    field: String,
    normField: String,
    ratio: Boolean,
    ratioPercent: Boolean,
    ratioPercentTotal: Boolean
  ): RampTitle = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], normField = normField.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], ratioPercent = ratioPercent.asInstanceOf[js.Any], ratioPercentTotal = ratioPercentTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RampTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RampTitle] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setNormField(value: String): Self = StObject.set(x, "normField", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: Boolean): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioPercent(value: Boolean): Self = StObject.set(x, "ratioPercent", value.asInstanceOf[js.Any])
    
    inline def setRatioPercentTotal(value: Boolean): Self = StObject.set(x, "ratioPercentTotal", value.asInstanceOf[js.Any])
  }
}
