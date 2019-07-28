package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPMessageProperties extends js.Object {
  /**
    * The geoprocessing message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The geoprocessing message type.  **Possible Values:** informative | process-definition | process-start | process-stop | warning | error | empty | abort
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object GPMessageProperties {
  @scala.inline
  def apply(description: String = null, `type`: String = null): GPMessageProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GPMessageProperties]
  }
}

