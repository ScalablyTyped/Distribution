package typings.applicationinsightsJs.Microsoft.ApplicationInsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var appId: js.UndefOr[String] = js.native
  var autoTrackPageVisitTime: js.UndefOr[Boolean] = js.native
  var cookieDomain: js.UndefOr[String] = js.native
  var correlationHeaderExcludedDomains: js.UndefOr[js.Array[String]] = js.native
  var diagnosticLogInterval: js.UndefOr[Double] = js.native
  var disableAjaxTracking: js.UndefOr[Boolean] = js.native
  var disableCorrelationHeaders: js.UndefOr[Boolean] = js.native
  var disableDataLossAnalysis: js.UndefOr[Boolean] = js.native
  var disableExceptionTracking: js.UndefOr[Boolean] = js.native
  var disableFlushOnBeforeUnload: js.UndefOr[Boolean] = js.native
  var disableTelemetry: js.UndefOr[Boolean] = js.native
  var emitLineDelimitedJson: js.UndefOr[Boolean] = js.native
  var enableCorsCorrelation: js.UndefOr[Boolean] = js.native
  var enableDebug: js.UndefOr[Boolean] = js.native
  var enableSessionStorageBuffer: js.UndefOr[Boolean] = js.native
  var endpointUrl: js.UndefOr[String] = js.native
  var instrumentationKey: js.UndefOr[String] = js.native
  var isBeaconApiDisabled: js.UndefOr[Boolean] = js.native
  var isBrowserLinkTrackingEnabled: js.UndefOr[Boolean] = js.native
  var isCookieUseDisabled: js.UndefOr[Boolean] = js.native
  var isRetryDisabled: js.UndefOr[Boolean] = js.native
  var isStorageUseDisabled: js.UndefOr[Boolean] = js.native
  var maxAjaxCallsPerView: js.UndefOr[Double] = js.native
  var maxBatchInterval: js.UndefOr[Double] = js.native
  var maxBatchSizeInBytes: js.UndefOr[Double] = js.native
  var overridePageViewDuration: js.UndefOr[Boolean] = js.native
  var samplingPercentage: js.UndefOr[Double] = js.native
  var sdkExtension: js.UndefOr[String] = js.native
  var sessionExpirationMs: js.UndefOr[Double] = js.native
  var sessionRenewalMs: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var verboseLogging: js.UndefOr[Boolean] = js.native
}

