package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationPropertiesProperties extends js.Object {
  /**
    * View-specific properties of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-ApplicationProperties.html#viewing)
    */
  var viewing: js.UndefOr[ViewingProperties] = js.undefined
}

object ApplicationPropertiesProperties {
  @scala.inline
  def apply(viewing: ViewingProperties = null): ApplicationPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    if (viewing != null) __obj.updateDynamic("viewing")(viewing)
    __obj.asInstanceOf[ApplicationPropertiesProperties]
  }
}

