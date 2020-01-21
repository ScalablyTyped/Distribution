package typings.applicationinsights

import typings.applicationinsights.telemetryClientMod.^
import typings.diagnosticChannel.mod.IStandardEvent
import typings.diagnosticChannelPublishers.pgPubMod.IPostgresData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/postgres.sub", JSImport.Namespace)
@js.native
object postgresSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IPostgresData]): Unit = js.native
}

