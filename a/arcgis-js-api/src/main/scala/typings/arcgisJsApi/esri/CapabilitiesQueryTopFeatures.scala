package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilitiesQueryTopFeatures extends StObject {
  
  /**
    * Indicates if the [top query operation](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) supports a cache hint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsCacheHint: Boolean
}
object CapabilitiesQueryTopFeatures {
  
  inline def apply(supportsCacheHint: Boolean): CapabilitiesQueryTopFeatures = {
    val __obj = js.Dynamic.literal(supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesQueryTopFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilitiesQueryTopFeatures] (val x: Self) extends AnyVal {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
  }
}
