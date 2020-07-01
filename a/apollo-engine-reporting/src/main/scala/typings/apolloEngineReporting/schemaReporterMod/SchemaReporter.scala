package typings.apolloEngineReporting.schemaReporterMod

import typings.apolloEngineReporting.reportingOperationTypesMod.EdgeServerInfo
import typings.apolloServerTypes.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/schemaReporter", "SchemaReporter")
@js.native
class SchemaReporter protected () extends js.Object {
  def this(
    serverInfo: EdgeServerInfo,
    schemaSdl: String,
    apiKey: String,
    schemaReportingEndpoint: js.UndefOr[String],
    logger: Logger
  ) = this()
  val executableSchemaDocument: js.Any = js.native
  var graphManagerQuery: js.Any = js.native
  val headers: js.Any = js.native
  var isStopped: js.Any = js.native
  val logger: js.Any = js.native
  val serverInfo: js.Any = js.native
  val url: js.Any = js.native
  def reportServerInfo(withExecutableSchema: Boolean): js.Promise[ReportInfoResult] = js.native
  def stop(): Unit = js.native
  def stopped(): Boolean = js.native
}

