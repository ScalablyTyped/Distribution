package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var autoTrackPageVisitTime: js.UndefOr[scala.Boolean] = js.undefined
  var cookieDomain: js.UndefOr[java.lang.String] = js.undefined
  var correlationHeaderExcludedDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var diagnosticLogInterval: js.UndefOr[scala.Double] = js.undefined
  var disableAjaxTracking: js.UndefOr[scala.Boolean] = js.undefined
  var disableCorrelationHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var disableDataLossAnalysis: js.UndefOr[scala.Boolean] = js.undefined
  var disableExceptionTracking: js.UndefOr[scala.Boolean] = js.undefined
  var disableFlushOnBeforeUnload: js.UndefOr[scala.Boolean] = js.undefined
  var disableTelemetry: js.UndefOr[scala.Boolean] = js.undefined
  var emitLineDelimitedJson: js.UndefOr[scala.Boolean] = js.undefined
  var enableCorsCorrelation: js.UndefOr[scala.Boolean] = js.undefined
  var enableDebug: js.UndefOr[scala.Boolean] = js.undefined
  var enableSessionStorageBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var endpointUrl: js.UndefOr[java.lang.String] = js.undefined
  var instrumentationKey: js.UndefOr[java.lang.String] = js.undefined
  var isBeaconApiDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isBrowserLinkTrackingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var isCookieUseDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isRetryDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isStorageUseDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var maxAjaxCallsPerView: js.UndefOr[scala.Double] = js.undefined
  var maxBatchInterval: js.UndefOr[scala.Double] = js.undefined
  var maxBatchSizeInBytes: js.UndefOr[scala.Double] = js.undefined
  var overridePageViewDuration: js.UndefOr[scala.Boolean] = js.undefined
  var samplingPercentage: js.UndefOr[scala.Double] = js.undefined
  var sdkExtension: js.UndefOr[java.lang.String] = js.undefined
  var sessionExpirationMs: js.UndefOr[scala.Double] = js.undefined
  var sessionRenewalMs: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var verboseLogging: js.UndefOr[scala.Boolean] = js.undefined
}

