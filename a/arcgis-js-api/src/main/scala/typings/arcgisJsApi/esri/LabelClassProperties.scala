package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.LabelSymbol3DPropertiesty
import typings.arcgisJsApi.anon.TextSymbolPropertiestypet
import typings.arcgisJsApi.arcgisJsApiStrings.`above-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`always-horizontal`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-start`
import typings.arcgisJsApi.arcgisJsApiStrings.curved
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.parallel
import typings.arcgisJsApi.arcgisJsApiStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelClassProperties extends StObject {
  
  /**
  		 * Specifies whether or not a polyline label can overrun the feature being labeled.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#allowOverrun)
  		 */
  var allowOverrun: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Defines how labels should be placed relative to one another.
  		 *
  		 * @default static
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy)
  		 */
  var deconflictionStrategy: js.UndefOr[none_ | static] = js.undefined
  
  /**
  		 * Defines the labels for a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
  		 */
  var labelExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * Defines the labels for a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
  		 */
  var labelExpressionInfo: js.UndefOr[LabelClassLabelExpressionInfo] = js.undefined
  
  /**
  		 * The position of the label.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
  		 */
  var labelPlacement: js.UndefOr[
    `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
  ] = js.undefined
  
  /**
  		 * Specifies the orientation of the label position of a polyline label.
  		 *
  		 * @default "curved"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPosition)
  		 */
  var labelPosition: js.UndefOr[curved | parallel] = js.undefined
  
  /**
  		 * The maximum scale (most zoomed in) at which labels are visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
  		 */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum scale (most zoomed out) at which labels are visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
  		 */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether or not to repeat the label along the polyline feature.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#repeatLabel)
  		 */
  var repeatLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The size in points of the distance between labels on a polyline.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#repeatLabelDistance)
  		 */
  var repeatLabelDistance: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * Defines the symbol used for rendering the label.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
  		 */
  var symbol: js.UndefOr[TextSymbolPropertiestypet | LabelSymbol3DPropertiesty] = js.undefined
  
  /**
  		 * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
  		 */
  var useCodedValues: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A SQL where clause used to determine the features to which the label class should be applied.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
  		 */
  var where: js.UndefOr[String] = js.undefined
}
object LabelClassProperties {
  
  inline def apply(): LabelClassProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelClassProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelClassProperties] (val x: Self) extends AnyVal {
    
    inline def setAllowOverrun(value: Boolean): Self = StObject.set(x, "allowOverrun", value.asInstanceOf[js.Any])
    
    inline def setAllowOverrunUndefined: Self = StObject.set(x, "allowOverrun", js.undefined)
    
    inline def setDeconflictionStrategy(value: none_ | static): Self = StObject.set(x, "deconflictionStrategy", value.asInstanceOf[js.Any])
    
    inline def setDeconflictionStrategyUndefined: Self = StObject.set(x, "deconflictionStrategy", js.undefined)
    
    inline def setLabelExpression(value: String): Self = StObject.set(x, "labelExpression", value.asInstanceOf[js.Any])
    
    inline def setLabelExpressionInfo(value: LabelClassLabelExpressionInfo): Self = StObject.set(x, "labelExpressionInfo", value.asInstanceOf[js.Any])
    
    inline def setLabelExpressionInfoUndefined: Self = StObject.set(x, "labelExpressionInfo", js.undefined)
    
    inline def setLabelExpressionUndefined: Self = StObject.set(x, "labelExpression", js.undefined)
    
    inline def setLabelPlacement(
      value: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
    ): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    inline def setLabelPosition(value: curved | parallel): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setRepeatLabel(value: Boolean): Self = StObject.set(x, "repeatLabel", value.asInstanceOf[js.Any])
    
    inline def setRepeatLabelDistance(value: Double | String): Self = StObject.set(x, "repeatLabelDistance", value.asInstanceOf[js.Any])
    
    inline def setRepeatLabelDistanceUndefined: Self = StObject.set(x, "repeatLabelDistance", js.undefined)
    
    inline def setRepeatLabelUndefined: Self = StObject.set(x, "repeatLabel", js.undefined)
    
    inline def setSymbol(value: TextSymbolPropertiestypet | LabelSymbol3DPropertiesty): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setUseCodedValues(value: Boolean): Self = StObject.set(x, "useCodedValues", value.asInstanceOf[js.Any])
    
    inline def setUseCodedValuesUndefined: Self = StObject.set(x, "useCodedValues", js.undefined)
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
