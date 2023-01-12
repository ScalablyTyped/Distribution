package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergePullRequestByFastForwardOutput extends StObject {
  
  /**
    * Information about the specified pull request, including the merge.
    */
  var pullRequest: js.UndefOr[PullRequest] = js.undefined
}
object MergePullRequestByFastForwardOutput {
  
  inline def apply(): MergePullRequestByFastForwardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergePullRequestByFastForwardOutput] (val x: Self) extends AnyVal {
    
    inline def setPullRequest(value: PullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    inline def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
  }
}
