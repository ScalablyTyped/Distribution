package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestStatusInput extends StObject {
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  
  /**
    * The status of the pull request. The only valid operations are to update the status from OPEN to OPEN, OPEN to CLOSED or from CLOSED to CLOSED.
    */
  var pullRequestStatus: PullRequestStatusEnum
}
object UpdatePullRequestStatusInput {
  
  inline def apply(pullRequestId: PullRequestId, pullRequestStatus: PullRequestStatusEnum): UpdatePullRequestStatusInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], pullRequestStatus = pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestStatusInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePullRequestStatusInput] (val x: Self) extends AnyVal {
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    inline def setPullRequestStatus(value: PullRequestStatusEnum): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
  }
}
