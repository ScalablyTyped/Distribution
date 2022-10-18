package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestSourceReferenceUpdatedEventMetadata extends StObject {
  
  /**
    * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The name of the repository where the pull request was updated.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object PullRequestSourceReferenceUpdatedEventMetadata {
  
  inline def apply(): PullRequestSourceReferenceUpdatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
  }
  
  extension [Self <: PullRequestSourceReferenceUpdatedEventMetadata](x: Self) {
    
    inline def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    inline def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
    
    inline def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    inline def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    inline def setMergeBase(value: CommitId): Self = StObject.set(x, "mergeBase", value.asInstanceOf[js.Any])
    
    inline def setMergeBaseUndefined: Self = StObject.set(x, "mergeBase", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
