package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSymbol3DVerticalOffsetProperties extends Object {
  /**
    * The maximum vertical symbol offset in world units. It acts as an upper bound to avoid vertical offset becoming too big.  In the following animation the green symbols have `maxWorldLength = 50` and orange symbols don't have `maxWorldLength` set:  ![maxWorldLength](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-maxWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.native
  /**
    * The minimum vertical symbol offset in world units. It acts as a lower bound to avoid the vertical offset becoming too small.  In the following animation the green symbol on the left has `minWorldLength = 20` and for the orange symbol on the right `minWorldLength` has not been set:  ![minWorldLength-on](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3D-line-callout-minWorldLength.gif)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.native
  /**
    * The vertical symbol offset in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var screenLength: js.UndefOr[Double] = js.native
}

object LabelSymbol3DVerticalOffsetProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LabelSymbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LabelSymbol3DVerticalOffsetProperties]
  }
  @scala.inline
  implicit class LabelSymbol3DVerticalOffsetPropertiesOps[Self <: LabelSymbol3DVerticalOffsetProperties] (val x: Self) extends AnyVal {
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
    def setMaxWorldLength(value: Double): Self = this.set("maxWorldLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWorldLength: Self = this.set("maxWorldLength", js.undefined)
    @scala.inline
    def setMinWorldLength(value: Double): Self = this.set("minWorldLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWorldLength: Self = this.set("minWorldLength", js.undefined)
    @scala.inline
    def setScreenLength(value: Double): Self = this.set("screenLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenLength: Self = this.set("screenLength", js.undefined)
  }
  
}

