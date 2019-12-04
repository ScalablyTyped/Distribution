package typings.applicationinsights

import typings.applicationinsights.outLibraryTelemetryClientMod.^
import typings.diagnosticDashChannel.diagnosticDashChannelMod.IStandardEvent
import typings.diagnosticDashChannelDashPublishers.distSrcMysqlDotPubMod.IMysqlData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/mysql.sub", JSImport.Namespace)
@js.native
object outAutoCollectionDiagnosticDashChannelMysqlDotSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IMysqlData]): Unit = js.native
}

