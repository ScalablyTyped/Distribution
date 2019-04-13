package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFlowResponse extends js.Object {
  var Flow: js.UndefOr[Flow] = js.undefined
}

object CreateFlowResponse {
  @scala.inline
  def apply(Flow: Flow = null): CreateFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (Flow != null) __obj.updateDynamic("Flow")(Flow)
    __obj.asInstanceOf[CreateFlowResponse]
  }
}

