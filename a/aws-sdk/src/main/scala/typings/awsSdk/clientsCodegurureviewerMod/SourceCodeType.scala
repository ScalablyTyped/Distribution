package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeType extends StObject {
  
  /**
    * A type of SourceCodeType that specifies a source branch name and a destination branch name in an associated repository.
    */
  var BranchDiff: js.UndefOr[BranchDiffSourceCodeType] = js.undefined
  
  /**
    * A SourceCodeType that specifies a commit diff created by a pull request on an associated repository.
    */
  var CommitDiff: js.UndefOr[CommitDiffSourceCodeType] = js.undefined
  
  var RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType] = js.undefined
  
  /**
    * Metadata that is associated with a code review. This applies to any type of code review supported by CodeGuru Reviewer. The RequestMetadaa field captures any event metadata. For example, it might capture metadata associated with an event trigger, such as a push or a pull request.
    */
  var RequestMetadata: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RequestMetadata] = js.undefined
  
  /**
    * Information about an associated repository in an S3 bucket that includes its name and an S3RepositoryDetails object. The S3RepositoryDetails object includes the name of an S3 bucket, an S3 key for a source code .zip file, and an S3 key for a build artifacts .zip file. S3BucketRepository is required in SourceCodeType for S3BucketRepository based code reviews.
    */
  var S3BucketRepository: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.S3BucketRepository] = js.undefined
}
object SourceCodeType {
  
  inline def apply(): SourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCodeType]
  }
  
  extension [Self <: SourceCodeType](x: Self) {
    
    inline def setBranchDiff(value: BranchDiffSourceCodeType): Self = StObject.set(x, "BranchDiff", value.asInstanceOf[js.Any])
    
    inline def setBranchDiffUndefined: Self = StObject.set(x, "BranchDiff", js.undefined)
    
    inline def setCommitDiff(value: CommitDiffSourceCodeType): Self = StObject.set(x, "CommitDiff", value.asInstanceOf[js.Any])
    
    inline def setCommitDiffUndefined: Self = StObject.set(x, "CommitDiff", js.undefined)
    
    inline def setRepositoryHead(value: RepositoryHeadSourceCodeType): Self = StObject.set(x, "RepositoryHead", value.asInstanceOf[js.Any])
    
    inline def setRepositoryHeadUndefined: Self = StObject.set(x, "RepositoryHead", js.undefined)
    
    inline def setRequestMetadata(value: RequestMetadata): Self = StObject.set(x, "RequestMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequestMetadataUndefined: Self = StObject.set(x, "RequestMetadata", js.undefined)
    
    inline def setS3BucketRepository(value: S3BucketRepository): Self = StObject.set(x, "S3BucketRepository", value.asInstanceOf[js.Any])
    
    inline def setS3BucketRepositoryUndefined: Self = StObject.set(x, "S3BucketRepository", js.undefined)
  }
}
