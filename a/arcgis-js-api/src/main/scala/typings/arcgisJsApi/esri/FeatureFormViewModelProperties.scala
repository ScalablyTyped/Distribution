package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.FeatureLayerPropertiestyp
import typings.arcgisJsApi.anon.SceneLayerPropertiestypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFormViewModelProperties extends StObject {
  
  /**
  		 * The associated feature containing the editable attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#feature)
  		 */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
  		 * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#formTemplate)
  		 */
  var formTemplate: js.UndefOr[FormTemplateProperties] = js.undefined
  
  /**
  		 * Layer containing the editable feature attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#layer)
  		 */
  var layer: js.UndefOr[
    FeatureLayerPropertiestyp | SceneLayerPropertiestypes | typings.arcgisJsApi.anon.SubtypeSublayerProperties
  ] = js.undefined
  
  /**
  		 * A reference to the associated [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#map)
  		 */
  var map: js.UndefOr[MapProperties] = js.undefined
  
  /**
  		 * Indicates if the field's value can be submitted without introducing data validation issues.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#submittable)
  		 */
  var submittable: js.UndefOr[Boolean] = js.undefined
}
object FeatureFormViewModelProperties {
  
  inline def apply(): FeatureFormViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFormViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureFormViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: GraphicProperties): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setFormTemplate(value: FormTemplateProperties): Self = StObject.set(x, "formTemplate", value.asInstanceOf[js.Any])
    
    inline def setFormTemplateUndefined: Self = StObject.set(x, "formTemplate", js.undefined)
    
    inline def setLayer(
      value: FeatureLayerPropertiestyp | SceneLayerPropertiestypes | typings.arcgisJsApi.anon.SubtypeSublayerProperties
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setMap(value: MapProperties): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setSubmittable(value: Boolean): Self = StObject.set(x, "submittable", value.asInstanceOf[js.Any])
    
    inline def setSubmittableUndefined: Self = StObject.set(x, "submittable", js.undefined)
  }
}
