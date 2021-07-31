package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerGetFieldDomainOptions
  extends StObject
     with Object {
  
  /**
    * The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#getFieldDomain)
    */
  var feature: Graphic
}
object GeoJSONLayerGetFieldDomainOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoJSONLayerGetFieldDomainOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoJSONLayerGetFieldDomainOptions]
  }
  
  @scala.inline
  implicit class GeoJSONLayerGetFieldDomainOptionsMutableBuilder[Self <: GeoJSONLayerGetFieldDomainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
