package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`unique-value`
import typings.arcgisJsApi.esri.AuthoringInfoProperties
import typings.arcgisJsApi.esri.FillSymbolProperties
import typings.arcgisJsApi.esri.SymbolProperties
import typings.arcgisJsApi.esri.UniqueValueGroupProperties
import typings.arcgisJsApi.esri.UniqueValueInfoProperties
import typings.arcgisJsApi.esri.UniqueValueRendererLegendOptions
import typings.arcgisJsApi.esri.VisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.UniqueValueRendererProperties & {  type :'unique-value'} */
trait UniqueValueRendererProperAuthoringInfo extends StObject {
  
  /**
  		 * Authoring metadata only included in renderers generated from one of the Smart Mapping creator methods, such as [sizeRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) or [colorRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#authoringInfo)
  		 */
  var authoringInfo: js.UndefOr[AuthoringInfoProperties] = js.undefined
  
  /**
  		 * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
  		 */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DPropertiesColor] = js.undefined
  
  /**
  		 * The label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
  		 */
  var defaultLabel: js.UndefOr[String] = js.undefined
  
  /**
  		 * The symbol used to draw all features with values not referenced by [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) or [uniqueValueGroups](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueGroups).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol)
  		 */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.undefined
  
  /**
  		 * The name of the attribute field containing types or categorical values referenced in [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) or [uniqueValueGroups](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueGroups).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies the name of an additional attribute field used to categorize features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
  		 */
  var field2: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies the name of a third attribute field used to categorize features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3)
  		 */
  var field3: js.UndefOr[String] = js.undefined
  
  /**
  		 * A string used as a separator between the values in the legend if multiple attribute fields are used to categorize values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#fieldDelimiter)
  		 */
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  
  /**
  		 * An object providing options for displaying the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions)
  		 */
  var legendOptions: js.UndefOr[UniqueValueRendererLegendOptions] = js.undefined
  
  /**
  		 * Indicates whether the order of the classes or [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) in the renderer definition should be used for the feature drawing order of the layer.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#orderByClassesEnabled)
  		 */
  var orderByClassesEnabled: js.UndefOr[Boolean] = js.undefined
  
  var `type`: `unique-value`
  
  /**
  		 * An array of objects defining groups of unique values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueGroups)
  		 */
  var uniqueValueGroups: js.UndefOr[js.Array[UniqueValueGroupProperties]] = js.undefined
  
  /**
  		 * Defines categories and their corresponding symbols based on a set of values expected from the provided [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos)
  		 */
  var uniqueValueInfos: js.UndefOr[js.Array[UniqueValueInfoProperties]] = js.undefined
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
  		 */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  
  /**
  		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
  		 */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.undefined
}
object UniqueValueRendererProperAuthoringInfo {
  
  inline def apply(): UniqueValueRendererProperAuthoringInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unique-value")
    __obj.asInstanceOf[UniqueValueRendererProperAuthoringInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueValueRendererProperAuthoringInfo] (val x: Self) extends AnyVal {
    
    inline def setAuthoringInfo(value: AuthoringInfoProperties): Self = StObject.set(x, "authoringInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthoringInfoUndefined: Self = StObject.set(x, "authoringInfo", js.undefined)
    
    inline def setBackgroundFillSymbol(value: FillSymbolProperties | PolygonSymbol3DPropertiesColor): Self = StObject.set(x, "backgroundFillSymbol", value.asInstanceOf[js.Any])
    
    inline def setBackgroundFillSymbolUndefined: Self = StObject.set(x, "backgroundFillSymbol", js.undefined)
    
    inline def setDefaultLabel(value: String): Self = StObject.set(x, "defaultLabel", value.asInstanceOf[js.Any])
    
    inline def setDefaultLabelUndefined: Self = StObject.set(x, "defaultLabel", js.undefined)
    
    inline def setDefaultSymbol(value: SymbolProperties): Self = StObject.set(x, "defaultSymbol", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolUndefined: Self = StObject.set(x, "defaultSymbol", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setField2(value: String): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
    
    inline def setField2Undefined: Self = StObject.set(x, "field2", js.undefined)
    
    inline def setField3(value: String): Self = StObject.set(x, "field3", value.asInstanceOf[js.Any])
    
    inline def setField3Undefined: Self = StObject.set(x, "field3", js.undefined)
    
    inline def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    inline def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLegendOptions(value: UniqueValueRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setOrderByClassesEnabled(value: Boolean): Self = StObject.set(x, "orderByClassesEnabled", value.asInstanceOf[js.Any])
    
    inline def setOrderByClassesEnabledUndefined: Self = StObject.set(x, "orderByClassesEnabled", js.undefined)
    
    inline def setType(value: `unique-value`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueGroups(value: js.Array[UniqueValueGroupProperties]): Self = StObject.set(x, "uniqueValueGroups", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueGroupsUndefined: Self = StObject.set(x, "uniqueValueGroups", js.undefined)
    
    inline def setUniqueValueGroupsVarargs(value: UniqueValueGroupProperties*): Self = StObject.set(x, "uniqueValueGroups", js.Array(value*))
    
    inline def setUniqueValueInfos(value: js.Array[UniqueValueInfoProperties]): Self = StObject.set(x, "uniqueValueInfos", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueInfosUndefined: Self = StObject.set(x, "uniqueValueInfos", js.undefined)
    
    inline def setUniqueValueInfosVarargs(value: UniqueValueInfoProperties*): Self = StObject.set(x, "uniqueValueInfos", js.Array(value*))
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    inline def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
