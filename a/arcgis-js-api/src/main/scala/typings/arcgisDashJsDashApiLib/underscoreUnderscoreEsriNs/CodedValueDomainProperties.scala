package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodedValueDomainProperties extends DomainProperties {
  /**
    * An array of the coded values in the domain. See the object specification table below for the properties each item in the array should contain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var codedValues: js.UndefOr[js.Array[CodedValueDomainCodedValues]] = js.undefined
}

object CodedValueDomainProperties {
  @scala.inline
  def apply(
    codedValues: js.Array[CodedValueDomainCodedValues] = null,
    name: java.lang.String = null,
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.range | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`coded-value` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inherited = null
  ): CodedValueDomainProperties = {
    val __obj = js.Dynamic.literal()
    if (codedValues != null) __obj.updateDynamic("codedValues")(codedValues)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodedValueDomainProperties]
  }
}

