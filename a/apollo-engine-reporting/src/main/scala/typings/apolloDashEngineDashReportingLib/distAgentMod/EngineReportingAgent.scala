package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/agent", "EngineReportingAgent")
@js.native
class EngineReportingAgent[TContext] () extends js.Object {
  def this(options: EngineReportingOptions) = this()
  var apiKey: js.Any = js.native
  var options: js.Any = js.native
  var report: js.Any = js.native
  var reportSize: js.Any = js.native
  var reportTimer: js.Any = js.native
  var resetReport: js.Any = js.native
  var sendReportAndReportErrors: js.Any = js.native
  var sendReportsImmediately: js.UndefOr[js.Any] = js.native
  var stopped: js.Any = js.native
  def addTrace(
    signature: java.lang.String,
    operationName: java.lang.String,
    trace: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Trace
  ): scala.Unit = js.native
  def newExtension(): apolloDashEngineDashReportingLib.distExtensionMod.EngineReportingExtension[TContext] = js.native
  def sendReport(): stdLib.Promise[scala.Unit] = js.native
  def stop(): scala.Unit = js.native
}

