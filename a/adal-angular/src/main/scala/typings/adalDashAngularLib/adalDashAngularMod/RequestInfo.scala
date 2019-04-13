package typings
package adalDashAngularLib.adalDashAngularMod

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
    val __obj = js.Dynamic.literal(parameters = parameters, requestType = requestType, stateMatch = stateMatch, stateResponse = stateResponse, valid = valid)
  
    __obj.asInstanceOf[RequestInfo]
  }
}

