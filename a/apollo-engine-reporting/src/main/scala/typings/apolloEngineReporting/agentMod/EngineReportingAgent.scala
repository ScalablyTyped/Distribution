package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReporting.extensionMod.EngineReportingExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/agent", "EngineReportingAgent")
@js.native
class EngineReportingAgent[TContext] () extends js.Object {
  def this(options: EngineReportingOptions[TContext]) = this()
  var apiKey: js.Any = js.native
  var getTraceSignature: js.Any = js.native
  var logger: js.Any = js.native
  var options: js.Any = js.native
  var reportHeaders: js.Any = js.native
  var reportSizes: js.Any = js.native
  var reportTimer: js.Any = js.native
  var reports: js.Any = js.native
  var resetReport: js.Any = js.native
  var sendAllReportsAndReportErrors: js.Any = js.native
  var sendReportAndReportErrors: js.Any = js.native
  var sendReportsImmediately: js.UndefOr[js.Any] = js.native
  var signalHandlers: js.Any = js.native
  var signatureCache: js.Any = js.native
  var stopped: js.Any = js.native
  def addTrace(hasTraceQueryHashDocumentASTOperationNameQueryStringSchemaHash: AddTraceArgs): js.Promise[Unit] = js.native
  def newExtension(schemaHash: String): EngineReportingExtension[TContext] = js.native
  def sendAllReports(): js.Promise[Unit] = js.native
  def sendReport(schemaHash: String): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
}

