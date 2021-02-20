package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupTemplateProperties extends StObject {
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or [action toggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#actions)
    */
  var actions: js.UndefOr[CollectionProperties[ActionButtonProperties | ActionToggleProperties]] = js.native
  
  /**
    * The template for defining and formatting a popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content)
    */
  var content: js.UndefOr[js.Array[ContentProperties] | String | js.Function | js.Promise[_]] = js.native
  
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#expressionInfos)
    */
  var expressionInfos: js.UndefOr[js.Array[popupExpressionInfoProperties]] = js.native
  
  /**
    * An array of [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) that defines how fields in the dataset or values from [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions participate in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos)
    */
  var fieldInfos: js.UndefOr[js.Array[FieldInfoProperties]] = js.native
  
  /**
    * Indicates whether or not editor tracking should display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#lastEditInfoEnabled)
    */
  var lastEditInfoEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional options that can be defined for the popup layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#layerOptions)
    */
  var layerOptions: js.UndefOr[LayerOptionsProperties] = js.native
  
  /**
    * An array of field names used in the PopupTemplate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether actions should replace existing [popup actions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#actions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#overwriteActions)
    */
  var overwriteActions: js.UndefOr[Boolean] = js.native
  
  /**
    * The `RelatedRecordsInfo` class provides additional sorting options when working with related records in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#relatedRecordsInfo)
    */
  var relatedRecordsInfo: js.UndefOr[RelatedRecordsInfoProperties] = js.native
  
  /**
    * The template for defining how to format the title used in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#title)
    */
  var title: js.UndefOr[String | js.Function | js.Promise[_]] = js.native
}
object PopupTemplateProperties {
  
  @scala.inline
  def apply(): PopupTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupTemplateProperties]
  }
  
  @scala.inline
  implicit class PopupTemplatePropertiesMutableBuilder[Self <: PopupTemplateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: CollectionProperties[ActionButtonProperties | ActionToggleProperties]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: (ActionButtonProperties | ActionToggleProperties)*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[ContentProperties] | String | js.Function | js.Promise[_]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: ContentProperties*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setExpressionInfos(value: js.Array[popupExpressionInfoProperties]): Self = StObject.set(x, "expressionInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionInfosUndefined: Self = StObject.set(x, "expressionInfos", js.undefined)
    
    @scala.inline
    def setExpressionInfosVarargs(value: popupExpressionInfoProperties*): Self = StObject.set(x, "expressionInfos", js.Array(value :_*))
    
    @scala.inline
    def setFieldInfos(value: js.Array[FieldInfoProperties]): Self = StObject.set(x, "fieldInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldInfosUndefined: Self = StObject.set(x, "fieldInfos", js.undefined)
    
    @scala.inline
    def setFieldInfosVarargs(value: FieldInfoProperties*): Self = StObject.set(x, "fieldInfos", js.Array(value :_*))
    
    @scala.inline
    def setLastEditInfoEnabled(value: Boolean): Self = StObject.set(x, "lastEditInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEditInfoEnabledUndefined: Self = StObject.set(x, "lastEditInfoEnabled", js.undefined)
    
    @scala.inline
    def setLayerOptions(value: LayerOptionsProperties): Self = StObject.set(x, "layerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerOptionsUndefined: Self = StObject.set(x, "layerOptions", js.undefined)
    
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value :_*))
    
    @scala.inline
    def setOverwriteActions(value: Boolean): Self = StObject.set(x, "overwriteActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteActionsUndefined: Self = StObject.set(x, "overwriteActions", js.undefined)
    
    @scala.inline
    def setRelatedRecordsInfo(value: RelatedRecordsInfoProperties): Self = StObject.set(x, "relatedRecordsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedRecordsInfoUndefined: Self = StObject.set(x, "relatedRecordsInfo", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Function | js.Promise[_]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
