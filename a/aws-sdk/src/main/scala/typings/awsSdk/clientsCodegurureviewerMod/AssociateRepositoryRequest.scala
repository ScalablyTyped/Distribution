package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateRepositoryRequest extends StObject {
  
  /**
    * Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository associations if there are failures and retries.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ClientRequestToken] = js.undefined
  
  /**
    * A KMSKeyDetails object that contains:   The encryption option for this repository association. It is either owned by Amazon Web Services Key Management Service (KMS) (AWS_OWNED_CMK) or customer managed (CUSTOMER_MANAGED_CMK).   The ID of the Amazon Web Services KMS key that is associated with this repository association.  
    */
  var KMSKeyDetails: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.KMSKeyDetails] = js.undefined
  
  /**
    * The repository to associate.
    */
  var Repository: typings.awsSdk.clientsCodegurureviewerMod.Repository
  
  /**
    * An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two parts:   A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case sensitive.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object AssociateRepositoryRequest {
  
  inline def apply(Repository: Repository): AssociateRepositoryRequest = {
    val __obj = js.Dynamic.literal(Repository = Repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRepositoryRequest]
  }
  
  extension [Self <: AssociateRepositoryRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setKMSKeyDetails(value: KMSKeyDetails): Self = StObject.set(x, "KMSKeyDetails", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyDetailsUndefined: Self = StObject.set(x, "KMSKeyDetails", js.undefined)
    
    inline def setRepository(value: Repository): Self = StObject.set(x, "Repository", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
