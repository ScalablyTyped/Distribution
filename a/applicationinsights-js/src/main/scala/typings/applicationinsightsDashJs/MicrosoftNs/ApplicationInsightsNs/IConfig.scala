package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var appId: js.UndefOr[String] = js.undefined
  var autoTrackPageVisitTime: js.UndefOr[Boolean] = js.undefined
  var cookieDomain: js.UndefOr[String] = js.undefined
  var correlationHeaderExcludedDomains: js.UndefOr[js.Array[String]] = js.undefined
  var diagnosticLogInterval: js.UndefOr[Double] = js.undefined
  var disableAjaxTracking: js.UndefOr[Boolean] = js.undefined
  var disableCorrelationHeaders: js.UndefOr[Boolean] = js.undefined
  var disableDataLossAnalysis: js.UndefOr[Boolean] = js.undefined
  var disableExceptionTracking: js.UndefOr[Boolean] = js.undefined
  var disableFlushOnBeforeUnload: js.UndefOr[Boolean] = js.undefined
  var disableTelemetry: js.UndefOr[Boolean] = js.undefined
  var emitLineDelimitedJson: js.UndefOr[Boolean] = js.undefined
  var enableCorsCorrelation: js.UndefOr[Boolean] = js.undefined
  var enableDebug: js.UndefOr[Boolean] = js.undefined
  var enableSessionStorageBuffer: js.UndefOr[Boolean] = js.undefined
  var endpointUrl: js.UndefOr[String] = js.undefined
  var instrumentationKey: js.UndefOr[String] = js.undefined
  var isBeaconApiDisabled: js.UndefOr[Boolean] = js.undefined
  var isBrowserLinkTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  var isCookieUseDisabled: js.UndefOr[Boolean] = js.undefined
  var isRetryDisabled: js.UndefOr[Boolean] = js.undefined
  var isStorageUseDisabled: js.UndefOr[Boolean] = js.undefined
  var maxAjaxCallsPerView: js.UndefOr[Double] = js.undefined
  var maxBatchInterval: js.UndefOr[Double] = js.undefined
  var maxBatchSizeInBytes: js.UndefOr[Double] = js.undefined
  var overridePageViewDuration: js.UndefOr[Boolean] = js.undefined
  var samplingPercentage: js.UndefOr[Double] = js.undefined
  var sdkExtension: js.UndefOr[String] = js.undefined
  var sessionExpirationMs: js.UndefOr[Double] = js.undefined
  var sessionRenewalMs: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var verboseLogging: js.UndefOr[Boolean] = js.undefined
}

object IConfig {
  @scala.inline
  def apply(
    accountId: String = null,
    appId: String = null,
    autoTrackPageVisitTime: js.UndefOr[Boolean] = js.undefined,
    cookieDomain: String = null,
    correlationHeaderExcludedDomains: js.Array[String] = null,
    diagnosticLogInterval: Int | Double = null,
    disableAjaxTracking: js.UndefOr[Boolean] = js.undefined,
    disableCorrelationHeaders: js.UndefOr[Boolean] = js.undefined,
    disableDataLossAnalysis: js.UndefOr[Boolean] = js.undefined,
    disableExceptionTracking: js.UndefOr[Boolean] = js.undefined,
    disableFlushOnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    disableTelemetry: js.UndefOr[Boolean] = js.undefined,
    emitLineDelimitedJson: js.UndefOr[Boolean] = js.undefined,
    enableCorsCorrelation: js.UndefOr[Boolean] = js.undefined,
    enableDebug: js.UndefOr[Boolean] = js.undefined,
    enableSessionStorageBuffer: js.UndefOr[Boolean] = js.undefined,
    endpointUrl: String = null,
    instrumentationKey: String = null,
    isBeaconApiDisabled: js.UndefOr[Boolean] = js.undefined,
    isBrowserLinkTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    isCookieUseDisabled: js.UndefOr[Boolean] = js.undefined,
    isRetryDisabled: js.UndefOr[Boolean] = js.undefined,
    isStorageUseDisabled: js.UndefOr[Boolean] = js.undefined,
    maxAjaxCallsPerView: Int | Double = null,
    maxBatchInterval: Int | Double = null,
    maxBatchSizeInBytes: Int | Double = null,
    overridePageViewDuration: js.UndefOr[Boolean] = js.undefined,
    samplingPercentage: Int | Double = null,
    sdkExtension: String = null,
    sessionExpirationMs: Int | Double = null,
    sessionRenewalMs: Int | Double = null,
    url: String = null,
    verboseLogging: js.UndefOr[Boolean] = js.undefined
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

