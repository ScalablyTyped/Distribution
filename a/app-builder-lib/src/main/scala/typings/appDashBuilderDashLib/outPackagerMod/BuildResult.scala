package typings.appDashBuilderDashLib.outPackagerMod

import typings.appDashBuilderDashLib.outConfigurationMod.Configuration
import typings.appDashBuilderDashLib.outMod.Platform
import typings.appDashBuilderDashLib.outMod.Target
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
    val __obj = js.Dynamic.literal(artifactPaths = artifactPaths, configuration = configuration, outDir = outDir, platformToTargets = platformToTargets)
  
    __obj.asInstanceOf[BuildResult]
  }
}

