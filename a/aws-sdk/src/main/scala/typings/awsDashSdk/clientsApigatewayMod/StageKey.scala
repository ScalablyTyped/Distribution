package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageKey extends js.Object {
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.undefined
  /**
    * The stage name associated with the stage key.
    */
  var stageName: js.UndefOr[String] = js.undefined
}

object StageKey {
  @scala.inline
  def apply(restApiId: String = null, stageName: String = null): StageKey = {
    val __obj = js.Dynamic.literal()
    if (restApiId != null) __obj.updateDynamic("restApiId")(restApiId)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    __obj.asInstanceOf[StageKey]
  }
}

