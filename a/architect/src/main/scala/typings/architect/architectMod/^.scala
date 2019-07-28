package typings.architect.architectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("architect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createApp(config: Config): Architect = js.native
  def createApp(config: Config, callback: js.Function2[/* err */ Error, /* app */ Architect, Unit]): Architect = js.native
  def loadConfig(configPath: String): Unit = js.native
  def loadConfig(configPath: String, callback: js.Function2[/* err */ Error, /* config */ Config, Unit]): Unit = js.native
}

