package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergePullRequestByThreeWayOutput extends StObject {
  
  var pullRequest: js.UndefOr[PullRequest] = js.undefined
}
object MergePullRequestByThreeWayOutput {
  
  inline def apply(): MergePullRequestByThreeWayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergePullRequestByThreeWayOutput]
  }
  
  extension [Self <: MergePullRequestByThreeWayOutput](x: Self) {
    
    inline def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    inline def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
  }
}
