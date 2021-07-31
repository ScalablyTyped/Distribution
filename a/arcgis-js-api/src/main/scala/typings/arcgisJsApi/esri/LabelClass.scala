package typings.arcgisJsApi.esri

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
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelClass
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Defines how labels should be placed relative to one another.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy)
    */
  var deconflictionStrategy: none | static = js.native
  
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    */
  var labelExpression: String = js.native
  
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var labelExpressionInfo: LabelClassLabelExpressionInfo = js.native
  
  /**
    * The position of the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    */
  var labelPlacement: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal` = js.native
  
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    */
  var minScale: Double = js.native
  
  /**
    * Defines the symbol used for rendering the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: TextSymbol | LabelSymbol3D = js.native
  
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: Boolean = js.native
  
  /**
    * A SQL where clause used to determine the features to which the label class should be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    */
  var where: String = js.native
}
