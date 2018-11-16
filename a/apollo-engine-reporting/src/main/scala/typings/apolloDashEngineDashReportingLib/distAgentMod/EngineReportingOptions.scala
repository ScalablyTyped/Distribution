package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EngineReportingOptions extends js.Object {
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
  var generateClientInfo: js.UndefOr[
    js.Function1[/* o */ apolloDashEngineDashReportingLib.Anon_Extensions, ClientInfo]
  ] = js.undefined
  var handleSignals: js.UndefOr[scala.Boolean] = js.undefined
  var maskErrorDetails: js.UndefOr[scala.Boolean] = js.undefined
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
  var maxUncompressedReportSize: js.UndefOr[scala.Double] = js.undefined
  var minimumRetryDelayMs: js.UndefOr[scala.Double] = js.undefined
  var privateHeaders: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var privateVariables: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var reportErrorFunction: js.UndefOr[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.undefined
  var reportIntervalMs: js.UndefOr[scala.Double] = js.undefined
  var sendReportsImmediately: js.UndefOr[scala.Boolean] = js.undefined
}

