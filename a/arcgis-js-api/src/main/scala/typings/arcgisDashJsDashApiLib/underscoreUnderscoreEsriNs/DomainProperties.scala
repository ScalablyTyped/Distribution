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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DomainProperties {
  @scala.inline
  def apply(name: java.lang.String = null, `type`: java.lang.String = null): DomainProperties = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DomainProperties]
  }
}

