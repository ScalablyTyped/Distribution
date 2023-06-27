package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SublayerGetFieldDomainOptions extends StObject {
  
  /**
  		 * The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#getFieldDomain)
  		 */
  var feature: Graphic
}
object SublayerGetFieldDomainOptions {
  
  inline def apply(feature: Graphic): SublayerGetFieldDomainOptions = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SublayerGetFieldDomainOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SublayerGetFieldDomainOptions] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
