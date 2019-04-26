package typings
package architectLib.architectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("architect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createApp(config: Config): Architect = js.native
  def createApp(config: Config, callback: js.Function2[/* err */ stdLib.Error, /* app */ Architect, scala.Unit]): Architect = js.native
  def loadConfig(configPath: java.lang.String): scala.Unit = js.native
  def loadConfig(
    configPath: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* config */ Config, scala.Unit]
  ): scala.Unit = js.native
}

