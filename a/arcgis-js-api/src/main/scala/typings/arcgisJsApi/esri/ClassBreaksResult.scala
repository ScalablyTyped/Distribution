package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassBreaksResult extends StObject {
  
  /**
  		 * An array of objects describing the class breaks generated from the [classBreaks()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#classBreaks) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
  		 */
  var classBreakInfos: js.Array[ClassBreak]
  
  /**
  		 * The maximum value of features in the dataset.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
  		 */
  var maxValue: Double
  
  /**
  		 * The minimum value of features in the dataset.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
  		 */
  var minValue: Double
  
  /**
  		 * The normalization total if `normalizationType` is set to `percent-of-total` when generating class breaks with [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
  		 */
  var normalizationTotal: Double
}
object ClassBreaksResult {
  
  inline def apply(
    classBreakInfos: js.Array[ClassBreak],
    maxValue: Double,
    minValue: Double,
    normalizationTotal: Double
  ): ClassBreaksResult = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], normalizationTotal = normalizationTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBreaksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassBreaksResult] (val x: Self) extends AnyVal {
    
    inline def setClassBreakInfos(value: js.Array[ClassBreak]): Self = StObject.set(x, "classBreakInfos", value.asInstanceOf[js.Any])
    
    inline def setClassBreakInfosVarargs(value: ClassBreak*): Self = StObject.set(x, "classBreakInfos", js.Array(value*))
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setNormalizationTotal(value: Double): Self = StObject.set(x, "normalizationTotal", value.asInstanceOf[js.Any])
  }
}
