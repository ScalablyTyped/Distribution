package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestStatusChangedEventMetadata extends StObject {
  
  /**
    * The changed status of the pull request.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.undefined
}
object PullRequestStatusChangedEventMetadata {
  
  inline def apply(): PullRequestStatusChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
  }
  
  extension [Self <: PullRequestStatusChangedEventMetadata](x: Self) {
    
    inline def setPullRequestStatus(value: PullRequestStatusEnum): Self = StObject.set(x, "pullRequestStatus", value.asInstanceOf[js.Any])
    
    inline def setPullRequestStatusUndefined: Self = StObject.set(x, "pullRequestStatus", js.undefined)
  }
}
