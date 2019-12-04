package typings.applicationinsights

import typings.applicationinsights.outLibraryTelemetryClientMod.^
import typings.diagnosticDashChannel.diagnosticDashChannelMod.IStandardEvent
import typings.diagnosticDashChannelDashPublishers.distSrcPgDotPubMod.IPostgresData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/postgres.sub", JSImport.Namespace)
@js.native
object outAutoCollectionDiagnosticDashChannelPostgresDotSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IPostgresData]): Unit = js.native
}

