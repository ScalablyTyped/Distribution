package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReporting.apolloEngineReportingBooleans.`false`
import typings.apolloServerEnv.fetchMod.RequestAgent
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.Logger
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineReportingOptions[TContext] extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var calculateSignature: js.UndefOr[js.Function2[/* ast */ DocumentNode, /* operationName */ String, String]] = js.undefined
  var debugPrintReports: js.UndefOr[Boolean] = js.undefined
  var endpointUrl: js.UndefOr[String] = js.undefined
  var generateClientInfo: js.UndefOr[GenerateClientInfo[TContext]] = js.undefined
  var graphVariant: js.UndefOr[String] = js.undefined
  var handleSignals: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var maskErrorDetails: js.UndefOr[Boolean] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var maxUncompressedReportSize: js.UndefOr[Double] = js.undefined
  var minimumRetryDelayMs: js.UndefOr[Double] = js.undefined
  var privateHeaders: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var privateVariables: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var reportErrorFunction: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
  var reportIntervalMs: js.UndefOr[Double] = js.undefined
  var requestAgent: js.UndefOr[RequestAgent | `false`] = js.undefined
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
  var schemaTag: js.UndefOr[String] = js.undefined
  var sendHeaders: js.UndefOr[SendValuesBaseOptions] = js.undefined
  var sendReportsImmediately: js.UndefOr[Boolean] = js.undefined
  var sendVariableValues: js.UndefOr[VariableValueOptions] = js.undefined
}

object EngineReportingOptions {
  @scala.inline
  def apply[TContext](
    apiKey: String = null,
    calculateSignature: (/* ast */ DocumentNode, /* operationName */ String) => String = null,
    debugPrintReports: js.UndefOr[Boolean] = js.undefined,
    endpointUrl: String = null,
    generateClientInfo: /* requestContext */ GraphQLRequestContext[TContext] => ClientInfo = null,
    graphVariant: String = null,
    handleSignals: js.UndefOr[Boolean] = js.undefined,
    logger: Logger = null,
    maskErrorDetails: js.UndefOr[Boolean] = js.undefined,
    maxAttempts: js.UndefOr[Double] = js.undefined,
    maxUncompressedReportSize: js.UndefOr[Double] = js.undefined,
    minimumRetryDelayMs: js.UndefOr[Double] = js.undefined,
    privateHeaders: js.Array[String] | Boolean = null,
    privateVariables: js.Array[String] | Boolean = null,
    reportErrorFunction: /* err */ Error => Unit = null,
    reportIntervalMs: js.UndefOr[Double] = js.undefined,
    requestAgent: RequestAgent | `false` = null,
    rewriteError: /* err */ GraphQLError => GraphQLError | Null = null,
    schemaTag: String = null,
    sendHeaders: SendValuesBaseOptions = null,
    sendReportsImmediately: js.UndefOr[Boolean] = js.undefined,
    sendVariableValues: VariableValueOptions = null
  ): EngineReportingOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (calculateSignature != null) __obj.updateDynamic("calculateSignature")(js.Any.fromFunction2(calculateSignature))
    if (!js.isUndefined(debugPrintReports)) __obj.updateDynamic("debugPrintReports")(debugPrintReports.get.asInstanceOf[js.Any])
    if (endpointUrl != null) __obj.updateDynamic("endpointUrl")(endpointUrl.asInstanceOf[js.Any])
    if (generateClientInfo != null) __obj.updateDynamic("generateClientInfo")(js.Any.fromFunction1(generateClientInfo))
    if (graphVariant != null) __obj.updateDynamic("graphVariant")(graphVariant.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSignals)) __obj.updateDynamic("handleSignals")(handleSignals.get.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(maskErrorDetails)) __obj.updateDynamic("maskErrorDetails")(maskErrorDetails.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxUncompressedReportSize)) __obj.updateDynamic("maxUncompressedReportSize")(maxUncompressedReportSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumRetryDelayMs)) __obj.updateDynamic("minimumRetryDelayMs")(minimumRetryDelayMs.get.asInstanceOf[js.Any])
    if (privateHeaders != null) __obj.updateDynamic("privateHeaders")(privateHeaders.asInstanceOf[js.Any])
    if (privateVariables != null) __obj.updateDynamic("privateVariables")(privateVariables.asInstanceOf[js.Any])
    if (reportErrorFunction != null) __obj.updateDynamic("reportErrorFunction")(js.Any.fromFunction1(reportErrorFunction))
    if (!js.isUndefined(reportIntervalMs)) __obj.updateDynamic("reportIntervalMs")(reportIntervalMs.get.asInstanceOf[js.Any])
    if (requestAgent != null) __obj.updateDynamic("requestAgent")(requestAgent.asInstanceOf[js.Any])
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1(rewriteError))
    if (schemaTag != null) __obj.updateDynamic("schemaTag")(schemaTag.asInstanceOf[js.Any])
    if (sendHeaders != null) __obj.updateDynamic("sendHeaders")(sendHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(sendReportsImmediately)) __obj.updateDynamic("sendReportsImmediately")(sendReportsImmediately.get.asInstanceOf[js.Any])
    if (sendVariableValues != null) __obj.updateDynamic("sendVariableValues")(sendVariableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineReportingOptions[TContext]]
  }
}

