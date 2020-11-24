package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentComputeType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentPullCredentialsType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Computetype extends js.Object {
  
  var `compute-type`: CodeBuildEnvironmentComputeType = js.native
  
  var `environment-variables`: js.Array[Name] = js.native
  
  var image: String = js.native
  
  var `image-pull-credentials-type`: js.UndefOr[CodeBuildEnvironmentPullCredentialsType] = js.native
  
  var `privileged-mode`: Boolean = js.native
  
  var `type`: CodeBuildEnvironmentType = js.native
}
object Computetype {
  
  @scala.inline
  def apply(
    `compute-type`: CodeBuildEnvironmentComputeType,
    `environment-variables`: js.Array[Name],
    image: String,
    `privileged-mode`: Boolean,
    `type`: CodeBuildEnvironmentType
  ): Computetype = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("compute-type")(`compute-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("environment-variables")(`environment-variables`.asInstanceOf[js.Any])
    __obj.updateDynamic("privileged-mode")(`privileged-mode`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Computetype]
  }
  
  @scala.inline
  implicit class ComputetypeOps[Self <: Computetype] (val x: Self) extends AnyVal {
    
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
    def `setCompute-type`(value: CodeBuildEnvironmentComputeType): Self = this.set("compute-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEnvironment-variablesVarargs`(value: Name*): Self = this.set("environment-variables", js.Array(value :_*))
    
    @scala.inline
    def `setEnvironment-variables`(value: js.Array[Name]): Self = this.set("environment-variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrivileged-mode`(value: Boolean): Self = this.set("privileged-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeBuildEnvironmentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImage-pull-credentials-type`(value: CodeBuildEnvironmentPullCredentialsType): Self = this.set("image-pull-credentials-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteImage-pull-credentials-type`: Self = this.set("image-pull-credentials-type", js.undefined)
  }
}
