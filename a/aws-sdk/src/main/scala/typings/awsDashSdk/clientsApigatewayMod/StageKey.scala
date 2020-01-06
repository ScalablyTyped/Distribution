package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageKey extends js.Object {
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.native
  /**
    * The stage name associated with the stage key.
    */
  var stageName: js.UndefOr[String] = js.native
}

object StageKey {
  @scala.inline
  def apply(restApiId: String = null, stageName: String = null): StageKey = {
    val __obj = js.Dynamic.literal()
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageKey]
  }
}

