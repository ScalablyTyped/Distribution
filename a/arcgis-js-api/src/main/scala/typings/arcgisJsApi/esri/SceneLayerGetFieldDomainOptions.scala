package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerGetFieldDomainOptions extends StObject {
  
  /**
  		 * The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldDomain)
  		 */
  var feature: Graphic
}
object SceneLayerGetFieldDomainOptions {
  
  inline def apply(feature: Graphic): SceneLayerGetFieldDomainOptions = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLayerGetFieldDomainOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneLayerGetFieldDomainOptions] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
