package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`class-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.log
import typings.arcgisJsApi.esri.AuthoringInfoProperties
import typings.arcgisJsApi.esri.ClassBreakInfoProperties
import typings.arcgisJsApi.esri.ClassBreaksRendererLegendOptions
import typings.arcgisJsApi.esri.FillSymbolProperties
import typings.arcgisJsApi.esri.SymbolProperties
import typings.arcgisJsApi.esri.VisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ClassBreaksRendererProperties & {  type :'class-breaks'} */
trait ClassBreaksRendererProper extends StObject {
  
  /**
  		 * Authoring metadata only included in renderers generated from one of the Smart Mapping creator methods, such as [sizeRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer) or [colorRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#authoringInfo)
  		 */
  var authoringInfo: js.UndefOr[AuthoringInfoProperties] = js.undefined
  
  /**
  		 * When symbolizing polygon features with graduated symbols, set a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) on this property to visualize the boundaries of each feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#backgroundFillSymbol)
  		 */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.undefined
  
  /**
  		 * Each element in the array is an object that provides information about a class break associated with the renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
  		 */
  var classBreakInfos: js.UndefOr[js.Array[ClassBreakInfoProperties]] = js.undefined
  
  /**
  		 * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultLabel)
  		 */
  var defaultLabel: js.UndefOr[String] = js.undefined
  
  /**
  		 * The default symbol assigned to features with a value not matched to a given break.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol)
  		 */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.undefined
  
  /**
  		 * The name of a numeric attribute field whose data determines the symbol of each feature based on the class breaks defined in [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field)
  		 */
  var field: js.UndefOr[String] = js.undefined
  
  /**
  		 * An object providing options for displaying the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions)
  		 */
  var legendOptions: js.UndefOr[ClassBreaksRendererLegendOptions] = js.undefined
  
  /**
  		 * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `field`, this property contains the attribute field name used for normalization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField)
  		 */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
  		 * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `percent-of-total`, this property contains the total of all data values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal)
  		 */
  var normalizationTotal: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates how the data is normalized.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType)
  		 */
  var normalizationType: js.UndefOr[field | log | `percent-of-total`] = js.undefined
  
  var `type`: `class-breaks`
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpressionTitle)
  		 */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
  
  /**
  		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
  		 */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.undefined
}
object ClassBreaksRendererProper {
  
  inline def apply(): ClassBreaksRendererProper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("class-breaks")
    __obj.asInstanceOf[ClassBreaksRendererProper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassBreaksRendererProper] (val x: Self) extends AnyVal {
    
    inline def setAuthoringInfo(value: AuthoringInfoProperties): Self = StObject.set(x, "authoringInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthoringInfoUndefined: Self = StObject.set(x, "authoringInfo", js.undefined)
    
    inline def setBackgroundFillSymbol(value: FillSymbolProperties | PolygonSymbol3DProperties): Self = StObject.set(x, "backgroundFillSymbol", value.asInstanceOf[js.Any])
    
    inline def setBackgroundFillSymbolUndefined: Self = StObject.set(x, "backgroundFillSymbol", js.undefined)
    
    inline def setClassBreakInfos(value: js.Array[ClassBreakInfoProperties]): Self = StObject.set(x, "classBreakInfos", value.asInstanceOf[js.Any])
    
    inline def setClassBreakInfosUndefined: Self = StObject.set(x, "classBreakInfos", js.undefined)
    
    inline def setClassBreakInfosVarargs(value: ClassBreakInfoProperties*): Self = StObject.set(x, "classBreakInfos", js.Array(value*))
    
    inline def setDefaultLabel(value: String): Self = StObject.set(x, "defaultLabel", value.asInstanceOf[js.Any])
    
    inline def setDefaultLabelUndefined: Self = StObject.set(x, "defaultLabel", js.undefined)
    
    inline def setDefaultSymbol(value: SymbolProperties): Self = StObject.set(x, "defaultSymbol", value.asInstanceOf[js.Any])
    
    inline def setDefaultSymbolUndefined: Self = StObject.set(x, "defaultSymbol", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLegendOptions(value: ClassBreaksRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setNormalizationTotal(value: Double): Self = StObject.set(x, "normalizationTotal", value.asInstanceOf[js.Any])
    
    inline def setNormalizationTotalUndefined: Self = StObject.set(x, "normalizationTotal", js.undefined)
    
    inline def setNormalizationType(value: field | log | `percent-of-total`): Self = StObject.set(x, "normalizationType", value.asInstanceOf[js.Any])
    
    inline def setNormalizationTypeUndefined: Self = StObject.set(x, "normalizationType", js.undefined)
    
    inline def setType(value: `class-breaks`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    inline def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
