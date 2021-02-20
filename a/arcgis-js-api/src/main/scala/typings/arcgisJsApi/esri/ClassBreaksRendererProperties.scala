package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassBreaksRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  
  /**
    * When symbolizing polygon features with graduated symbols, set a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) on this property to visualize the boundaries of each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.native
  
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var classBreakInfos: js.UndefOr[js.Array[ClassBreakInfoProperties]] = js.native
  
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultLabel)
    */
  var defaultLabel: js.UndefOr[String] = js.native
  
  /**
    * The default symbol assigned to features with a value not matched to a given break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol)
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.native
  
  /**
    * The name of a numeric attribute field whose data determines the symbol of each feature based on the class breaks defined in [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[ClassBreaksRendererLegendOptions] = js.native
  
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `field`, this property contains the attribute field name used for normalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.native
  
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal)
    */
  var normalizationTotal: js.UndefOr[Double] = js.native
  
  /**
    * Indicates how the data is normalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType)
    */
  var normalizationType: js.UndefOr[field | log | `percent-of-total`] = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
}
object ClassBreaksRendererProperties {
  
  @scala.inline
  def apply(): ClassBreaksRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassBreaksRendererProperties]
  }
  
  @scala.inline
  implicit class ClassBreaksRendererPropertiesMutableBuilder[Self <: ClassBreaksRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundFillSymbol(value: FillSymbolProperties | PolygonSymbol3DProperties): Self = StObject.set(x, "backgroundFillSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundFillSymbolUndefined: Self = StObject.set(x, "backgroundFillSymbol", js.undefined)
    
    @scala.inline
    def setClassBreakInfos(value: js.Array[ClassBreakInfoProperties]): Self = StObject.set(x, "classBreakInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBreakInfosUndefined: Self = StObject.set(x, "classBreakInfos", js.undefined)
    
    @scala.inline
    def setClassBreakInfosVarargs(value: ClassBreakInfoProperties*): Self = StObject.set(x, "classBreakInfos", js.Array(value :_*))
    
    @scala.inline
    def setDefaultLabel(value: String): Self = StObject.set(x, "defaultLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLabelUndefined: Self = StObject.set(x, "defaultLabel", js.undefined)
    
    @scala.inline
    def setDefaultSymbol(value: SymbolProperties): Self = StObject.set(x, "defaultSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSymbolUndefined: Self = StObject.set(x, "defaultSymbol", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: ClassBreaksRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    @scala.inline
    def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    @scala.inline
    def setNormalizationTotal(value: Double): Self = StObject.set(x, "normalizationTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationTotalUndefined: Self = StObject.set(x, "normalizationTotal", js.undefined)
    
    @scala.inline
    def setNormalizationType(value: field | log | `percent-of-total`): Self = StObject.set(x, "normalizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizationTypeUndefined: Self = StObject.set(x, "normalizationType", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    @scala.inline
    def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
