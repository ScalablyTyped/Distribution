package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanKey extends js.Object {
  /**
    * The Id of a usage plan key.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of a usage plan key.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The type of a usage plan key. Currently, the valid key type is API_KEY.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The value of a usage plan key.
    */
  var value: js.UndefOr[String] = js.undefined
}

object UsagePlanKey {
  @scala.inline
  def apply(id: String = null, name: String = null, `type`: String = null, value: String = null): UsagePlanKey = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UsagePlanKey]
  }
}

