package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanKey extends js.Object {
  /**
    * The Id of a usage plan key.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of a usage plan key.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of a usage plan key. Currently, the valid key type is API_KEY.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of a usage plan key.
    */
  var value: js.UndefOr[String] = js.native
}

object UsagePlanKey {
  @scala.inline
  def apply(id: String = null, name: String = null, `type`: String = null, value: String = null): UsagePlanKey = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanKey]
  }
}

