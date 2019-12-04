package typings.applicationinsights

import typings.applicationinsights.outLibraryTelemetryClientMod.^
import typings.diagnosticDashChannel.diagnosticDashChannelMod.IStandardEvent
import typings.diagnosticDashChannelDashPublishers.distSrcRedisDotPubMod.IRedisData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/redis.sub", JSImport.Namespace)
@js.native
object outAutoCollectionDiagnosticDashChannelRedisDotSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IRedisData]): Unit = js.native
}

