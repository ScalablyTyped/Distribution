package typings.awsSdk.clientsFinspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentRequest extends StObject {
  
  /**
    * The list of Amazon Resource Names (ARN) of the data bundles to install. Currently supported data bundle ARNs:    arn:aws:finspace:${Region}::data-bundle/capital-markets-sample - Contains sample Capital Markets datasets, categories and controlled vocabularies.    arn:aws:finspace:${Region}::data-bundle/taq (default) - Contains trades and quotes data in addition to sample Capital Markets data.  
    */
  var dataBundles: js.UndefOr[DataBundleArns] = js.undefined
  
  /**
    * The description of the FinSpace environment to be created.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Authentication mode for the environment.    FEDERATED - Users access FinSpace through Single Sign On (SSO) via your Identity provider.    LOCAL - Users access FinSpace via email and password managed within the FinSpace environment.  
    */
  var federationMode: js.UndefOr[FederationMode] = js.undefined
  
  /**
    * Configuration information when authentication mode is FEDERATED.
    */
  var federationParameters: js.UndefOr[FederationParameters] = js.undefined
  
  /**
    * The KMS key id to encrypt your data in the FinSpace environment.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The name of the FinSpace environment to be created.
    */
  var name: EnvironmentName
  
  /**
    * Configuration information for the superuser.
    */
  var superuserParameters: js.UndefOr[SuperuserParameters] = js.undefined
  
  /**
    * Add tags to your FinSpace environment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateEnvironmentRequest {
  
  inline def apply(name: EnvironmentName): CreateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setDataBundles(value: DataBundleArns): Self = StObject.set(x, "dataBundles", value.asInstanceOf[js.Any])
    
    inline def setDataBundlesUndefined: Self = StObject.set(x, "dataBundles", js.undefined)
    
    inline def setDataBundlesVarargs(value: DataBundleArn*): Self = StObject.set(x, "dataBundles", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFederationMode(value: FederationMode): Self = StObject.set(x, "federationMode", value.asInstanceOf[js.Any])
    
    inline def setFederationModeUndefined: Self = StObject.set(x, "federationMode", js.undefined)
    
    inline def setFederationParameters(value: FederationParameters): Self = StObject.set(x, "federationParameters", value.asInstanceOf[js.Any])
    
    inline def setFederationParametersUndefined: Self = StObject.set(x, "federationParameters", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSuperuserParameters(value: SuperuserParameters): Self = StObject.set(x, "superuserParameters", value.asInstanceOf[js.Any])
    
    inline def setSuperuserParametersUndefined: Self = StObject.set(x, "superuserParameters", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