object IConfig {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    appId: java.lang.String = null,
    autoTrackPageVisitTime: js.UndefOr[scala.Boolean] = js.undefined,
    cookieDomain: java.lang.String = null,
    correlationHeaderExcludedDomains: js.Array[java.lang.String] = null,
    diagnosticLogInterval: scala.Int | scala.Double = null,
    disableAjaxTracking: js.UndefOr[scala.Boolean] = js.undefined,
    disableCorrelationHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    disableDataLossAnalysis: js.UndefOr[scala.Boolean] = js.undefined,
    disableExceptionTracking: js.UndefOr[scala.Boolean] = js.undefined,
    disableFlushOnBeforeUnload: js.UndefOr[scala.Boolean] = js.undefined,
    disableTelemetry: js.UndefOr[scala.Boolean] = js.undefined,
    emitLineDelimitedJson: js.UndefOr[scala.Boolean] = js.undefined,
    enableCorsCorrelation: js.UndefOr[scala.Boolean] = js.undefined,
    enableDebug: js.UndefOr[scala.Boolean] = js.undefined,
    enableSessionStorageBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    endpointUrl: java.lang.String = null,
    instrumentationKey: java.lang.String = null,
    isBeaconApiDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isBrowserLinkTrackingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isCookieUseDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isRetryDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isStorageUseDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxAjaxCallsPerView: scala.Int | scala.Double = null,
    maxBatchInterval: scala.Int | scala.Double = null,
    maxBatchSizeInBytes: scala.Int | scala.Double = null,
    overridePageViewDuration: js.UndefOr[scala.Boolean] = js.undefined,
    samplingPercentage: scala.Int | scala.Double = null,
    sdkExtension: java.lang.String = null,
    sessionExpirationMs: scala.Int | scala.Double = null,
    sessionRenewalMs: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    verboseLogging: js.UndefOr[scala.Boolean] = js.undefined
  ): IConfig = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (!js.isUndefined(autoTrackPageVisitTime)) __obj.updateDynamic("autoTrackPageVisitTime")(autoTrackPageVisitTime)
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain)
    if (correlationHeaderExcludedDomains != null) __obj.updateDynamic("correlationHeaderExcludedDomains")(correlationHeaderExcludedDomains)
    if (diagnosticLogInterval != null) __obj.updateDynamic("diagnosticLogInterval")(diagnosticLogInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAjaxTracking)) __obj.updateDynamic("disableAjaxTracking")(disableAjaxTracking)
    if (!js.isUndefined(disableCorrelationHeaders)) __obj.updateDynamic("disableCorrelationHeaders")(disableCorrelationHeaders)
    if (!js.isUndefined(disableDataLossAnalysis)) __obj.updateDynamic("disableDataLossAnalysis")(disableDataLossAnalysis)
    if (!js.isUndefined(disableExceptionTracking)) __obj.updateDynamic("disableExceptionTracking")(disableExceptionTracking)
    if (!js.isUndefined(disableFlushOnBeforeUnload)) __obj.updateDynamic("disableFlushOnBeforeUnload")(disableFlushOnBeforeUnload)
    if (!js.isUndefined(disableTelemetry)) __obj.updateDynamic("disableTelemetry")(disableTelemetry)
    if (!js.isUndefined(emitLineDelimitedJson)) __obj.updateDynamic("emitLineDelimitedJson")(emitLineDelimitedJson)
    if (!js.isUndefined(enableCorsCorrelation)) __obj.updateDynamic("enableCorsCorrelation")(enableCorsCorrelation)
    if (!js.isUndefined(enableDebug)) __obj.updateDynamic("enableDebug")(enableDebug)
    if (!js.isUndefined(enableSessionStorageBuffer)) __obj.updateDynamic("enableSessionStorageBuffer")(enableSessionStorageBuffer)
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl)
    if (instrumentationKey != null) __obj.updateDynamic("instrumentationKey")(instrumentationKey)
    if (!js.isUndefined(isBeaconApiDisabled)) __obj.updateDynamic("isBeaconApiDisabled")(isBeaconApiDisabled)
    if (!js.isUndefined(isBrowserLinkTrackingEnabled)) __obj.updateDynamic("isBrowserLinkTrackingEnabled")(isBrowserLinkTrackingEnabled)
    if (!js.isUndefined(isCookieUseDisabled)) __obj.updateDynamic("isCookieUseDisabled")(isCookieUseDisabled)
    if (!js.isUndefined(isRetryDisabled)) __obj.updateDynamic("isRetryDisabled")(isRetryDisabled)
    if (!js.isUndefined(isStorageUseDisabled)) __obj.updateDynamic("isStorageUseDisabled")(isStorageUseDisabled)
    if (maxAjaxCallsPerView != null) __obj.updateDynamic("maxAjaxCallsPerView")(maxAjaxCallsPerView.asInstanceOf[js.Any])
    if (maxBatchInterval != null) __obj.updateDynamic("maxBatchInterval")(maxBatchInterval.asInstanceOf[js.Any])
    if (maxBatchSizeInBytes != null) __obj.updateDynamic("maxBatchSizeInBytes")(maxBatchSizeInBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(overridePageViewDuration)) __obj.updateDynamic("overridePageViewDuration")(overridePageViewDuration)
    if (samplingPercentage != null) __obj.updateDynamic("samplingPercentage")(samplingPercentage.asInstanceOf[js.Any])
    if (sdkExtension != null) __obj.updateDynamic("sdkExtension")(sdkExtension)
    if (sessionExpirationMs != null) __obj.updateDynamic("sessionExpirationMs")(sessionExpirationMs.asInstanceOf[js.Any])
    if (sessionRenewalMs != null) __obj.updateDynamic("sessionRenewalMs")(sessionRenewalMs.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(verboseLogging)) __obj.updateDynamic("verboseLogging")(verboseLogging)
    __obj.asInstanceOf[IConfig]
  }
}

