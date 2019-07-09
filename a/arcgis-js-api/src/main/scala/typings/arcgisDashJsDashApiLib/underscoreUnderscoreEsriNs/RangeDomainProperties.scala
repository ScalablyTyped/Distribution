package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeDomainProperties extends DomainProperties {
  /**
    * The maximum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue)
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue)
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

object RangeDomainProperties {
  @scala.inline
  def apply(
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.range | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`coded-value` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inherited = null
  ): RangeDomainProperties = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDomainProperties]
  }
}

