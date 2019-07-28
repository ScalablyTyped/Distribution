package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskProperties extends TaskProperties

object NotificationTaskProperties {
  @scala.inline
  def apply(requestOptions: js.Any = null, url: String = null): NotificationTaskProperties = {
    val __obj = js.Dynamic.literal()
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[NotificationTaskProperties]
  }
}

