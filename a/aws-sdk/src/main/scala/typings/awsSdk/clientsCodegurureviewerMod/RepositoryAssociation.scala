package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryAssociation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) identifying the repository association.
    */
  var AssociationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the repository association.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.AssociationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Web Services CodeStar Connections connection. Its format is arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id. For more information, see Connection in the Amazon Web Services CodeStar Connections API Reference.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ConnectionArn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the repository association was created.
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A KMSKeyDetails object that contains:   The encryption option for this repository association. It is either owned by Amazon Web Services Key Management Service (KMS) (AWS_OWNED_CMK) or customer managed (CUSTOMER_MANAGED_CMK).   The ID of the Amazon Web Services KMS key that is associated with this repository association.  
    */
  var KMSKeyDetails: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.KMSKeyDetails] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the repository association was last updated.
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the repository.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.Name] = js.undefined
  
  /**
    * The owner of the repository. For an Amazon Web Services CodeCommit repository, this is the Amazon Web Services account ID of the account that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for the account that owns the repository. For an S3 repository, it can be the username or Amazon Web Services account ID.
    */
  var Owner: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.Owner] = js.undefined
  
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ProviderType] = js.undefined
  
  var S3RepositoryDetails: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.S3RepositoryDetails] = js.undefined
  
  /**
    * The state of the repository association. The valid repository association states are:    Associated: The repository association is complete.    Associating: CodeGuru Reviewer is:   Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.  If your repository ProviderType is GitHub, GitHub Enterprise Server, or Bitbucket, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.    Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.      Failed: The repository failed to associate or disassociate.    Disassociating: CodeGuru Reviewer is removing the repository's pull request notifications and source code access.    Disassociated: CodeGuru Reviewer successfully disassociated the repository. You can create a new association with this repository if you want to review source code in it later. You can control access to code reviews created in anassociated repository with tags after it has been disassociated. For more information, see Using tags to control access to associated repositories in the Amazon CodeGuru Reviewer User Guide.  
    */
  var State: js.UndefOr[RepositoryAssociationState] = js.undefined
  
  /**
    * A description of why the repository association is in the current state.
    */
  var StateReason: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.StateReason] = js.undefined
}
object RepositoryAssociation {
  
  inline def apply(): RepositoryAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryAssociation] (val x: Self) extends AnyVal {
    
    inline def setAssociationArn(value: Arn): Self = StObject.set(x, "AssociationArn", value.asInstanceOf[js.Any])
    
    inline def setAssociationArnUndefined: Self = StObject.set(x, "AssociationArn", js.undefined)
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setCreatedTimeStamp(value: js.Date): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    inline def setKMSKeyDetails(value: KMSKeyDetails): Self = StObject.set(x, "KMSKeyDetails", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyDetailsUndefined: Self = StObject.set(x, "KMSKeyDetails", js.undefined)
    
    inline def setLastUpdatedTimeStamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeStampUndefined: Self = StObject.set(x, "LastUpdatedTimeStamp", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setS3RepositoryDetails(value: S3RepositoryDetails): Self = StObject.set(x, "S3RepositoryDetails", value.asInstanceOf[js.Any])
    
    inline def setS3RepositoryDetailsUndefined: Self = StObject.set(x, "S3RepositoryDetails", js.undefined)
    
    inline def setState(value: RepositoryAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
