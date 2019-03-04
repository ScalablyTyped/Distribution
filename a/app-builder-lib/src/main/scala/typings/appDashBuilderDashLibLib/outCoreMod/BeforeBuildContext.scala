package typings
package appDashBuilderDashLibLib.outCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeBuildContext extends js.Object {
  val appDir: java.lang.String
  val arch: java.lang.String
  val electronVersion: java.lang.String
  val platform: Platform
}

object BeforeBuildContext {
  @scala.inline
  def apply(
    appDir: java.lang.String,
    arch: java.lang.String,
    electronVersion: java.lang.String,
    platform: Platform
  ): BeforeBuildContext = {
    val __obj = js.Dynamic.literal(appDir = appDir, arch = arch, electronVersion = electronVersion, platform = platform)
  
    __obj.asInstanceOf[BeforeBuildContext]
  }
}