object IConfig {
  @scala.inline
  def apply(): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setAutoTrackPageVisitTime(value: Boolean): Self = this.set("autoTrackPageVisitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoTrackPageVisitTime: Self = this.set("autoTrackPageVisitTime", js.undefined)
    @scala.inline
    def setCookieDomain(value: String): Self = this.set("cookieDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieDomain: Self = this.set("cookieDomain", js.undefined)
    @scala.inline
    def setCorrelationHeaderExcludedDomainsVarargs(value: String*): Self = this.set("correlationHeaderExcludedDomains", js.Array(value :_*))
    @scala.inline
    def setCorrelationHeaderExcludedDomains(value: js.Array[String]): Self = this.set("correlationHeaderExcludedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrelationHeaderExcludedDomains: Self = this.set("correlationHeaderExcludedDomains", js.undefined)
    @scala.inline
    def setDiagnosticLogInterval(value: Double): Self = this.set("diagnosticLogInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticLogInterval: Self = this.set("diagnosticLogInterval", js.undefined)
    @scala.inline
    def setDisableAjaxTracking(value: Boolean): Self = this.set("disableAjaxTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAjaxTracking: Self = this.set("disableAjaxTracking", js.undefined)
    @scala.inline
    def setDisableCorrelationHeaders(value: Boolean): Self = this.set("disableCorrelationHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCorrelationHeaders: Self = this.set("disableCorrelationHeaders", js.undefined)
    @scala.inline
    def setDisableDataLossAnalysis(value: Boolean): Self = this.set("disableDataLossAnalysis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDataLossAnalysis: Self = this.set("disableDataLossAnalysis", js.undefined)
    @scala.inline
    def setDisableExceptionTracking(value: Boolean): Self = this.set("disableExceptionTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableExceptionTracking: Self = this.set("disableExceptionTracking", js.undefined)
    @scala.inline
    def setDisableFlushOnBeforeUnload(value: Boolean): Self = this.set("disableFlushOnBeforeUnload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFlushOnBeforeUnload: Self = this.set("disableFlushOnBeforeUnload", js.undefined)
    @scala.inline
    def setDisableTelemetry(value: Boolean): Self = this.set("disableTelemetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTelemetry: Self = this.set("disableTelemetry", js.undefined)
    @scala.inline
    def setEmitLineDelimitedJson(value: Boolean): Self = this.set("emitLineDelimitedJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitLineDelimitedJson: Self = this.set("emitLineDelimitedJson", js.undefined)
    @scala.inline
    def setEnableCorsCorrelation(value: Boolean): Self = this.set("enableCorsCorrelation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCorsCorrelation: Self = this.set("enableCorsCorrelation", js.undefined)
    @scala.inline
    def setEnableDebug(value: Boolean): Self = this.set("enableDebug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDebug: Self = this.set("enableDebug", js.undefined)
    @scala.inline
    def setEnableSessionStorageBuffer(value: Boolean): Self = this.set("enableSessionStorageBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSessionStorageBuffer: Self = this.set("enableSessionStorageBuffer", js.undefined)
    @scala.inline
    def setEndpointUrl(value: String): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointUrl: Self = this.set("endpointUrl", js.undefined)
    @scala.inline
    def setInstrumentationKey(value: String): Self = this.set("instrumentationKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstrumentationKey: Self = this.set("instrumentationKey", js.undefined)
    @scala.inline
    def setIsBeaconApiDisabled(value: Boolean): Self = this.set("isBeaconApiDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBeaconApiDisabled: Self = this.set("isBeaconApiDisabled", js.undefined)
    @scala.inline
    def setIsBrowserLinkTrackingEnabled(value: Boolean): Self = this.set("isBrowserLinkTrackingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBrowserLinkTrackingEnabled: Self = this.set("isBrowserLinkTrackingEnabled", js.undefined)
    @scala.inline
    def setIsCookieUseDisabled(value: Boolean): Self = this.set("isCookieUseDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCookieUseDisabled: Self = this.set("isCookieUseDisabled", js.undefined)
    @scala.inline
    def setIsRetryDisabled(value: Boolean): Self = this.set("isRetryDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRetryDisabled: Self = this.set("isRetryDisabled", js.undefined)
    @scala.inline
    def setIsStorageUseDisabled(value: Boolean): Self = this.set("isStorageUseDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStorageUseDisabled: Self = this.set("isStorageUseDisabled", js.undefined)
    @scala.inline
    def setMaxAjaxCallsPerView(value: Double): Self = this.set("maxAjaxCallsPerView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAjaxCallsPerView: Self = this.set("maxAjaxCallsPerView", js.undefined)
    @scala.inline
    def setMaxBatchInterval(value: Double): Self = this.set("maxBatchInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBatchInterval: Self = this.set("maxBatchInterval", js.undefined)
    @scala.inline
    def setMaxBatchSizeInBytes(value: Double): Self = this.set("maxBatchSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBatchSizeInBytes: Self = this.set("maxBatchSizeInBytes", js.undefined)
    @scala.inline
    def setOverridePageViewDuration(value: Boolean): Self = this.set("overridePageViewDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverridePageViewDuration: Self = this.set("overridePageViewDuration", js.undefined)
    @scala.inline
    def setSamplingPercentage(value: Double): Self = this.set("samplingPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingPercentage: Self = this.set("samplingPercentage", js.undefined)
    @scala.inline
    def setSdkExtension(value: String): Self = this.set("sdkExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdkExtension: Self = this.set("sdkExtension", js.undefined)
    @scala.inline
    def setSessionExpirationMs(value: Double): Self = this.set("sessionExpirationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionExpirationMs: Self = this.set("sessionExpirationMs", js.undefined)
    @scala.inline
    def setSessionRenewalMs(value: Double): Self = this.set("sessionRenewalMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionRenewalMs: Self = this.set("sessionRenewalMs", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVerboseLogging(value: Boolean): Self = this.set("verboseLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerboseLogging: Self = this.set("verboseLogging", js.undefined)
  }
  
}

