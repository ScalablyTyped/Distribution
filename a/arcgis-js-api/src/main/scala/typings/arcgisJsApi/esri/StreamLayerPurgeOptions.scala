package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamLayerPurgeOptions extends Object {
  
  /**
    * Specifies the maximum age of a feature in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var age: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the maximum age of a feature in minutes since it arrived in the application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var ageReceived: js.UndefOr[Double] = js.native
  
  /**
    * Controls the overall maximum number of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var displayCount: js.UndefOr[Double] = js.native
  
  /**
    * Controls the maximum number of observations to show within a [track](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var maxObservations: js.UndefOr[Double] = js.native
}
object StreamLayerPurgeOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StreamLayerPurgeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[StreamLayerPurgeOptions]
  }
  
  @scala.inline
  implicit class StreamLayerPurgeOptionsMutableBuilder[Self <: StreamLayerPurgeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeReceived(value: Double): Self = StObject.set(x, "ageReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeReceivedUndefined: Self = StObject.set(x, "ageReceived", js.undefined)
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    @scala.inline
    def setDisplayCount(value: Double): Self = StObject.set(x, "displayCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayCountUndefined: Self = StObject.set(x, "displayCount", js.undefined)
    
    @scala.inline
    def setMaxObservations(value: Double): Self = StObject.set(x, "maxObservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxObservationsUndefined: Self = StObject.set(x, "maxObservations", js.undefined)
  }
}
