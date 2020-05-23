package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelSymbol3DVerticalOffsetProperties extends Object {
  /**
    * The maximum vertical symbol offset in world units. It acts as an upper bound to avoid vertical offset becoming too big.  In the following animation the green symbols have `maxWorldLength = 50` and orange symbols don't have `maxWorldLength` set:  ![maxWorldLength](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-maxWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.undefined
  /**
    * The minimum vertical symbol offset in world units. It acts as a lower bound to avoid the vertical offset becoming too small.  In the following animation the green symbol on the left has `minWorldLength = 20` and for the orange symbol on the right `minWorldLength` has not been set:  ![minWorldLength-on](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-minWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.undefined
  /**
    * The vertical symbol offset in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var screenLength: js.UndefOr[Double] = js.undefined
}

object LabelSymbol3DVerticalOffsetProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    maxWorldLength: js.UndefOr[Double] = js.undefined,
    minWorldLength: js.UndefOr[Double] = js.undefined,
    screenLength: js.UndefOr[Double] = js.undefined
  ): LabelSymbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(maxWorldLength)) __obj.updateDynamic("maxWorldLength")(maxWorldLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWorldLength)) __obj.updateDynamic("minWorldLength")(minWorldLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenLength)) __obj.updateDynamic("screenLength")(screenLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSymbol3DVerticalOffsetProperties]
  }
}

