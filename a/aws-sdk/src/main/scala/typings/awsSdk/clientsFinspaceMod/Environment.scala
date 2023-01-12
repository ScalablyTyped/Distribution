package typings.awsSdk.clientsFinspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * The ID of the AWS account in which the FinSpace environment is created.
    */
  var awsAccountId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The AWS account ID of the dedicated service account associated with your FinSpace environment.
    */
  var dedicatedServiceAccountId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The description of the FinSpace environment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of your FinSpace environment.
    */
  var environmentArn: js.UndefOr[EnvironmentArn] = js.undefined
  
  /**
    * The identifier of the FinSpace environment.
    */
  var environmentId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The sign-in url for the web application of your FinSpace environment.
    */
  var environmentUrl: js.UndefOr[url] = js.undefined
  
  /**
    * The authentication mode for the environment.
    */
  var federationMode: js.UndefOr[FederationMode] = js.undefined
  
  /**
    * Configuration information when authentication mode is FEDERATED.
    */
  var federationParameters: js.UndefOr[FederationParameters] = js.undefined
  
  /**
    * The KMS key id used to encrypt in the FinSpace environment.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The name of the FinSpace environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
  
  /**
    * The url of the integrated FinSpace notebook environment in your web application.
    */
  var sageMakerStudioDomainUrl: js.UndefOr[SmsDomainUrl] = js.undefined
  
  /**
    * The current status of creation of the FinSpace environment.
    */
  var status: js.UndefOr[EnvironmentStatus] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: IdType): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setDedicatedServiceAccountId(value: IdType): Self = StObject.set(x, "dedicatedServiceAccountId", value.asInstanceOf[js.Any])
    
    inline def setDedicatedServiceAccountIdUndefined: Self = StObject.set(x, "dedicatedServiceAccountId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentArn(value: EnvironmentArn): Self = StObject.set(x, "environmentArn", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentArnUndefined: Self = StObject.set(x, "environmentArn", js.undefined)
    
    inline def setEnvironmentId(value: IdType): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setEnvironmentUrl(value: url): Self = StObject.set(x, "environmentUrl", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUrlUndefined: Self = StObject.set(x, "environmentUrl", js.undefined)
    
    inline def setFederationMode(value: FederationMode): Self = StObject.set(x, "federationMode", value.asInstanceOf[js.Any])
    
    inline def setFederationModeUndefined: Self = StObject.set(x, "federationMode", js.undefined)
    
    inline def setFederationParameters(value: FederationParameters): Self = StObject.set(x, "federationParameters", value.asInstanceOf[js.Any])
    
    inline def setFederationParametersUndefined: Self = StObject.set(x, "federationParameters", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSageMakerStudioDomainUrl(value: SmsDomainUrl): Self = StObject.set(x, "sageMakerStudioDomainUrl", value.asInstanceOf[js.Any])
    
    inline def setSageMakerStudioDomainUrlUndefined: Self = StObject.set(x, "sageMakerStudioDomainUrl", js.undefined)
    
    inline def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
