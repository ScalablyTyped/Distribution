package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait supportDateProperties extends js.Object {
  /**
    * Date value returned from server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Date.html#date)
    */
  var date: js.UndefOr[DateProperties] = js.undefined
  /**
    * The format of the date used in the date property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Date.html#format)
    *
    * @default EEE MMM dd HH:mm:ss zzz yyyy
    */
  var format: js.UndefOr[String] = js.undefined
}

object supportDateProperties {
  @scala.inline
  def apply(date: DateProperties = null, format: String = null): supportDateProperties = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[supportDateProperties]
  }
}

