package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import typings.arcgisJsApi.arcgisJsApiStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeDomainProperties extends DomainProperties {
  /**
    * The maximum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * The minimum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue)
    */
  var minValue: js.UndefOr[Double] = js.undefined
}

object RangeDomainProperties {
  @scala.inline
  def apply(
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    name: String = null,
    `type`: range | `coded-value` | inherited = null
  ): RangeDomainProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDomainProperties]
  }
}

