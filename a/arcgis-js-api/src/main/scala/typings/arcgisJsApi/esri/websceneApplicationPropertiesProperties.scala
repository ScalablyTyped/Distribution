package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait websceneApplicationPropertiesProperties extends js.Object {
  /**
    * View-specific properties of application and UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-ApplicationProperties.html#viewing)
    */
  var viewing: js.UndefOr[ViewingProperties] = js.undefined
}

object websceneApplicationPropertiesProperties {
  @scala.inline
  def apply(viewing: ViewingProperties = null): websceneApplicationPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    if (viewing != null) __obj.updateDynamic("viewing")(viewing.asInstanceOf[js.Any])
    __obj.asInstanceOf[websceneApplicationPropertiesProperties]
  }
}

