package typings.adalAngular.mod

import typings.adalAngular.adalAngularNumbers.`483`
import typings.adalAngular.adalAngularNumbers.`600`
import typings.adalAngular.adalAngularStrings.Canceled
import typings.adalAngular.adalAngularStrings.Completed
import typings.adalAngular.adalAngularStrings.Verticalline
import typings.adalAngular.adalAngularStrings.`6000`
import typings.adalAngular.adalAngularStrings.`In Progress`
import typings.adalAngular.adalAngularStrings.access_token
import typings.adalAngular.adalAngularStrings.error_description
import typings.adalAngular.adalAngularStrings.expires_in
import typings.adalAngular.adalAngularStrings.id_token
import typings.adalAngular.adalAngularStrings.session_state
import typings.adalAngular.anon.ACCESSTOKENKEY
import typings.adalAngular.anon.ERROR
import typings.adalAngular.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum for storage constants
  */
@js.native
trait Constants extends js.Object {
  var ACCESS_TOKEN: access_token = js.native
  var ERROR_DESCRIPTION: error_description = js.native
  var EXPIRES_IN: expires_in = js.native
  var ID_TOKEN: id_token = js.native
  var LEVEL_STRING_MAP: `0` = js.native
  var LOADFRAME_TIMEOUT: `6000` = js.native
  var LOGGING_LEVEL: ERROR = js.native
  var POPUP_HEIGHT: `600` = js.native
  var POPUP_WIDTH: `483` = js.native
  var RESOURCE_DELIMETER: Verticalline = js.native
  var SESSION_STATE: session_state = js.native
  var STORAGE: ACCESSTOKENKEY = js.native
  var TOKEN_RENEW_STATUS_CANCELED: Canceled = js.native
  var TOKEN_RENEW_STATUS_COMPLETED: Completed = js.native
  var TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress` = js.native
}

object Constants {
  @scala.inline
  def apply(
    ACCESS_TOKEN: access_token,
    ERROR_DESCRIPTION: error_description,
    EXPIRES_IN: expires_in,
    ID_TOKEN: id_token,
    LEVEL_STRING_MAP: `0`,
    LOADFRAME_TIMEOUT: `6000`,
    LOGGING_LEVEL: ERROR,
    POPUP_HEIGHT: `600`,
    POPUP_WIDTH: `483`,
    RESOURCE_DELIMETER: Verticalline,
    SESSION_STATE: session_state,
    STORAGE: ACCESSTOKENKEY,
    TOKEN_RENEW_STATUS_CANCELED: Canceled,
    TOKEN_RENEW_STATUS_COMPLETED: Completed,
    TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
  ): Constants = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN = ACCESS_TOKEN.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRES_IN = EXPIRES_IN.asInstanceOf[js.Any], ID_TOKEN = ID_TOKEN.asInstanceOf[js.Any], LEVEL_STRING_MAP = LEVEL_STRING_MAP.asInstanceOf[js.Any], LOADFRAME_TIMEOUT = LOADFRAME_TIMEOUT.asInstanceOf[js.Any], LOGGING_LEVEL = LOGGING_LEVEL.asInstanceOf[js.Any], POPUP_HEIGHT = POPUP_HEIGHT.asInstanceOf[js.Any], POPUP_WIDTH = POPUP_WIDTH.asInstanceOf[js.Any], RESOURCE_DELIMETER = RESOURCE_DELIMETER.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_CANCELED = TOKEN_RENEW_STATUS_CANCELED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_COMPLETED = TOKEN_RENEW_STATUS_COMPLETED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_IN_PROGRESS = TOKEN_RENEW_STATUS_IN_PROGRESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  @scala.inline
  implicit class ConstantsOps[Self <: Constants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setACCESS_TOKEN(value: access_token): Self = this.set("ACCESS_TOKEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR_DESCRIPTION(value: error_description): Self = this.set("ERROR_DESCRIPTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setEXPIRES_IN(value: expires_in): Self = this.set("EXPIRES_IN", value.asInstanceOf[js.Any])
    @scala.inline
    def setID_TOKEN(value: id_token): Self = this.set("ID_TOKEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEVEL_STRING_MAP(value: `0`): Self = this.set("LEVEL_STRING_MAP", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOADFRAME_TIMEOUT(value: `6000`): Self = this.set("LOADFRAME_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOGGING_LEVEL(value: ERROR): Self = this.set("LOGGING_LEVEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPOPUP_HEIGHT(value: `600`): Self = this.set("POPUP_HEIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPOPUP_WIDTH(value: `483`): Self = this.set("POPUP_WIDTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setRESOURCE_DELIMETER(value: Verticalline): Self = this.set("RESOURCE_DELIMETER", value.asInstanceOf[js.Any])
    @scala.inline
    def setSESSION_STATE(value: session_state): Self = this.set("SESSION_STATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTORAGE(value: ACCESSTOKENKEY): Self = this.set("STORAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOKEN_RENEW_STATUS_CANCELED(value: Canceled): Self = this.set("TOKEN_RENEW_STATUS_CANCELED", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOKEN_RENEW_STATUS_COMPLETED(value: Completed): Self = this.set("TOKEN_RENEW_STATUS_COMPLETED", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOKEN_RENEW_STATUS_IN_PROGRESS(value: `In Progress`): Self = this.set("TOKEN_RENEW_STATUS_IN_PROGRESS", value.asInstanceOf[js.Any])
  }
  
}

