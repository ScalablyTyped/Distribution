package typings
package adalDashAngularLib.adalDashAngularMod.AuthenticationContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum for storage constants
  */
trait Constants extends js.Object {
  var ACCESS_TOKEN: adalDashAngularLib.adalDashAngularLibStrings.access_token
  var ERROR_DESCRIPTION: adalDashAngularLib.adalDashAngularLibStrings.error_description
  var EXPIRES_IN: adalDashAngularLib.adalDashAngularLibStrings.expires_in
  var ID_TOKEN: adalDashAngularLib.adalDashAngularLibStrings.id_token
  var LEVEL_STRING_MAP: adalDashAngularLib.Anon_01
  var LOADFRAME_TIMEOUT: adalDashAngularLib.adalDashAngularLibStrings.`6000`
  var LOGGING_LEVEL: adalDashAngularLib.Anon_0
  var POPUP_HEIGHT: adalDashAngularLib.adalDashAngularLibNumbers.`600`
  var POPUP_WIDTH: adalDashAngularLib.adalDashAngularLibNumbers.`483`
  var RESOURCE_DELIMETER: adalDashAngularLib.adalDashAngularLibStrings.`|`
  var SESSION_STATE: adalDashAngularLib.adalDashAngularLibStrings.session_state
  var STORAGE: adalDashAngularLib.Anon_ACCESSTOKENKEY
  var TOKEN_RENEW_STATUS_CANCELED: adalDashAngularLib.adalDashAngularLibStrings.Canceled
  var TOKEN_RENEW_STATUS_COMPLETED: adalDashAngularLib.adalDashAngularLibStrings.Completed
  var TOKEN_RENEW_STATUS_IN_PROGRESS: adalDashAngularLib.adalDashAngularLibStrings.`In Progress`
}

object Constants {
  @scala.inline
  def apply(
    ACCESS_TOKEN: adalDashAngularLib.adalDashAngularLibStrings.access_token,
    ERROR_DESCRIPTION: adalDashAngularLib.adalDashAngularLibStrings.error_description,
    EXPIRES_IN: adalDashAngularLib.adalDashAngularLibStrings.expires_in,
    ID_TOKEN: adalDashAngularLib.adalDashAngularLibStrings.id_token,
    LEVEL_STRING_MAP: adalDashAngularLib.Anon_01,
    LOADFRAME_TIMEOUT: adalDashAngularLib.adalDashAngularLibStrings.`6000`,
    LOGGING_LEVEL: adalDashAngularLib.Anon_0,
    POPUP_HEIGHT: adalDashAngularLib.adalDashAngularLibNumbers.`600`,
    POPUP_WIDTH: adalDashAngularLib.adalDashAngularLibNumbers.`483`,
    RESOURCE_DELIMETER: adalDashAngularLib.adalDashAngularLibStrings.`|`,
    SESSION_STATE: adalDashAngularLib.adalDashAngularLibStrings.session_state,
    STORAGE: adalDashAngularLib.Anon_ACCESSTOKENKEY,
    TOKEN_RENEW_STATUS_CANCELED: adalDashAngularLib.adalDashAngularLibStrings.Canceled,
    TOKEN_RENEW_STATUS_COMPLETED: adalDashAngularLib.adalDashAngularLibStrings.Completed,
    TOKEN_RENEW_STATUS_IN_PROGRESS: adalDashAngularLib.adalDashAngularLibStrings.`In Progress`
  ): Constants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACCESS_TOKEN")(ACCESS_TOKEN)
    __obj.updateDynamic("ERROR_DESCRIPTION")(ERROR_DESCRIPTION)
    __obj.updateDynamic("EXPIRES_IN")(EXPIRES_IN)
    __obj.updateDynamic("ID_TOKEN")(ID_TOKEN)
    __obj.updateDynamic("LEVEL_STRING_MAP")(LEVEL_STRING_MAP)
    __obj.updateDynamic("LOADFRAME_TIMEOUT")(LOADFRAME_TIMEOUT)
    __obj.updateDynamic("LOGGING_LEVEL")(LOGGING_LEVEL)
    __obj.updateDynamic("POPUP_HEIGHT")(POPUP_HEIGHT)
    __obj.updateDynamic("POPUP_WIDTH")(POPUP_WIDTH)
    __obj.updateDynamic("RESOURCE_DELIMETER")(RESOURCE_DELIMETER)
    __obj.updateDynamic("SESSION_STATE")(SESSION_STATE)
    __obj.updateDynamic("STORAGE")(STORAGE)
    __obj.updateDynamic("TOKEN_RENEW_STATUS_CANCELED")(TOKEN_RENEW_STATUS_CANCELED)
    __obj.updateDynamic("TOKEN_RENEW_STATUS_COMPLETED")(TOKEN_RENEW_STATUS_COMPLETED)
    __obj.updateDynamic("TOKEN_RENEW_STATUS_IN_PROGRESS")(TOKEN_RENEW_STATUS_IN_PROGRESS)
    __obj.asInstanceOf[Constants]
  }
}

