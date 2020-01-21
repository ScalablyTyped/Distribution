package typings.applicationinsights

import typings.applicationinsights.telemetryClientMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/bunyan.sub", JSImport.Namespace)
@js.native
object bunyanSubMod extends js.Object {
  def dispose(): Unit = js.native
  def enable(enabled: Boolean, client: ^): Unit = js.native
}

