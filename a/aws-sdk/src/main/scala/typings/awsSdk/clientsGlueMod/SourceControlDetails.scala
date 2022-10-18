package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControlDetails extends StObject {
  
  /**
    * The type of authentication, which can be an authentication token stored in Amazon Web Services Secrets Manager, or a personal access token.
    */
  var AuthStrategy: js.UndefOr[SourceControlAuthStrategy] = js.undefined
  
  /**
    * The value of an authorization token.
    */
  var AuthToken: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * An optional branch in the remote repository.
    */
  var Branch: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * An optional folder in the remote repository.
    */
  var Folder: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * The last commit ID for a commit in the remote repository.
    */
  var LastCommitId: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * The owner of the remote repository that contains the job artifacts.
    */
  var Owner: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * The provider for the remote repository.
    */
  var Provider: js.UndefOr[SourceControlProvider] = js.undefined
  
  /**
    * The name of the remote repository that contains the job artifacts.
    */
  var Repository: js.UndefOr[Generic512CharString] = js.undefined
}
object SourceControlDetails {
  
  inline def apply(): SourceControlDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlDetails]
  }
  
  extension [Self <: SourceControlDetails](x: Self) {
    
    inline def setAuthStrategy(value: SourceControlAuthStrategy): Self = StObject.set(x, "AuthStrategy", value.asInstanceOf[js.Any])
    
    inline def setAuthStrategyUndefined: Self = StObject.set(x, "AuthStrategy", js.undefined)
    
    inline def setAuthToken(value: Generic512CharString): Self = StObject.set(x, "AuthToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "AuthToken", js.undefined)
    
    inline def setBranch(value: Generic512CharString): Self = StObject.set(x, "Branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "Branch", js.undefined)
    
    inline def setFolder(value: Generic512CharString): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "Folder", js.undefined)
    
    inline def setLastCommitId(value: Generic512CharString): Self = StObject.set(x, "LastCommitId", value.asInstanceOf[js.Any])
    
    inline def setLastCommitIdUndefined: Self = StObject.set(x, "LastCommitId", js.undefined)
    
    inline def setOwner(value: Generic512CharString): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setProvider(value: SourceControlProvider): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setRepository(value: Generic512CharString): Self = StObject.set(x, "Repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "Repository", js.undefined)
  }
}
