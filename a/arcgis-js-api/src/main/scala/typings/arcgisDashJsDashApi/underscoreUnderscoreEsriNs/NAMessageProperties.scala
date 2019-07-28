package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NAMessageProperties extends js.Object {
  /**
    * A description of the network analyst message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The network analyst message type.  **Possible Values:** informative | process-definition | process-start | process-stop | warning | error | empty | abort
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#type)
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NAMessageProperties {
  @scala.inline
  def apply(description: String = null, `type`: String = null): NAMessageProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NAMessageProperties]
  }
}

