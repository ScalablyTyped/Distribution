package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestStatusOutput extends StObject {
  
  /**
    * Information about the pull request.
    */
  var pullRequest: PullRequest
}
object UpdatePullRequestStatusOutput {
  
  inline def apply(pullRequest: PullRequest): UpdatePullRequestStatusOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestStatusOutput]
  }
  
  extension [Self <: UpdatePullRequestStatusOutput](x: Self) {
    
    inline def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
  }
}
