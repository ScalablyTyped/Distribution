package typings.appBuilderLib.packagerMod

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.mod.Target
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildResult extends js.Object {
  val artifactPaths: js.Array[String]
  val configuration: Configuration
  val outDir: String
  val platformToTargets: Map[Platform, Map[String, Target]]
}

object BuildResult {
  @scala.inline
  def apply(
    artifactPaths: js.Array[String],
    configuration: Configuration,
    outDir: String,
    platformToTargets: Map[Platform, Map[String, Target]]
  ): BuildResult = {
    val __obj = js.Dynamic.literal(artifactPaths = artifactPaths.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], platformToTargets = platformToTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildResult]
  }
}

