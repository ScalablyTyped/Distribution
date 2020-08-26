package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueValueRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer. This is usually done when adding a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to the [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#visualVariables)) in a bivariate visualization (color indicates a type-based value and size indicates the value of a separate numeric field). Use this property to set a background [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) (or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) if visualizing data in 3D) to visualize the boundaries of each polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.native
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol). The [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol) is used to draw all features with unspecified, unmatched values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: js.UndefOr[String] = js.native
  /**
    * The default symbol used to draw a feature whose value is not matched or specified by the renderer. If `null`, unmatched features will not be assigned a symbol.
    * > **Known Limitations**  SceneLayers with a `mesh` [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) will display unmatching features with a generic symbol even if the `defaultSymbol` is `null`.
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
    * If needed, specifies the name of an additional attribute field the renderer will use to match values. For example, if you specify two fields:
    * ```js
    * var renderer = {
    *   type: "unique-value",  // autocasts as new UniqueValueRenderer()
    *   field: "REGION",
    *   field2: "RANK",
    *   fieldDelimiter: ", ",  // comma + space used to separate values from all fields
    *   uniqueValueInfos: [
    *     {
    *       value: "North, 1",  // features in the "North" region and a rank of 1
    *       symbol: sym1  // will be assigned sym1
    *     }, {
    *       value: "North, 2",  // features in the "North" region and a rank of 2
    *       symbol: sym2  // will be assigned sym2
    *     },
    *     ...
    *   ]
    * };
    * ```
    *
    * All combinations of values of [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) and `field2` are unique values and
    * may have their own symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
    */
  var field2: js.UndefOr[String] = js.native
  /**
    * If needed, specify the name of a third attribute field the renderer will use to match values. For example, if you specify three fields:
    * ```js
    * var renderer = {
    *   type: "unique-value",  // autocasts as new UniqueValueRenderer()
    *   field: "REGION",
    *   field2: "RANK",
    *   field3: "CLASS",
    *   fieldDelimiter: ", ",  // comma + space used to separate values from all fields
    *   uniqueValueInfos: [
    *     {
    *       value: "North, 1, medium",  // features in the "North" region, a rank of 1, and "medium" class
    *       symbol: sym1  // will be assigned sym1
    *     }, {
    *       value: "North, 2, medium",  // features in the "North" region, a rank of 2, and a "medium class
    *       symbol: sym2  // will be assigned sym2
    *     },
    *     ...
    *   ]
    * };
    * ```
    *
    * All combinations of values of [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field), [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2), and `field3` are unique values and
    * may have their own symbol.
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
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string or a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.  This property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) for data-driven visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.native
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions) property.
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

