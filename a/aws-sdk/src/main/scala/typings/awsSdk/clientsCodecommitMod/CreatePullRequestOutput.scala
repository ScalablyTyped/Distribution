package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePullRequestOutput extends StObject {
  
  /**
    * Information about the newly created pull request.
    */
  var pullRequest: PullRequest
}
object CreatePullRequestOutput {
  
  inline def apply(pullRequest: PullRequest): CreatePullRequestOutput = {
    val __obj = js.Dynamic.literal(pullRequest = pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullRequestOutput]
  }
  
  extension [Self <: CreatePullRequestOutput](x: Self) {
    
    inline def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
  }
}
