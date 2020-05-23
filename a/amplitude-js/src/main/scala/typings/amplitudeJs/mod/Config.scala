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

trait Config extends js.Object {
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var batchEvents: js.UndefOr[Boolean] = js.undefined
  var cookieExpiration: js.UndefOr[Double] = js.undefined
  var cookieName: js.UndefOr[String] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var deviceIdFromUrlParam: js.UndefOr[Boolean] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var eventUploadPeriodMillis: js.UndefOr[Double] = js.undefined
  var eventUploadThreshold: js.UndefOr[Double] = js.undefined
  var forceHttps: js.UndefOr[Boolean] = js.undefined
  var includeGclid: js.UndefOr[Boolean] = js.undefined
  var includeReferrer: js.UndefOr[Boolean] = js.undefined
  var includeUtm: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[DISABLE | ERROR | WARN | INFO] = js.undefined
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var optOut: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var sameSiteCookie: js.UndefOr[Lax | Strict | None] = js.undefined
  var saveEvents: js.UndefOr[Boolean] = js.undefined
  var saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.undefined
  var savedMaxCount: js.UndefOr[Double] = js.undefined
  var secureCookie: js.UndefOr[Boolean] = js.undefined
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  var trackingOptions: js.UndefOr[Carrier] = js.undefined
  var unsentIdentifyKey: js.UndefOr[String] = js.undefined
  var unsentKey: js.UndefOr[String] = js.undefined
  var unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.undefined
  var uploadBatchSize: js.UndefOr[Double] = js.undefined
  var useNativeDeviceInfo: js.UndefOr[Boolean] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    apiEndpoint: String = null,
    batchEvents: js.UndefOr[Boolean] = js.undefined,
    cookieExpiration: js.UndefOr[Double] = js.undefined,
    cookieName: String = null,
    deviceId: String = null,
    deviceIdFromUrlParam: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    eventUploadPeriodMillis: js.UndefOr[Double] = js.undefined,
    eventUploadThreshold: js.UndefOr[Double] = js.undefined,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    includeGclid: js.UndefOr[Boolean] = js.undefined,
    includeReferrer: js.UndefOr[Boolean] = js.undefined,
    includeUtm: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    logLevel: DISABLE | ERROR | WARN | INFO = null,
    onError: () => Unit = null,
    optOut: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    sameSiteCookie: Lax | Strict | None = null,
    saveEvents: js.UndefOr[Boolean] = js.undefined,
    saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.undefined,
    savedMaxCount: js.UndefOr[Double] = js.undefined,
    secureCookie: js.UndefOr[Boolean] = js.undefined,
    sessionTimeout: js.UndefOr[Double] = js.undefined,
    trackingOptions: Carrier = null,
    unsentIdentifyKey: String = null,
    unsentKey: String = null,
    unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.undefined,
    uploadBatchSize: js.UndefOr[Double] = js.undefined,
    useNativeDeviceInfo: js.UndefOr[Boolean] = js.undefined,
    userId: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(batchEvents)) __obj.updateDynamic("batchEvents")(batchEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieExpiration)) __obj.updateDynamic("cookieExpiration")(cookieExpiration.get.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceIdFromUrlParam)) __obj.updateDynamic("deviceIdFromUrlParam")(deviceIdFromUrlParam.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(eventUploadPeriodMillis)) __obj.updateDynamic("eventUploadPeriodMillis")(eventUploadPeriodMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventUploadThreshold)) __obj.updateDynamic("eventUploadThreshold")(eventUploadThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeGclid)) __obj.updateDynamic("includeGclid")(includeGclid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeReferrer)) __obj.updateDynamic("includeReferrer")(includeReferrer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUtm)) __obj.updateDynamic("includeUtm")(includeUtm.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (!js.isUndefined(optOut)) __obj.updateDynamic("optOut")(optOut.get.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (sameSiteCookie != null) __obj.updateDynamic("sameSiteCookie")(sameSiteCookie.asInstanceOf[js.Any])
    if (!js.isUndefined(saveEvents)) __obj.updateDynamic("saveEvents")(saveEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saveParamsReferrerOncePerSession)) __obj.updateDynamic("saveParamsReferrerOncePerSession")(saveParamsReferrerOncePerSession.get.asInstanceOf[js.Any])
    if (!js.isUndefined(savedMaxCount)) __obj.updateDynamic("savedMaxCount")(savedMaxCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secureCookie)) __obj.updateDynamic("secureCookie")(secureCookie.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionTimeout)) __obj.updateDynamic("sessionTimeout")(sessionTimeout.get.asInstanceOf[js.Any])
    if (trackingOptions != null) __obj.updateDynamic("trackingOptions")(trackingOptions.asInstanceOf[js.Any])
    if (unsentIdentifyKey != null) __obj.updateDynamic("unsentIdentifyKey")(unsentIdentifyKey.asInstanceOf[js.Any])
    if (unsentKey != null) __obj.updateDynamic("unsentKey")(unsentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(unsetParamsReferrerOnNewSession)) __obj.updateDynamic("unsetParamsReferrerOnNewSession")(unsetParamsReferrerOnNewSession.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadBatchSize)) __obj.updateDynamic("uploadBatchSize")(uploadBatchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDeviceInfo)) __obj.updateDynamic("useNativeDeviceInfo")(useNativeDeviceInfo.get.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

