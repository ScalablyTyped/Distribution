package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLayerPurgeOptions extends StObject {
  
  /**
  		 * Specifies the maximum age of a feature in minutes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
  		 */
  var age: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specifies the maximum age of a feature in minutes since it arrived in the application.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
  		 */
  var ageReceived: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Controls the overall maximum number of features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
  		 */
  var displayCount: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Controls the maximum number of observations to show within a [track](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
  		 */
  var maxObservations: js.UndefOr[Double] = js.undefined
}
object StreamLayerPurgeOptions {
  
  inline def apply(): StreamLayerPurgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLayerPurgeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamLayerPurgeOptions] (val x: Self) extends AnyVal {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeReceived(value: Double): Self = StObject.set(x, "ageReceived", value.asInstanceOf[js.Any])
    
    inline def setAgeReceivedUndefined: Self = StObject.set(x, "ageReceived", js.undefined)
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setDisplayCount(value: Double): Self = StObject.set(x, "displayCount", value.asInstanceOf[js.Any])
    
    inline def setDisplayCountUndefined: Self = StObject.set(x, "displayCount", js.undefined)
    
    inline def setMaxObservations(value: Double): Self = StObject.set(x, "maxObservations", value.asInstanceOf[js.Any])
    
    inline def setMaxObservationsUndefined: Self = StObject.set(x, "maxObservations", js.undefined)
  }
}
