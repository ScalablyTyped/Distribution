package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileLineQueryProperties
  extends StObject
     with ElevationProfileLineProperties {
  
  /**
    * Elevation source used to sample elevation when generating the profile, for example an [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html#source)
    */
  var source: js.UndefOr[ElevationProfileLineQuerySource] = js.undefined
}
object ElevationProfileLineQueryProperties {
  
  inline def apply(): ElevationProfileLineQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationProfileLineQueryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileLineQueryProperties] (val x: Self) extends AnyVal {
    
    inline def setSource(value: ElevationProfileLineQuerySource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
