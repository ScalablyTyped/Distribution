package typings.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeBuildContext extends js.Object {
  val appDir: String
  val arch: String
  val electronVersion: String
  val platform: Platform
}

object BeforeBuildContext {
  @scala.inline
  def apply(appDir: String, arch: String, electronVersion: String, platform: Platform): BeforeBuildContext = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronVersion = electronVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeBuildContext]
  }
}

