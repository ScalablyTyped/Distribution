package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueValueRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.native
  
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: js.UndefOr[String] = js.native
  
  /**
    * The default symbol used to draw a feature whose value is not matched or specified by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol)
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.native
  
  /**
    * The name of the attribute field the renderer uses to match unique values or types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * If needed, specifies the name of an additional attribute field the renderer will use to match values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
    */
  var field2: js.UndefOr[String] = js.native
  
  /**
    * If needed, specify the name of a third attribute field the renderer will use to match values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3)
    */
  var field3: js.UndefOr[String] = js.native
  
  /**
    * String inserted between the values if multiple attribute fields are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#fieldDelimiter)
    */
  var fieldDelimiter: js.UndefOr[String] = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[UniqueValueRendererLegendOptions] = js.native
  
  /**
    * Each element in the array is an object that provides information about a unique value associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos)
    */
  var uniqueValueInfos: js.UndefOr[js.Array[UniqueValueInfoProperties]] = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string or a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
}
object UniqueValueRendererProperties {
  
  @scala.inline
  def apply(): UniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueValueRendererProperties]
  }
  
  @scala.inline
  implicit class UniqueValueRendererPropertiesOps[Self <: UniqueValueRendererProperties] (val x: Self) extends AnyVal {
    
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
    def setBackgroundFillSymbol(value: FillSymbolProperties | PolygonSymbol3DProperties): Self = this.set("backgroundFillSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundFillSymbol: Self = this.set("backgroundFillSymbol", js.undefined)
    
    @scala.inline
    def setDefaultLabel(value: String): Self = this.set("defaultLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLabel: Self = this.set("defaultLabel", js.undefined)
    
    @scala.inline
    def setDefaultSymbol(value: SymbolProperties): Self = this.set("defaultSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSymbol: Self = this.set("defaultSymbol", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setField2(value: String): Self = this.set("field2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField2: Self = this.set("field2", js.undefined)
    
    @scala.inline
    def setField3(value: String): Self = this.set("field3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField3: Self = this.set("field3", js.undefined)
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("fieldDelimiter", js.undefined)
    
    @scala.inline
    def setLegendOptions(value: UniqueValueRendererLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    
    @scala.inline
    def setUniqueValueInfosVarargs(value: UniqueValueInfoProperties*): Self = this.set("uniqueValueInfos", js.Array(value :_*))
    
    @scala.inline
    def setUniqueValueInfos(value: js.Array[UniqueValueInfoProperties]): Self = this.set("uniqueValueInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueValueInfos: Self = this.set("uniqueValueInfos", js.undefined)
    
    @scala.inline
    def setValueExpression(value: String): Self = this.set("valueExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpression: Self = this.set("valueExpression", js.undefined)
    
    @scala.inline
    def setValueExpressionTitle(value: String): Self = this.set("valueExpressionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpressionTitle: Self = this.set("valueExpressionTitle", js.undefined)
  }
}
