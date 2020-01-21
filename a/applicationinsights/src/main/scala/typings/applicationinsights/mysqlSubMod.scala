package typings.applicationinsights

import typings.applicationinsights.telemetryClientMod.^
import typings.diagnosticChannel.mod.IStandardEvent
import typings.diagnosticChannelPublishers.mysqlPubMod.IMysqlData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/mysql.sub", JSImport.Namespace)
@js.native
object mysqlSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IMysqlData]): Unit = js.native
}

