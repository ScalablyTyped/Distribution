package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskProperties extends TaskProperties

object WorkflowTaskProperties {
  @scala.inline
  def apply(requestOptions: js.Any = null, url: java.lang.String = null): WorkflowTaskProperties = {
    val __obj = js.Dynamic.literal()
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkflowTaskProperties]
  }
}

