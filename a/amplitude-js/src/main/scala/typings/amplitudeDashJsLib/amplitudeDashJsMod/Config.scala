package typings
package amplitudeDashJsLib.amplitudeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var apiEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var batchEvents: js.UndefOr[scala.Boolean] = js.undefined
  var cookieExpiration: js.UndefOr[scala.Double] = js.undefined
  var cookieName: js.UndefOr[java.lang.String] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var deviceIdFromUrlParam: js.UndefOr[scala.Boolean] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var eventUploadPeriodMillis: js.UndefOr[scala.Double] = js.undefined
  var eventUploadThreshold: js.UndefOr[scala.Double] = js.undefined
  var forceHttps: js.UndefOr[scala.Boolean] = js.undefined
  var includeGclid: js.UndefOr[scala.Boolean] = js.undefined
  var includeReferrer: js.UndefOr[scala.Boolean] = js.undefined
  var includeUtm: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[
    amplitudeDashJsLib.amplitudeDashJsLibStrings.DISABLE | amplitudeDashJsLib.amplitudeDashJsLibStrings.ERROR | amplitudeDashJsLib.amplitudeDashJsLibStrings.WARN | amplitudeDashJsLib.amplitudeDashJsLibStrings.INFO
  ] = js.undefined
  var optOut: js.UndefOr[scala.Boolean] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var saveEvents: js.UndefOr[scala.Boolean] = js.undefined
  var saveParamsReferrerOncePerSession: js.UndefOr[scala.Boolean] = js.undefined
  var savedMaxCount: js.UndefOr[scala.Double] = js.undefined
  var sessionTimeout: js.UndefOr[scala.Double] = js.undefined
  var trackingOptions: js.UndefOr[amplitudeDashJsLib.Anon_City] = js.undefined
  var unsentIdentifyKey: js.UndefOr[java.lang.String] = js.undefined
  var unsentKey: js.UndefOr[java.lang.String] = js.undefined
  var uploadBatchSize: js.UndefOr[scala.Double] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    apiEndpoint: java.lang.String = null,
    batchEvents: js.UndefOr[scala.Boolean] = js.undefined,
    cookieExpiration: scala.Int | scala.Double = null,
    cookieName: java.lang.String = null,
    deviceId: java.lang.String = null,
    deviceIdFromUrlParam: js.UndefOr[scala.Boolean] = js.undefined,
    domain: java.lang.String = null,
    eventUploadPeriodMillis: scala.Int | scala.Double = null,
    eventUploadThreshold: scala.Int | scala.Double = null,
    forceHttps: js.UndefOr[scala.Boolean] = js.undefined,
    includeGclid: js.UndefOr[scala.Boolean] = js.undefined,
    includeReferrer: js.UndefOr[scala.Boolean] = js.undefined,
    includeUtm: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    logLevel: amplitudeDashJsLib.amplitudeDashJsLibStrings.DISABLE | amplitudeDashJsLib.amplitudeDashJsLibStrings.ERROR | amplitudeDashJsLib.amplitudeDashJsLibStrings.WARN | amplitudeDashJsLib.amplitudeDashJsLibStrings.INFO = null,
    optOut: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    saveEvents: js.UndefOr[scala.Boolean] = js.undefined,
    saveParamsReferrerOncePerSession: js.UndefOr[scala.Boolean] = js.undefined,
    savedMaxCount: scala.Int | scala.Double = null,
    sessionTimeout: scala.Int | scala.Double = null,
    trackingOptions: amplitudeDashJsLib.Anon_City = null,
    unsentIdentifyKey: java.lang.String = null,
    unsentKey: java.lang.String = null,
    uploadBatchSize: scala.Int | scala.Double = null,
    userId: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint)
    if (!js.isUndefined(batchEvents)) __obj.updateDynamic("batchEvents")(batchEvents)
    if (cookieExpiration != null) __obj.updateDynamic("cookieExpiration")(cookieExpiration.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (!js.isUndefined(deviceIdFromUrlParam)) __obj.updateDynamic("deviceIdFromUrlParam")(deviceIdFromUrlParam)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (eventUploadPeriodMillis != null) __obj.updateDynamic("eventUploadPeriodMillis")(eventUploadPeriodMillis.asInstanceOf[js.Any])
    if (eventUploadThreshold != null) __obj.updateDynamic("eventUploadThreshold")(eventUploadThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (!js.isUndefined(includeGclid)) __obj.updateDynamic("includeGclid")(includeGclid)
    if (!js.isUndefined(includeReferrer)) __obj.updateDynamic("includeReferrer")(includeReferrer)
    if (!js.isUndefined(includeUtm)) __obj.updateDynamic("includeUtm")(includeUtm)
    if (language != null) __obj.updateDynamic("language")(language)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(optOut)) __obj.updateDynamic("optOut")(optOut)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(saveEvents)) __obj.updateDynamic("saveEvents")(saveEvents)
    if (!js.isUndefined(saveParamsReferrerOncePerSession)) __obj.updateDynamic("saveParamsReferrerOncePerSession")(saveParamsReferrerOncePerSession)
    if (savedMaxCount != null) __obj.updateDynamic("savedMaxCount")(savedMaxCount.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (trackingOptions != null) __obj.updateDynamic("trackingOptions")(trackingOptions)
    if (unsentIdentifyKey != null) __obj.updateDynamic("unsentIdentifyKey")(unsentIdentifyKey)
    if (unsentKey != null) __obj.updateDynamic("unsentKey")(unsentKey)
    if (uploadBatchSize != null) __obj.updateDynamic("uploadBatchSize")(uploadBatchSize.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Config]
  }
}

