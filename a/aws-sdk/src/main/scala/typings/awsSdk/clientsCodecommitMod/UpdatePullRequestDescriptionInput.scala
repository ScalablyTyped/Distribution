package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestDescriptionInput extends StObject {
  
  /**
    * The updated content of the description for the pull request. This content replaces the existing description.
    */
  var description: Description
  
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId
}
object UpdatePullRequestDescriptionInput {
  
  inline def apply(description: Description, pullRequestId: PullRequestId): UpdatePullRequestDescriptionInput = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestDescriptionInput]
  }
  
  extension [Self <: UpdatePullRequestDescriptionInput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
