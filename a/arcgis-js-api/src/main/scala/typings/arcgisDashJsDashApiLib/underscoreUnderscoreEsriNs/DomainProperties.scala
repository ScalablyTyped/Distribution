package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainProperties extends js.Object {
  /**
    * The domain name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The domain type.  **Possible Values:** range | coded-value | inherited
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.range | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`coded-value` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inherited
  ] = js.undefined
}

object DomainProperties {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.range | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`coded-value` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inherited = null
  ): DomainProperties = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainProperties]
  }
}

