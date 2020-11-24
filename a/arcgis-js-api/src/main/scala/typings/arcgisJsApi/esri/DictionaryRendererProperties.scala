package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictionaryRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  
  /**
    * This property allows you to set display options that can be configured on the dictionary symbol style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#config)
    */
  var config: js.UndefOr[js.Any] = js.native
  
  /**
    * Defines a field mapping that maps input fields from the feature to the dictionary symbol style's expected fields for symbols and text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#fieldMap)
    */
  var fieldMap: js.UndefOr[HashMap[String]] = js.native
  
  /**
    * A scaling expression can be set to increase or decrease the size of the dictionary symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression)
    */
  var scaleExpression: js.UndefOr[String] = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [scaleExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpressionTitle)
    */
  var scaleExpressionTitle: js.UndefOr[String] = js.native
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#type)
    */
  var `type`: js.UndefOr[dictionary] = js.native
  
  /**
    * The URL to the dictionary style, e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}
object DictionaryRendererProperties {
  
  @scala.inline
  def apply(): DictionaryRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictionaryRendererProperties]
  }
  
  @scala.inline
  implicit class DictionaryRendererPropertiesOps[Self <: DictionaryRendererProperties] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setFieldMap(value: HashMap[String]): Self = this.set("fieldMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMap: Self = this.set("fieldMap", js.undefined)
    
    @scala.inline
    def setScaleExpression(value: String): Self = this.set("scaleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleExpression: Self = this.set("scaleExpression", js.undefined)
    
    @scala.inline
    def setScaleExpressionTitle(value: String): Self = this.set("scaleExpressionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleExpressionTitle: Self = this.set("scaleExpressionTitle", js.undefined)
    
    @scala.inline
    def setType(value: dictionary): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
