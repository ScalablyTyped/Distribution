package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableViewModelProperties extends StObject {
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#attachmentsEnabled)
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of individual configuration objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#fieldConfigs)
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.undefined
  
  /**
    * A collection of fields to remain hidden within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#hiddenFields)
    */
  var hiddenFields: js.UndefOr[CollectionProperties[String]] = js.undefined
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object FeatureTableViewModelProperties {
  
  @scala.inline
  def apply(): FeatureTableViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableViewModelProperties]
  }
  
  @scala.inline
  implicit class FeatureTableViewModelPropertiesMutableBuilder[Self <: FeatureTableViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentsEnabled(value: Boolean): Self = StObject.set(x, "attachmentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsEnabledUndefined: Self = StObject.set(x, "attachmentsEnabled", js.undefined)
    
    @scala.inline
    def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    @scala.inline
    def setFieldConfigs(value: js.Array[FieldColumnConfigProperties]): Self = StObject.set(x, "fieldConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldConfigsUndefined: Self = StObject.set(x, "fieldConfigs", js.undefined)
    
    @scala.inline
    def setFieldConfigsVarargs(value: FieldColumnConfigProperties*): Self = StObject.set(x, "fieldConfigs", js.Array(value :_*))
    
    @scala.inline
    def setHiddenFields(value: CollectionProperties[String]): Self = StObject.set(x, "hiddenFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenFieldsUndefined: Self = StObject.set(x, "hiddenFields", js.undefined)
    
    @scala.inline
    def setHiddenFieldsVarargs(value: String*): Self = StObject.set(x, "hiddenFields", js.Array(value :_*))
    
    @scala.inline
    def setHighlightOnRowSelectEnabled(value: Boolean): Self = StObject.set(x, "highlightOnRowSelectEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightOnRowSelectEnabledUndefined: Self = StObject.set(x, "highlightOnRowSelectEnabled", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
