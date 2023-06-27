package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilitiesAnalytics extends StObject {
  
  /**
  		 * Indicates if the feature service supports cache hint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var supportsCacheHint: Boolean
}
object CapabilitiesAnalytics {
  
  inline def apply(supportsCacheHint: Boolean): CapabilitiesAnalytics = {
    val __obj = js.Dynamic.literal(supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesAnalytics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilitiesAnalytics] (val x: Self) extends AnyVal {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
  }
}
