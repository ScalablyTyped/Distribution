package typings.appBuilderLib.packagerMod

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.mod.Target
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildResult extends js.Object {
  
  val artifactPaths: js.Array[String] = js.native
  
  val configuration: Configuration = js.native
  
  val outDir: String = js.native
  
  val platformToTargets: Map[Platform, Map[String, Target]] = js.native
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
  
  @scala.inline
  implicit class BuildResultOps[Self <: BuildResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArtifactPathsVarargs(value: String*): Self = this.set("artifactPaths", js.Array(value :_*))
    
    @scala.inline
    def setArtifactPaths(value: js.Array[String]): Self = this.set("artifactPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: Configuration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDir(value: String): Self = this.set("outDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformToTargets(value: Map[Platform, Map[String, Target]]): Self = this.set("platformToTargets", value.asInstanceOf[js.Any])
  }
}
