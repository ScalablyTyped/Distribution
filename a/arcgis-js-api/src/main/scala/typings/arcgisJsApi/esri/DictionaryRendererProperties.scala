package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryRendererProperties
  extends StObject
     with RendererProperties
     with VisualVariablesMixinProperties {
  
  /**
    * This property allows you to set display options that can be configured on the dictionary symbol style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#config)
    */
  var config: js.UndefOr[Any] = js.undefined
  
  /**
    * Defines a field mapping that maps input fields from the feature to the dictionary symbol style's expected fields for symbols and text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#fieldMap)
    */
  var fieldMap: js.UndefOr[HashMap[String]] = js.undefined
  
  /**
    * A scaling expression can be set to increase or decrease the size of the dictionary symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression)
    */
  var scaleExpression: js.UndefOr[String] = js.undefined
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression as defined in the [scaleExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpressionTitle)
    */
  var scaleExpressionTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#type)
    */
  var `type`: js.UndefOr[dictionary] = js.undefined
  
  /**
    * The URL to the dictionary style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object DictionaryRendererProperties {
  
  inline def apply(): DictionaryRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictionaryRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictionaryRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setFieldMap(value: HashMap[String]): Self = StObject.set(x, "fieldMap", value.asInstanceOf[js.Any])
    
    inline def setFieldMapUndefined: Self = StObject.set(x, "fieldMap", js.undefined)
    
    inline def setScaleExpression(value: String): Self = StObject.set(x, "scaleExpression", value.asInstanceOf[js.Any])
    
    inline def setScaleExpressionTitle(value: String): Self = StObject.set(x, "scaleExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setScaleExpressionTitleUndefined: Self = StObject.set(x, "scaleExpressionTitle", js.undefined)
    
    inline def setScaleExpressionUndefined: Self = StObject.set(x, "scaleExpression", js.undefined)
    
    inline def setType(value: dictionary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
