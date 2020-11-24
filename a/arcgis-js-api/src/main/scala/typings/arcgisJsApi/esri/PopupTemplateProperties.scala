package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupTemplateProperties extends js.Object {
  
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
  implicit class PopupTemplatePropertiesOps[Self <: PopupTemplateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: (ActionButtonProperties | ActionToggleProperties)*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: CollectionProperties[ActionButtonProperties | ActionToggleProperties]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: ContentProperties*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[ContentProperties] | String | js.Function | js.Promise[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setExpressionInfosVarargs(value: popupExpressionInfoProperties*): Self = this.set("expressionInfos", js.Array(value :_*))
    
    @scala.inline
    def setExpressionInfos(value: js.Array[popupExpressionInfoProperties]): Self = this.set("expressionInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionInfos: Self = this.set("expressionInfos", js.undefined)
    
    @scala.inline
    def setFieldInfosVarargs(value: FieldInfoProperties*): Self = this.set("fieldInfos", js.Array(value :_*))
    
    @scala.inline
    def setFieldInfos(value: js.Array[FieldInfoProperties]): Self = this.set("fieldInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldInfos: Self = this.set("fieldInfos", js.undefined)
    
    @scala.inline
    def setLastEditInfoEnabled(value: Boolean): Self = this.set("lastEditInfoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEditInfoEnabled: Self = this.set("lastEditInfoEnabled", js.undefined)
    
    @scala.inline
    def setLayerOptions(value: LayerOptionsProperties): Self = this.set("layerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerOptions: Self = this.set("layerOptions", js.undefined)
    
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
    
    @scala.inline
    def setOverwriteActions(value: Boolean): Self = this.set("overwriteActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteActions: Self = this.set("overwriteActions", js.undefined)
    
    @scala.inline
    def setRelatedRecordsInfo(value: RelatedRecordsInfoProperties): Self = this.set("relatedRecordsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedRecordsInfo: Self = this.set("relatedRecordsInfo", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Function | js.Promise[_]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
