package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerGetFieldDomainOptions extends StObject {
  
  /**
    * The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#getFieldDomain)
    */
  var feature: Graphic
}
object SubtypeGroupLayerGetFieldDomainOptions {
  
  inline def apply(feature: Graphic): SubtypeGroupLayerGetFieldDomainOptions = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerGetFieldDomainOptions]
  }
  
  extension [Self <: SubtypeGroupLayerGetFieldDomainOptions](x: Self) {
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
