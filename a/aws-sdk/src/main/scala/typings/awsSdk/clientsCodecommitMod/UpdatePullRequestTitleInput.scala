package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestTitleInput extends StObject {
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
  
  /**
    * The updated title of the pull request. This replaces the existing title.
    */
  var title: Title
}
object UpdatePullRequestTitleInput {
  
  inline def apply(pullRequestId: PullRequestId, title: Title): UpdatePullRequestTitleInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestTitleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePullRequestTitleInput] (val x: Self) extends AnyVal {
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
