package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFieldGroupProperties extends js.Object {
  /**
    * The group's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object InputFieldGroupProperties {
  @scala.inline
  def apply(description: java.lang.String = null): InputFieldGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[InputFieldGroupProperties]
  }
}

