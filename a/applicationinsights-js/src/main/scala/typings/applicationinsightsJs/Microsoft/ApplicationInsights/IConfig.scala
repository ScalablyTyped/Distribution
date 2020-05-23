package typings.applicationinsightsJs.Microsoft.ApplicationInsights

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
    diagnosticLogInterval: js.UndefOr[Double] = js.undefined,
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
    maxAjaxCallsPerView: js.UndefOr[Double] = js.undefined,
    maxBatchInterval: js.UndefOr[Double] = js.undefined,
    maxBatchSizeInBytes: js.UndefOr[Double] = js.undefined,
    overridePageViewDuration: js.UndefOr[Boolean] = js.undefined,
    samplingPercentage: js.UndefOr[Double] = js.undefined,
    sdkExtension: String = null,
    sessionExpirationMs: js.UndefOr[Double] = js.undefined,
    sessionRenewalMs: js.UndefOr[Double] = js.undefined,
    url: String = null,
    verboseLogging: js.UndefOr[Boolean] = js.undefined
  ): IConfig = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (!js.isUndefined(autoTrackPageVisitTime)) __obj.updateDynamic("autoTrackPageVisitTime")(autoTrackPageVisitTime.get.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (correlationHeaderExcludedDomains != null) __obj.updateDynamic("correlationHeaderExcludedDomains")(correlationHeaderExcludedDomains.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnosticLogInterval)) __obj.updateDynamic("diagnosticLogInterval")(diagnosticLogInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAjaxTracking)) __obj.updateDynamic("disableAjaxTracking")(disableAjaxTracking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCorrelationHeaders)) __obj.updateDynamic("disableCorrelationHeaders")(disableCorrelationHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDataLossAnalysis)) __obj.updateDynamic("disableDataLossAnalysis")(disableDataLossAnalysis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableExceptionTracking)) __obj.updateDynamic("disableExceptionTracking")(disableExceptionTracking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFlushOnBeforeUnload)) __obj.updateDynamic("disableFlushOnBeforeUnload")(disableFlushOnBeforeUnload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTelemetry)) __obj.updateDynamic("disableTelemetry")(disableTelemetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitLineDelimitedJson)) __obj.updateDynamic("emitLineDelimitedJson")(emitLineDelimitedJson.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCorsCorrelation)) __obj.updateDynamic("enableCorsCorrelation")(enableCorsCorrelation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDebug)) __obj.updateDynamic("enableDebug")(enableDebug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSessionStorageBuffer)) __obj.updateDynamic("enableSessionStorageBuffer")(enableSessionStorageBuffer.get.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (instrumentationKey != null) __obj.updateDynamic("instrumentationKey")(instrumentationKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeaconApiDisabled)) __obj.updateDynamic("isBeaconApiDisabled")(isBeaconApiDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBrowserLinkTrackingEnabled)) __obj.updateDynamic("isBrowserLinkTrackingEnabled")(isBrowserLinkTrackingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCookieUseDisabled)) __obj.updateDynamic("isCookieUseDisabled")(isCookieUseDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isRetryDisabled)) __obj.updateDynamic("isRetryDisabled")(isRetryDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isStorageUseDisabled)) __obj.updateDynamic("isStorageUseDisabled")(isStorageUseDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAjaxCallsPerView)) __obj.updateDynamic("maxAjaxCallsPerView")(maxAjaxCallsPerView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBatchInterval)) __obj.updateDynamic("maxBatchInterval")(maxBatchInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBatchSizeInBytes)) __obj.updateDynamic("maxBatchSizeInBytes")(maxBatchSizeInBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overridePageViewDuration)) __obj.updateDynamic("overridePageViewDuration")(overridePageViewDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingPercentage)) __obj.updateDynamic("samplingPercentage")(samplingPercentage.get.asInstanceOf[js.Any])
    if (sdkExtension != null) __obj.updateDynamic("sdkExtension")(sdkExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionExpirationMs)) __obj.updateDynamic("sessionExpirationMs")(sessionExpirationMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionRenewalMs)) __obj.updateDynamic("sessionRenewalMs")(sessionRenewalMs.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(verboseLogging)) __obj.updateDynamic("verboseLogging")(verboseLogging.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

