package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the repository.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsCodecommitMod.Arn] = js.undefined
  
  /**
    * The ID of the AWS account associated with the repository.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  var cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.undefined
  
  /**
    * The URL to use for cloning the repository over SSH.
    */
  var cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.undefined
  
  /**
    * The date and time the repository was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The repository's default branch name.
    */
  var defaultBranch: js.UndefOr[BranchName] = js.undefined
  
  /**
    * The date and time the repository was last modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A comment or description about the repository.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
  
  /**
    * The ID of the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.undefined
  
  /**
    * The repository's name.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object RepositoryMetadata {
  
  inline def apply(): RepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryMetadata]
  }
  
  extension [Self <: RepositoryMetadata](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCloneUrlHttp(value: CloneUrlHttp): Self = StObject.set(x, "cloneUrlHttp", value.asInstanceOf[js.Any])
    
    inline def setCloneUrlHttpUndefined: Self = StObject.set(x, "cloneUrlHttp", js.undefined)
    
    inline def setCloneUrlSsh(value: CloneUrlSsh): Self = StObject.set(x, "cloneUrlSsh", value.asInstanceOf[js.Any])
    
    inline def setCloneUrlSshUndefined: Self = StObject.set(x, "cloneUrlSsh", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDefaultBranch(value: BranchName): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
    
    inline def setDefaultBranchUndefined: Self = StObject.set(x, "defaultBranch", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setRepositoryDescription(value: RepositoryDescription): Self = StObject.set(x, "repositoryDescription", value.asInstanceOf[js.Any])
    
    inline def setRepositoryDescriptionUndefined: Self = StObject.set(x, "repositoryDescription", js.undefined)
    
    inline def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
