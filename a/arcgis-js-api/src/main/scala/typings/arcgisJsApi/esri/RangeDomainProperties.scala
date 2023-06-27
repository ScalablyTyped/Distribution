package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeDomainProperties
  extends StObject
     with DomainProperties {
  
  /**
  		 * The maximum valid value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue)
  		 */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum valid value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue)
  		 */
  var minValue: js.UndefOr[Double] = js.undefined
}
object RangeDomainProperties {
  
  inline def apply(): RangeDomainProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeDomainProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeDomainProperties] (val x: Self) extends AnyVal {
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
