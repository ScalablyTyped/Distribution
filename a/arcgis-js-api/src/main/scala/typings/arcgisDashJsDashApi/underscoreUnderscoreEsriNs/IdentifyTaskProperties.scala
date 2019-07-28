package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifyTaskProperties extends TaskProperties {
  /**
    * Specifies the geodatabase version to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
}

object IdentifyTaskProperties {
  @scala.inline
  def apply(gdbVersion: String = null, requestOptions: js.Any = null, url: String = null): IdentifyTaskProperties = {
    val __obj = js.Dynamic.literal()
    if (gdbVersion != null) __obj.updateDynamic("gdbVersion")(gdbVersion)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IdentifyTaskProperties]
  }
}

