package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingComponentSublayerGetFieldDomainOptions extends StObject {
  
  /**
    * The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#getFieldDomain)
    */
  var feature: Graphic
}
object BuildingComponentSublayerGetFieldDomainOptions {
  
  inline def apply(feature: Graphic): BuildingComponentSublayerGetFieldDomainOptions = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingComponentSublayerGetFieldDomainOptions]
  }
  
  extension [Self <: BuildingComponentSublayerGetFieldDomainOptions](x: Self) {
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
