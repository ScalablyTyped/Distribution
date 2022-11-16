package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ActionButtonPropertiestyp
import typings.arcgisJsApi.anon.ActionTogglePropertiestyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupTemplateProperties extends StObject {
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#actions)
    */
  var actions: js.UndefOr[CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]] = js.undefined
  
  /**
    * The template for defining and formatting a popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content)
    */
  var content: js.UndefOr[js.Array[ContentProperties] | String | js.Function | js.Promise[Any]] = js.undefined
  
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions following the specification defined by the [Arcade Popup Profile](https://developers.arcgis.com/javascript/latest/arcade/#popup).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#expressionInfos)
    */
  var expressionInfos: js.UndefOr[js.Array[popupExpressionInfoProperties]] = js.undefined
  
  /**
    * An array of [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) that defines how fields in the dataset or values from [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions participate in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos)
    */
  var fieldInfos: js.UndefOr[js.Array[FieldInfoProperties]] = js.undefined
  
  /**
    * Indicates whether or not editor tracking should display.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#lastEditInfoEnabled)
    */
  var lastEditInfoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional options that can be defined for the popup layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#layerOptions)
    */
  var layerOptions: js.UndefOr[LayerOptionsProperties] = js.undefined
  
  /**
    * An array of field names used in the PopupTemplate.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether actions should replace existing [popup actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#overwriteActions)
    */
  var overwriteActions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to include the feature's geometry for use by the template.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The template for defining how to format the title used in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#title)
    */
  var title: js.UndefOr[String | js.Function | js.Promise[Any]] = js.undefined
}
object PopupTemplateProperties {
  
  inline def apply(): PopupTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupTemplateProperties]
  }
  
  extension [Self <: PopupTemplateProperties](x: Self) {
    
    inline def setActions(value: CollectionProperties[ActionButtonPropertiestyp | ActionTogglePropertiestyp]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (ActionButtonPropertiestyp | ActionTogglePropertiestyp)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setContent(value: js.Array[ContentProperties] | String | js.Function | js.Promise[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: ContentProperties*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setExpressionInfos(value: js.Array[popupExpressionInfoProperties]): Self = StObject.set(x, "expressionInfos", value.asInstanceOf[js.Any])
    
    inline def setExpressionInfosUndefined: Self = StObject.set(x, "expressionInfos", js.undefined)
    
    inline def setExpressionInfosVarargs(value: popupExpressionInfoProperties*): Self = StObject.set(x, "expressionInfos", js.Array(value*))
    
    inline def setFieldInfos(value: js.Array[FieldInfoProperties]): Self = StObject.set(x, "fieldInfos", value.asInstanceOf[js.Any])
    
    inline def setFieldInfosUndefined: Self = StObject.set(x, "fieldInfos", js.undefined)
    
    inline def setFieldInfosVarargs(value: FieldInfoProperties*): Self = StObject.set(x, "fieldInfos", js.Array(value*))
    
    inline def setLastEditInfoEnabled(value: Boolean): Self = StObject.set(x, "lastEditInfoEnabled", value.asInstanceOf[js.Any])
    
    inline def setLastEditInfoEnabledUndefined: Self = StObject.set(x, "lastEditInfoEnabled", js.undefined)
    
    inline def setLayerOptions(value: LayerOptionsProperties): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    inline def setLayerOptionsUndefined: Self = StObject.set(x, "layerOptions", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setOverwriteActions(value: Boolean): Self = StObject.set(x, "overwriteActions", value.asInstanceOf[js.Any])
    
    inline def setOverwriteActionsUndefined: Self = StObject.set(x, "overwriteActions", js.undefined)
    
    inline def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    inline def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    inline def setTitle(value: String | js.Function | js.Promise[Any]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
