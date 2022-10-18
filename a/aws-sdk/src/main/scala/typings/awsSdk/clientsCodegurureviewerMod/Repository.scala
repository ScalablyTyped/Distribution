package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repository extends StObject {
  
  /**
    *  Information about a Bitbucket repository. 
    */
  var Bitbucket: js.UndefOr[ThirdPartySourceRepository] = js.undefined
  
  /**
    * Information about an Amazon Web Services CodeCommit repository.
    */
  var CodeCommit: js.UndefOr[CodeCommitRepository] = js.undefined
  
  /**
    * Information about a GitHub Enterprise Server repository.
    */
  var GitHubEnterpriseServer: js.UndefOr[ThirdPartySourceRepository] = js.undefined
  
  var S3Bucket: js.UndefOr[S3Repository] = js.undefined
}
object Repository {
  
  inline def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  
  extension [Self <: Repository](x: Self) {
    
    inline def setBitbucket(value: ThirdPartySourceRepository): Self = StObject.set(x, "Bitbucket", value.asInstanceOf[js.Any])
    
    inline def setBitbucketUndefined: Self = StObject.set(x, "Bitbucket", js.undefined)
    
    inline def setCodeCommit(value: CodeCommitRepository): Self = StObject.set(x, "CodeCommit", value.asInstanceOf[js.Any])
    
    inline def setCodeCommitUndefined: Self = StObject.set(x, "CodeCommit", js.undefined)
    
    inline def setGitHubEnterpriseServer(value: ThirdPartySourceRepository): Self = StObject.set(x, "GitHubEnterpriseServer", value.asInstanceOf[js.Any])
    
    inline def setGitHubEnterpriseServerUndefined: Self = StObject.set(x, "GitHubEnterpriseServer", js.undefined)
    
    inline def setS3Bucket(value: S3Repository): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
  }
}
