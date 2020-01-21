package typings.applicationinsights

import typings.applicationinsights.telemetryClientMod.^
import typings.diagnosticChannel.mod.IStandardEvent
import typings.diagnosticChannelPublishers.redisPubMod.IRedisData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/redis.sub", JSImport.Namespace)
@js.native
object redisSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IRedisData]): Unit = js.native
}

