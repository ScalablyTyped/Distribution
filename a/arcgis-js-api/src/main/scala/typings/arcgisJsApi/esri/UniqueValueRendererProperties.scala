package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValueRendererProperties
  extends StObject
     with RendererProperties
     with VisualVariablesMixinProperties {
  
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.undefined
  
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The default symbol used to draw a feature whose value is not matched or specified by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol)
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.undefined
  
  /**
    * The name of the attribute field the renderer uses to match unique values or types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * If needed, specifies the name of an additional attribute field the renderer will use to match values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
    */
  var field2: js.UndefOr[String] = js.undefined
  
  /**
    * If needed, specify the name of a third attribute field the renderer will use to match values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3)
    */
  var field3: js.UndefOr[String] = js.undefined
  
  /**
    * String inserted between the values if multiple attribute fields are specified.
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
    * Each element in the array is an object that provides information about a unique value associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos)
    */
  var uniqueValueInfos: js.UndefOr[js.Array[UniqueValueInfoProperties]] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string or a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
}
object UniqueValueRendererProperties {
  
  @scala.inline
  def apply(): UniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueValueRendererProperties]
  }
  
  @scala.inline
  implicit class UniqueValueRendererPropertiesMutableBuilder[Self <: UniqueValueRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundFillSymbol(value: FillSymbolProperties | PolygonSymbol3DProperties): Self = StObject.set(x, "backgroundFillSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundFillSymbolUndefined: Self = StObject.set(x, "backgroundFillSymbol", js.undefined)
    
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
    def setField2(value: String): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField2Undefined: Self = StObject.set(x, "field2", js.undefined)
    
    @scala.inline
    def setField3(value: String): Self = StObject.set(x, "field3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField3Undefined: Self = StObject.set(x, "field3", js.undefined)
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: UniqueValueRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    @scala.inline
    def setUniqueValueInfos(value: js.Array[UniqueValueInfoProperties]): Self = StObject.set(x, "uniqueValueInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueValueInfosUndefined: Self = StObject.set(x, "uniqueValueInfos", js.undefined)
    
    @scala.inline
    def setUniqueValueInfosVarargs(value: UniqueValueInfoProperties*): Self = StObject.set(x, "uniqueValueInfos", js.Array(value :_*))
    
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
