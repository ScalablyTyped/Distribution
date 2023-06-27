package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.FeatureLayerPropertiestyp
import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFormProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#disabled)
  		 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The associated feature containing the editable attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#feature)
  		 */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
  		 * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate)
  		 */
  var formTemplate: js.UndefOr[FormTemplateProperties] = js.undefined
  
  /**
  		 * Defines how groups will be displayed to the user.
  		 *
  		 * @default all
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#groupDisplay)
  		 */
  var groupDisplay: js.UndefOr[all | sequential] = js.undefined
  
  /**
  		 * Indicates the heading level to use for the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#title) of the form.
  		 *
  		 * @default 2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#headingLevel)
  		 */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Layer containing the editable feature attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#layer)
  		 */
  var layer: js.UndefOr[FeatureLayerPropertiestyp | typings.arcgisJsApi.anon.SubtypeSublayerProperties] = js.undefined
  
  /**
  		 * A reference to the associated [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#map)
  		 */
  var map: js.UndefOr[MapProperties] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/FeatureForm#map map} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#viewModel)
  		 */
  var viewModel: js.UndefOr[FeatureFormViewModelProperties] = js.undefined
}
object FeatureFormProperties {
  
  inline def apply(): FeatureFormProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFormProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureFormProperties] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFeature(value: GraphicProperties): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setFormTemplate(value: FormTemplateProperties): Self = StObject.set(x, "formTemplate", value.asInstanceOf[js.Any])
    
    inline def setFormTemplateUndefined: Self = StObject.set(x, "formTemplate", js.undefined)
    
    inline def setGroupDisplay(value: all | sequential): Self = StObject.set(x, "groupDisplay", value.asInstanceOf[js.Any])
    
    inline def setGroupDisplayUndefined: Self = StObject.set(x, "groupDisplay", js.undefined)
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setLayer(value: FeatureLayerPropertiestyp | typings.arcgisJsApi.anon.SubtypeSublayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setMap(value: MapProperties): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: FeatureFormViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
