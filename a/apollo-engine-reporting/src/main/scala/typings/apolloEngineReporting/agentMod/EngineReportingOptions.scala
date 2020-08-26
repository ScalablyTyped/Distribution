package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReporting.apolloEngineReportingBooleans.`false`
import typings.apolloServerEnv.fetchMod.RequestAgent
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.GraphQLRequestContextDidEncounterErrors
import typings.apolloServerTypes.mod.GraphQLRequestContextDidResolveOperation
import typings.apolloServerTypes.mod.Logger
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineReportingOptions[TContext] extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var calculateSignature: js.UndefOr[js.Function2[/* ast */ DocumentNode, /* operationName */ String, String]] = js.native
  var debugPrintReports: js.UndefOr[Boolean] = js.native
  var endpointUrl: js.UndefOr[String] = js.native
  var experimental_overrideReportedSchema: js.UndefOr[String] = js.native
  var experimental_schemaReporting: js.UndefOr[Boolean] = js.native
  var experimental_schemaReportingInitialDelayMaxMs: js.UndefOr[Double] = js.native
  var generateClientInfo: js.UndefOr[GenerateClientInfo[TContext]] = js.native
  var graphVariant: js.UndefOr[String] = js.native
  var handleSignals: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var maskErrorDetails: js.UndefOr[Boolean] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var maxUncompressedReportSize: js.UndefOr[Double] = js.native
  var minimumRetryDelayMs: js.UndefOr[Double] = js.native
  var overrideReportedSchema: js.UndefOr[String] = js.native
  var privateHeaders: js.UndefOr[js.Array[String] | Boolean] = js.native
  var privateVariables: js.UndefOr[js.Array[String] | Boolean] = js.native
  var reportErrorFunction: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  var reportIntervalMs: js.UndefOr[Double] = js.native
  var reportSchema: js.UndefOr[Boolean] = js.native
  var reportTiming: js.UndefOr[ReportTimingOptions[TContext]] = js.native
  var requestAgent: js.UndefOr[RequestAgent | `false`] = js.native
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.native
  var schemaReportingInitialDelayMaxMs: js.UndefOr[Double] = js.native
  var schemaReportingUrl: js.UndefOr[String] = js.native
  var schemaTag: js.UndefOr[String] = js.native
  var sendHeaders: js.UndefOr[SendValuesBaseOptions] = js.native
  var sendReportsImmediately: js.UndefOr[Boolean] = js.native
  var sendVariableValues: js.UndefOr[VariableValueOptions] = js.native
  var tracesEndpointUrl: js.UndefOr[String] = js.native
}

