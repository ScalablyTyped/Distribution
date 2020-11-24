package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildSourceLocationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buildspec extends js.Object {
  
  var buildspec: String = js.native
  
  var location: String = js.native
  
  var `type`: CodeBuildSourceLocationType = js.native
}
object Buildspec {
  
  @scala.inline
  def apply(buildspec: String, location: String, `type`: CodeBuildSourceLocationType): Buildspec = {
    val __obj = js.Dynamic.literal(buildspec = buildspec.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildspec]
  }
  
  @scala.inline
  implicit class BuildspecOps[Self <: Buildspec] (val x: Self) extends AnyVal {
    
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
    def setBuildspec(value: String): Self = this.set("buildspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeBuildSourceLocationType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
