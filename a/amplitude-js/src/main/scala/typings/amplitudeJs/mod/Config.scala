package typings.amplitudeJs.mod

import typings.amplitudeJs.amplitudeJsStrings.DISABLE
import typings.amplitudeJs.amplitudeJsStrings.ERROR
import typings.amplitudeJs.amplitudeJsStrings.INFO
import typings.amplitudeJs.amplitudeJsStrings.Lax
import typings.amplitudeJs.amplitudeJsStrings.None
import typings.amplitudeJs.amplitudeJsStrings.Strict
import typings.amplitudeJs.amplitudeJsStrings.WARN
import typings.amplitudeJs.anon.Carrier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var apiEndpoint: js.UndefOr[String] = js.native
  var batchEvents: js.UndefOr[Boolean] = js.native
  var cookieExpiration: js.UndefOr[Double] = js.native
  var cookieName: js.UndefOr[String] = js.native
  var deviceId: js.UndefOr[String] = js.native
  var deviceIdFromUrlParam: js.UndefOr[Boolean] = js.native
  var domain: js.UndefOr[String] = js.native
  var eventUploadPeriodMillis: js.UndefOr[Double] = js.native
  var eventUploadThreshold: js.UndefOr[Double] = js.native
  var forceHttps: js.UndefOr[Boolean] = js.native
  var includeGclid: js.UndefOr[Boolean] = js.native
  var includeReferrer: js.UndefOr[Boolean] = js.native
  var includeUtm: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[DISABLE | ERROR | WARN | INFO] = js.native
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  var optOut: js.UndefOr[Boolean] = js.native
  var platform: js.UndefOr[String] = js.native
  var sameSiteCookie: js.UndefOr[Lax | Strict | None] = js.native
  var saveEvents: js.UndefOr[Boolean] = js.native
  var saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.native
  var savedMaxCount: js.UndefOr[Double] = js.native
  var secureCookie: js.UndefOr[Boolean] = js.native
  var sessionTimeout: js.UndefOr[Double] = js.native
  var trackingOptions: js.UndefOr[Carrier] = js.native
  var unsentIdentifyKey: js.UndefOr[String] = js.native
  var unsentKey: js.UndefOr[String] = js.native
  var unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.native
  var uploadBatchSize: js.UndefOr[Double] = js.native
  var useNativeDeviceInfo: js.UndefOr[Boolean] = js.native
  var userId: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setApiEndpoint(value: String): Self = this.set("apiEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiEndpoint: Self = this.set("apiEndpoint", js.undefined)
    @scala.inline
    def setBatchEvents(value: Boolean): Self = this.set("batchEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchEvents: Self = this.set("batchEvents", js.undefined)
    @scala.inline
    def setCookieExpiration(value: Double): Self = this.set("cookieExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieExpiration: Self = this.set("cookieExpiration", js.undefined)
    @scala.inline
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDeviceIdFromUrlParam(value: Boolean): Self = this.set("deviceIdFromUrlParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIdFromUrlParam: Self = this.set("deviceIdFromUrlParam", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEventUploadPeriodMillis(value: Double): Self = this.set("eventUploadPeriodMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventUploadPeriodMillis: Self = this.set("eventUploadPeriodMillis", js.undefined)
    @scala.inline
    def setEventUploadThreshold(value: Double): Self = this.set("eventUploadThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventUploadThreshold: Self = this.set("eventUploadThreshold", js.undefined)
    @scala.inline
    def setForceHttps(value: Boolean): Self = this.set("forceHttps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHttps: Self = this.set("forceHttps", js.undefined)
    @scala.inline
    def setIncludeGclid(value: Boolean): Self = this.set("includeGclid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGclid: Self = this.set("includeGclid", js.undefined)
    @scala.inline
    def setIncludeReferrer(value: Boolean): Self = this.set("includeReferrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeReferrer: Self = this.set("includeReferrer", js.undefined)
    @scala.inline
    def setIncludeUtm(value: Boolean): Self = this.set("includeUtm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUtm: Self = this.set("includeUtm", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLogLevel(value: DISABLE | ERROR | WARN | INFO): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOptOut(value: Boolean): Self = this.set("optOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptOut: Self = this.set("optOut", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setSameSiteCookie(value: Lax | Strict | None): Self = this.set("sameSiteCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSiteCookie: Self = this.set("sameSiteCookie", js.undefined)
    @scala.inline
    def setSaveEvents(value: Boolean): Self = this.set("saveEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveEvents: Self = this.set("saveEvents", js.undefined)
    @scala.inline
    def setSaveParamsReferrerOncePerSession(value: Boolean): Self = this.set("saveParamsReferrerOncePerSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveParamsReferrerOncePerSession: Self = this.set("saveParamsReferrerOncePerSession", js.undefined)
    @scala.inline
    def setSavedMaxCount(value: Double): Self = this.set("savedMaxCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSavedMaxCount: Self = this.set("savedMaxCount", js.undefined)
    @scala.inline
    def setSecureCookie(value: Boolean): Self = this.set("secureCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureCookie: Self = this.set("secureCookie", js.undefined)
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    @scala.inline
    def setTrackingOptions(value: Carrier): Self = this.set("trackingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingOptions: Self = this.set("trackingOptions", js.undefined)
    @scala.inline
    def setUnsentIdentifyKey(value: String): Self = this.set("unsentIdentifyKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsentIdentifyKey: Self = this.set("unsentIdentifyKey", js.undefined)
    @scala.inline
    def setUnsentKey(value: String): Self = this.set("unsentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsentKey: Self = this.set("unsentKey", js.undefined)
    @scala.inline
    def setUnsetParamsReferrerOnNewSession(value: Boolean): Self = this.set("unsetParamsReferrerOnNewSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsetParamsReferrerOnNewSession: Self = this.set("unsetParamsReferrerOnNewSession", js.undefined)
    @scala.inline
    def setUploadBatchSize(value: Double): Self = this.set("uploadBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadBatchSize: Self = this.set("uploadBatchSize", js.undefined)
    @scala.inline
    def setUseNativeDeviceInfo(value: Boolean): Self = this.set("useNativeDeviceInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDeviceInfo: Self = this.set("useNativeDeviceInfo", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

