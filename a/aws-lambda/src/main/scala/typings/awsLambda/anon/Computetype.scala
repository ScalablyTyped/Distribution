package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentComputeType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentPullCredentialsType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Computetype extends StObject {
  
  var `compute-type`: CodeBuildEnvironmentComputeType
  
  var `environment-variables`: js.Array[Name]
  
  var image: String
  
  var `image-pull-credentials-type`: js.UndefOr[CodeBuildEnvironmentPullCredentialsType] = js.undefined
  
  var `privileged-mode`: Boolean
  
  var `type`: CodeBuildEnvironmentType
}
object Computetype {
  
  inline def apply(
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
  
  extension [Self <: Computetype](x: Self) {
    
    inline def `setCompute-type`(value: CodeBuildEnvironmentComputeType): Self = StObject.set(x, "compute-type", value.asInstanceOf[js.Any])
    
    inline def `setEnvironment-variables`(value: js.Array[Name]): Self = StObject.set(x, "environment-variables", value.asInstanceOf[js.Any])
    
    inline def `setEnvironment-variablesVarargs`(value: Name*): Self = StObject.set(x, "environment-variables", js.Array(value :_*))
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def `setImage-pull-credentials-type`(value: CodeBuildEnvironmentPullCredentialsType): Self = StObject.set(x, "image-pull-credentials-type", value.asInstanceOf[js.Any])
    
    inline def `setImage-pull-credentials-typeUndefined`: Self = StObject.set(x, "image-pull-credentials-type", js.undefined)
    
    inline def `setPrivileged-mode`(value: Boolean): Self = StObject.set(x, "privileged-mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeBuildEnvironmentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
