package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectEnvironment extends StObject {
  
  /**
    * The certificate to use with this build project.
    */
  var Certificate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A set of environment variables to make available to builds for the build project.
    */
  var EnvironmentVariables: js.UndefOr[AwsCodeBuildProjectEnvironmentEnvironmentVariablesList] = js.undefined
  
  /**
    * The type of credentials CodeBuild uses to pull images in your build. Valid values:    CODEBUILD specifies that CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust the CodeBuild service principal.    SERVICE_ROLE specifies that CodeBuild uses your build project's service role.   When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an CodeBuild curated image, you must use CODEBUILD credentials.
    */
  var ImagePullCredentialsType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether to allow the Docker daemon to run inside a Docker container. Set to true if the build project is used to build Docker images.
    */
  var PrivilegedMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The credentials for access to a private registry.
    */
  var RegistryCredential: js.UndefOr[AwsCodeBuildProjectEnvironmentRegistryCredential] = js.undefined
  
  /**
    * The type of build environment to use for related builds. The environment type ARM_CONTAINER is available only in Regions US East (N. Virginia), US East (Ohio), US West (Oregon), Europe (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific (Sydney), and Europe (Frankfurt). The environment type LINUX_CONTAINER with compute type build.general1.2xlarge is available only in Regions US East (N. Virginia), US East (N. Virginia), US West (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia). The environment type LINUX_GPU_CONTAINER is available only in Regions US East (N. Virginia), US East (N. Virginia), US West (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China (Beijing), and China (Ningxia). Valid values: WINDOWS_CONTAINER | LINUX_CONTAINER | LINUX_GPU_CONTAINER | ARM_CONTAINER 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCodeBuildProjectEnvironment {
  
  inline def apply(): AwsCodeBuildProjectEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCodeBuildProjectEnvironment] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: NonEmptyString): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setEnvironmentVariables(value: AwsCodeBuildProjectEnvironmentEnvironmentVariablesList): Self = StObject.set(x, "EnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "EnvironmentVariables", js.undefined)
    
    inline def setEnvironmentVariablesVarargs(value: AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails*): Self = StObject.set(x, "EnvironmentVariables", js.Array(value*))
    
    inline def setImagePullCredentialsType(value: NonEmptyString): Self = StObject.set(x, "ImagePullCredentialsType", value.asInstanceOf[js.Any])
    
    inline def setImagePullCredentialsTypeUndefined: Self = StObject.set(x, "ImagePullCredentialsType", js.undefined)
    
    inline def setPrivilegedMode(value: Boolean): Self = StObject.set(x, "PrivilegedMode", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedModeUndefined: Self = StObject.set(x, "PrivilegedMode", js.undefined)
    
    inline def setRegistryCredential(value: AwsCodeBuildProjectEnvironmentRegistryCredential): Self = StObject.set(x, "RegistryCredential", value.asInstanceOf[js.Any])
    
    inline def setRegistryCredentialUndefined: Self = StObject.set(x, "RegistryCredential", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
