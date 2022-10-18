package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCommentForPullRequestInput extends StObject {
  
  /**
    * The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request when you post the comment.
    */
  var afterCommitId: CommitId
  
  /**
    * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.
    */
  var beforeCommitId: CommitId
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The content of your comment on the change.
    */
  var content: Content
  
  /**
    * The location of the change where you want to post your comment. If no location is provided, the comment is posted as a general comment on the pull request difference between the before commit ID and the after commit ID.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  
  /**
    * The name of the repository where you want to post a comment on a pull request.
    */
  var repositoryName: RepositoryName
}
object PostCommentForPullRequestInput {
  
  inline def apply(
    afterCommitId: CommitId,
    beforeCommitId: CommitId,
    content: Content,
    pullRequestId: PullRequestId,
    repositoryName: RepositoryName
  ): PostCommentForPullRequestInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], beforeCommitId = beforeCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForPullRequestInput]
  }
  
  extension [Self <: PostCommentForPullRequestInput](x: Self) {
    
    inline def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    inline def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
