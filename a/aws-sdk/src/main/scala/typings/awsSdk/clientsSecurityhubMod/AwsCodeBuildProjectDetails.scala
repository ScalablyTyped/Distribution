package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectDetails extends StObject {
  
  /**
    * Information about the build artifacts for the CodeBuild project.
    */
  var Artifacts: js.UndefOr[AwsCodeBuildProjectArtifactsList] = js.undefined
  
  /**
    * The KMS key used to encrypt the build output artifacts. You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format alias/alias-name). 
    */
  var EncryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the build environment for this build project.
    */
  var Environment: js.UndefOr[AwsCodeBuildProjectEnvironment] = js.undefined
  
  /**
    * Information about logs for the build project.
    */
  var LogsConfig: js.UndefOr[AwsCodeBuildProjectLogsConfigDetails] = js.undefined
  
  /**
    * The name of the build project.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the secondary artifacts for the CodeBuild project.
    */
  var SecondaryArtifacts: js.UndefOr[AwsCodeBuildProjectArtifactsList] = js.undefined
  
  /**
    * The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on behalf of the Amazon Web Services account.
    */
  var ServiceRole: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the build input source code for this build project.
    */
  var Source: js.UndefOr[AwsCodeBuildProjectSource] = js.undefined
  
  /**
    * Information about the VPC configuration that CodeBuild accesses.
    */
  var VpcConfig: js.UndefOr[AwsCodeBuildProjectVpcConfig] = js.undefined
}
object AwsCodeBuildProjectDetails {
  
  inline def apply(): AwsCodeBuildProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCodeBuildProjectDetails] (val x: Self) extends AnyVal {
    
    inline def setArtifacts(value: AwsCodeBuildProjectArtifactsList): Self = StObject.set(x, "Artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "Artifacts", js.undefined)
    
    inline def setArtifactsVarargs(value: AwsCodeBuildProjectArtifactsDetails*): Self = StObject.set(x, "Artifacts", js.Array(value*))
    
    inline def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    inline def setEnvironment(value: AwsCodeBuildProjectEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setLogsConfig(value: AwsCodeBuildProjectLogsConfigDetails): Self = StObject.set(x, "LogsConfig", value.asInstanceOf[js.Any])
    
    inline def setLogsConfigUndefined: Self = StObject.set(x, "LogsConfig", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecondaryArtifacts(value: AwsCodeBuildProjectArtifactsList): Self = StObject.set(x, "SecondaryArtifacts", value.asInstanceOf[js.Any])
    
    inline def setSecondaryArtifactsUndefined: Self = StObject.set(x, "SecondaryArtifacts", js.undefined)
    
    inline def setSecondaryArtifactsVarargs(value: AwsCodeBuildProjectArtifactsDetails*): Self = StObject.set(x, "SecondaryArtifacts", js.Array(value*))
    
    inline def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    inline def setSource(value: AwsCodeBuildProjectSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setVpcConfig(value: AwsCodeBuildProjectVpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
