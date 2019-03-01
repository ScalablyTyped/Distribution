package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineReportingOptions[TContext] extends js.Object {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var calculateSignature: js.UndefOr[
    js.Function2[
      /* ast */ graphqlLib.languageAstMod.DocumentNode, 
      /* operationName */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var debugPrintReports: js.UndefOr[scala.Boolean] = js.undefined
  var endpointUrl: js.UndefOr[java.lang.String] = js.undefined
  var generateClientInfo: js.UndefOr[GenerateClientInfo[TContext]] = js.undefined
  var handleSignals: js.UndefOr[scala.Boolean] = js.undefined
  var maskErrorDetails: js.UndefOr[scala.Boolean] = js.undefined
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
  var maxUncompressedReportSize: js.UndefOr[scala.Double] = js.undefined
  var minimumRetryDelayMs: js.UndefOr[scala.Double] = js.undefined
  var privateHeaders: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[nodeLib.String] | scala.Boolean
  ] = js.undefined
  var privateVariables: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[nodeLib.String] | scala.Boolean
  ] = js.undefined
  var reportErrorFunction: js.UndefOr[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.undefined
  var reportIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var requestAgent: js.UndefOr[
    apolloDashServerDashEnvLib.distFetchMod.RequestAgent | apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibNumbers.`false`
  ] = js.undefined
  var schemaTag: js.UndefOr[java.lang.String] = js.undefined
  var sendReportsImmediately: js.UndefOr[scala.Boolean] = js.undefined
}

object EngineReportingOptions {
  @scala.inline
  def apply[TContext](
    apiKey: java.lang.String = null,
    calculateSignature: js.Function2[
      /* ast */ graphqlLib.languageAstMod.DocumentNode, 
      /* operationName */ java.lang.String, 
      java.lang.String
    ] = null,
    debugPrintReports: js.UndefOr[scala.Boolean] = js.undefined,
    endpointUrl: java.lang.String = null,
    generateClientInfo: GenerateClientInfo[TContext] = null,
    handleSignals: js.UndefOr[scala.Boolean] = js.undefined,
    maskErrorDetails: js.UndefOr[scala.Boolean] = js.undefined,
    maxAttempts: scala.Int | scala.Double = null,
    maxUncompressedReportSize: scala.Int | scala.Double = null,
    minimumRetryDelayMs: scala.Int | scala.Double = null,
    privateHeaders: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[nodeLib.String] | scala.Boolean = null,
    privateVariables: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[nodeLib.String] | scala.Boolean = null,
    reportErrorFunction: js.Function1[/* err */ nodeLib.Error, scala.Unit] = null,
    reportIntervalMs: scala.Int | scala.Double = null,
    requestAgent: apolloDashServerDashEnvLib.distFetchMod.RequestAgent | apolloDashEngineDashReportingLib.apolloDashEngineDashReportingLibNumbers.`false` = null,
    schemaTag: java.lang.String = null,
    sendReportsImmediately: js.UndefOr[scala.Boolean] = js.undefined
  ): EngineReportingOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (calculateSignature != null) __obj.updateDynamic("calculateSignature")(calculateSignature)
    if (!js.isUndefined(debugPrintReports)) __obj.updateDynamic("debugPrintReports")(debugPrintReports)
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl)
    if (generateClientInfo != null) __obj.updateDynamic("generateClientInfo")(generateClientInfo)
    if (!js.isUndefined(handleSignals)) __obj.updateDynamic("handleSignals")(handleSignals)
    if (!js.isUndefined(maskErrorDetails)) __obj.updateDynamic("maskErrorDetails")(maskErrorDetails)
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (maxUncompressedReportSize != null) __obj.updateDynamic("maxUncompressedReportSize")(maxUncompressedReportSize.asInstanceOf[js.Any])
    if (minimumRetryDelayMs != null) __obj.updateDynamic("minimumRetryDelayMs")(minimumRetryDelayMs.asInstanceOf[js.Any])
    if (privateHeaders != null) __obj.updateDynamic("privateHeaders")(privateHeaders.asInstanceOf[js.Any])
    if (privateVariables != null) __obj.updateDynamic("privateVariables")(privateVariables.asInstanceOf[js.Any])
    if (reportErrorFunction != null) __obj.updateDynamic("reportErrorFunction")(reportErrorFunction)
    if (reportIntervalMs != null) __obj.updateDynamic("reportIntervalMs")(reportIntervalMs.asInstanceOf[js.Any])
    if (requestAgent != null) __obj.updateDynamic("requestAgent")(requestAgent.asInstanceOf[js.Any])
    if (schemaTag != null) __obj.updateDynamic("schemaTag")(schemaTag)
    if (!js.isUndefined(sendReportsImmediately)) __obj.updateDynamic("sendReportsImmediately")(sendReportsImmediately)
    __obj.asInstanceOf[EngineReportingOptions[TContext]]
  }
}

