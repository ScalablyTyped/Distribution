package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskProperties extends js.Object {
  /**
    * The [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for data requests. These options can also be controlled through the `requestOptions` method parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Task.html#requestOptions)
    */
  var requestOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The ArcGIS Server REST service URL (usually of a Feature Service Layer or Map Service Layer) for use in a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Task.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object TaskProperties {
  @scala.inline
  def apply(requestOptions: js.Any = null, url: String = null): TaskProperties = {
    val __obj = js.Dynamic.literal()
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TaskProperties]
  }
}

