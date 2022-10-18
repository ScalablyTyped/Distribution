package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestDescriptionOutput extends StObject {
  
  /**
    * Information about the updated pull request.
    */
  var pullRequest: PullRequest
}
object UpdatePullRequestDescriptionOutput {
  
  inline def apply(pullRequest: PullRequest): UpdatePullRequestDescriptionOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestDescriptionOutput]
  }
  
  extension [Self <: UpdatePullRequestDescriptionOutput](x: Self) {
    
    inline def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
  }
}