object EngineReportingOptions {
  @scala.inline
  def apply[TContext](): EngineReportingOptions[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineReportingOptions[TContext]]
  }
  @scala.inline
  implicit class EngineReportingOptionsOps[Self <: EngineReportingOptions[_], TContext] (val x: Self with EngineReportingOptions[TContext]) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    @scala.inline
    def setCalculateSignature(value: (/* ast */ DocumentNode, /* operationName */ String) => String): Self = this.set("calculateSignature", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCalculateSignature: Self = this.set("calculateSignature", js.undefined)
    @scala.inline
    def setDebugPrintReports(value: Boolean): Self = this.set("debugPrintReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugPrintReports: Self = this.set("debugPrintReports", js.undefined)
    @scala.inline
    def setEndpointUrl(value: String): Self = this.set("endpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointUrl: Self = this.set("endpointUrl", js.undefined)
    @scala.inline
    def setExperimental_overrideReportedSchema(value: String): Self = this.set("experimental_overrideReportedSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental_overrideReportedSchema: Self = this.set("experimental_overrideReportedSchema", js.undefined)
    @scala.inline
    def setExperimental_schemaReporting(value: Boolean): Self = this.set("experimental_schemaReporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental_schemaReporting: Self = this.set("experimental_schemaReporting", js.undefined)
    @scala.inline
    def setExperimental_schemaReportingInitialDelayMaxMs(value: Double): Self = this.set("experimental_schemaReportingInitialDelayMaxMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental_schemaReportingInitialDelayMaxMs: Self = this.set("experimental_schemaReportingInitialDelayMaxMs", js.undefined)
    @scala.inline
    def setGenerateClientInfo(value: /* requestContext */ GraphQLRequestContext[TContext] => ClientInfo): Self = this.set("generateClientInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGenerateClientInfo: Self = this.set("generateClientInfo", js.undefined)
    @scala.inline
    def setGraphVariant(value: String): Self = this.set("graphVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphVariant: Self = this.set("graphVariant", js.undefined)
    @scala.inline
    def setHandleSignals(value: Boolean): Self = this.set("handleSignals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleSignals: Self = this.set("handleSignals", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMaskErrorDetails(value: Boolean): Self = this.set("maskErrorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskErrorDetails: Self = this.set("maskErrorDetails", js.undefined)
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    @scala.inline
    def setMaxUncompressedReportSize(value: Double): Self = this.set("maxUncompressedReportSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUncompressedReportSize: Self = this.set("maxUncompressedReportSize", js.undefined)
    @scala.inline
    def setMinimumRetryDelayMs(value: Double): Self = this.set("minimumRetryDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumRetryDelayMs: Self = this.set("minimumRetryDelayMs", js.undefined)
    @scala.inline
    def setOverrideReportedSchema(value: String): Self = this.set("overrideReportedSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideReportedSchema: Self = this.set("overrideReportedSchema", js.undefined)
    @scala.inline
    def setPrivateHeadersVarargs(value: String*): Self = this.set("privateHeaders", js.Array(value :_*))
    @scala.inline
    def setPrivateHeaders(value: js.Array[String] | Boolean): Self = this.set("privateHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateHeaders: Self = this.set("privateHeaders", js.undefined)
    @scala.inline
    def setPrivateVariablesVarargs(value: String*): Self = this.set("privateVariables", js.Array(value :_*))
    @scala.inline
    def setPrivateVariables(value: js.Array[String] | Boolean): Self = this.set("privateVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateVariables: Self = this.set("privateVariables", js.undefined)
    @scala.inline
    def setReportErrorFunction(value: /* err */ Error => Unit): Self = this.set("reportErrorFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReportErrorFunction: Self = this.set("reportErrorFunction", js.undefined)
    @scala.inline
    def setReportIntervalMs(value: Double): Self = this.set("reportIntervalMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportIntervalMs: Self = this.set("reportIntervalMs", js.undefined)
    @scala.inline
    def setReportSchema(value: Boolean): Self = this.set("reportSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportSchema: Self = this.set("reportSchema", js.undefined)
    @scala.inline
    def setReportTimingFunction1(
      value: /* request */ GraphQLRequestContextDidResolveOperation[TContext] | GraphQLRequestContextDidEncounterErrors[TContext] => js.Promise[Boolean]
    ): Self = this.set("reportTiming", js.Any.fromFunction1(value))
    @scala.inline
    def setReportTiming(value: ReportTimingOptions[TContext]): Self = this.set("reportTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportTiming: Self = this.set("reportTiming", js.undefined)
    @scala.inline
    def setRequestAgent(value: RequestAgent | `false`): Self = this.set("requestAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestAgent: Self = this.set("requestAgent", js.undefined)
    @scala.inline
    def setRewriteError(value: /* err */ GraphQLError => GraphQLError | Null): Self = this.set("rewriteError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRewriteError: Self = this.set("rewriteError", js.undefined)
    @scala.inline
    def setSchemaReportingInitialDelayMaxMs(value: Double): Self = this.set("schemaReportingInitialDelayMaxMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaReportingInitialDelayMaxMs: Self = this.set("schemaReportingInitialDelayMaxMs", js.undefined)
    @scala.inline
    def setSchemaReportingUrl(value: String): Self = this.set("schemaReportingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaReportingUrl: Self = this.set("schemaReportingUrl", js.undefined)
    @scala.inline
    def setSchemaTag(value: String): Self = this.set("schemaTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaTag: Self = this.set("schemaTag", js.undefined)
    @scala.inline
    def setSendHeaders(value: SendValuesBaseOptions): Self = this.set("sendHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendHeaders: Self = this.set("sendHeaders", js.undefined)
    @scala.inline
    def setSendReportsImmediately(value: Boolean): Self = this.set("sendReportsImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendReportsImmediately: Self = this.set("sendReportsImmediately", js.undefined)
    @scala.inline
    def setSendVariableValues(value: VariableValueOptions): Self = this.set("sendVariableValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendVariableValues: Self = this.set("sendVariableValues", js.undefined)
    @scala.inline
    def setTracesEndpointUrl(value: String): Self = this.set("tracesEndpointUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracesEndpointUrl: Self = this.set("tracesEndpointUrl", js.undefined)
  }
  
}

