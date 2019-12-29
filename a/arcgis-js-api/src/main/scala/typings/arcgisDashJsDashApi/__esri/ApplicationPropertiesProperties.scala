package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationPropertiesProperties extends js.Object {
  /**
    * View-specific properties of application and UI elements for the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-ApplicationProperties.html#viewing)
    */
  var viewing: js.UndefOr[ViewingProperties] = js.undefined
}

object ApplicationPropertiesProperties {
  @scala.inline
  def apply(viewing: ViewingProperties = null): ApplicationPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    if (viewing != null) __obj.updateDynamic("viewing")(viewing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPropertiesProperties]
  }
}

