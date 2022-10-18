package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSourceControlFromJobRequest extends StObject {
  
  /**
    * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager, or a personal access token.
    */
  var AuthStrategy: js.UndefOr[SourceControlAuthStrategy] = js.undefined
  
  /**
    * The value of the authorization token.
    */
  var AuthToken: js.UndefOr[AuthTokenString] = js.undefined
  
  /**
    * An optional branch in the remote repository.
    */
  var BranchName: js.UndefOr[NameString] = js.undefined
  
  /**
    * A commit ID for a commit in the remote repository.
    */
  var CommitId: js.UndefOr[CommitIdString] = js.undefined
  
  /**
    * An optional folder in the remote repository.
    */
  var Folder: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name of the Glue job to be synchronized to or from the remote repository.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The provider for the remote repository.
    */
  var Provider: js.UndefOr[SourceControlProvider] = js.undefined
  
  /**
    * The name of the remote repository that contains the job artifacts.
    */
  var RepositoryName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The owner of the remote repository that contains the job artifacts.
    */
  var RepositoryOwner: js.UndefOr[NameString] = js.undefined
}
object UpdateSourceControlFromJobRequest {
  
  inline def apply(): UpdateSourceControlFromJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSourceControlFromJobRequest]
  }
  
  extension [Self <: UpdateSourceControlFromJobRequest](x: Self) {
    
    inline def setAuthStrategy(value: SourceControlAuthStrategy): Self = StObject.set(x, "AuthStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthStrategyUndefined: Self = StObject.set(x, "AuthStrategy", js.undefined)
    
    inline def setAuthToken(value: AuthTokenString): Self = StObject.set(x, "AuthToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "AuthToken", js.undefined)
    
    inline def setBranchName(value: NameString): Self = StObject.set(x, "BranchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "BranchName", js.undefined)
    
    inline def setCommitId(value: CommitIdString): Self = StObject.set(x, "CommitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "CommitId", js.undefined)
    
    inline def setFolder(value: NameString): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "Folder", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setProvider(value: SourceControlProvider): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setRepositoryName(value: NameString): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "RepositoryName", js.undefined)
    
    inline def setRepositoryOwner(value: NameString): Self = StObject.set(x, "RepositoryOwner", value.asInstanceOf[js.Any])
    
    inline def setRepositoryOwnerUndefined: Self = StObject.set(x, "RepositoryOwner", js.undefined)
  }
}
