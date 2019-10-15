package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueValueRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer. This is usually done when adding a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to the [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#visualVariables)) in a bivariate visualization (color indicates a type-based value and size indicates the value of a separate numeric field). Use this property to set a background [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) (or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) if visualizing data in 3D) to visualize the boundaries of each polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.undefined
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol). The [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol) is used to draw all features with unspecified, unmatched values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: js.UndefOr[String] = js.undefined
  /**
    * The default symbol used to draw a feature whose value is not matched or specified by the renderer. If `null`, unmatched features will not be assigned a symbol.
    * > **Known Limitations**  SceneLayers with a `mesh` [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) will display unmatching features with a generic symbol even if the `defaultSymbol` is `null`.
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
  var field2: js.UndefOr[String] = js.undefined
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
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string or a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.  This property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) for data-driven visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
}

object UniqueValueRendererProperties {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfoProperties = null,
    backgroundFillSymbol: FillSymbolProperties | PolygonSymbol3DProperties = null,
    defaultLabel: String = null,
    defaultSymbol: SymbolProperties = null,
    field: String = null,
    field2: String = null,
    field3: String = null,
    fieldDelimiter: String = null,
    legendOptions: UniqueValueRendererLegendOptions = null,
    uniqueValueInfos: js.Array[UniqueValueInfoProperties] = null,
    valueExpression: String = null,
    valueExpressionTitle: String = null,
    visualVariables: js.Array[VisualVariableProperties] = null
  ): UniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (authoringInfo != null) __obj.updateDynamic("authoringInfo")(authoringInfo)
    if (backgroundFillSymbol != null) __obj.updateDynamic("backgroundFillSymbol")(backgroundFillSymbol.asInstanceOf[js.Any])
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel)
    if (defaultSymbol != null) __obj.updateDynamic("defaultSymbol")(defaultSymbol)
    if (field != null) __obj.updateDynamic("field")(field)
    if (field2 != null) __obj.updateDynamic("field2")(field2)
    if (field3 != null) __obj.updateDynamic("field3")(field3)
    if (fieldDelimiter != null) __obj.updateDynamic("fieldDelimiter")(fieldDelimiter)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (uniqueValueInfos != null) __obj.updateDynamic("uniqueValueInfos")(uniqueValueInfos)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    if (visualVariables != null) __obj.updateDynamic("visualVariables")(visualVariables)
    __obj.asInstanceOf[UniqueValueRendererProperties]
  }
}

