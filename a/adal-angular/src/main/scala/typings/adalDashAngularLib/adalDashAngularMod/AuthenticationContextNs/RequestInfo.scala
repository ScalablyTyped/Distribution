package typings
package adalDashAngularLib.adalDashAngularMod.AuthenticationContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  /**
    * Object comprising of fields such as id_token/error, session_state, state, e.t.c.
    */
  var parameters: js.Any
  /**
    * Request type.
    */
  var requestType: RequestType
  /**
    * Whether state is valid.
    */
  var stateMatch: scala.Boolean
  /**
    * Unique guid used to match the response with the request.
    */
  var stateResponse: java.lang.String
  /**
    * Whether `requestType` contains `id_token`, `access_token` or error.
    */
  var valid: scala.Boolean
}

object RequestInfo {
  @scala.inline
  def apply(
    parameters: js.Any,
    requestType: RequestType,
    stateMatch: scala.Boolean,
    stateResponse: java.lang.String,
    valid: scala.Boolean
  ): RequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("requestType")(requestType)
    __obj.updateDynamic("stateMatch")(stateMatch)
    __obj.updateDynamic("stateResponse")(stateResponse)
    __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[RequestInfo]
  }
}

