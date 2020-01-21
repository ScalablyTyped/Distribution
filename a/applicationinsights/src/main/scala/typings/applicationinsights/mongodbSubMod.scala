package typings.applicationinsights

import typings.applicationinsights.telemetryClientMod.^
import typings.diagnosticChannel.mod.IStandardEvent
import typings.diagnosticChannelPublishers.mongodbPubMod.IMongoData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/mongodb.sub", JSImport.Namespace)
@js.native
object mongodbSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IMongoData]): Unit = js.native
}

