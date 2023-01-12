package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePullRequestEventsOutput extends StObject {
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Information about the pull request events.
    */
  var pullRequestEvents: PullRequestEventList
}
object DescribePullRequestEventsOutput {
  
  inline def apply(pullRequestEvents: PullRequestEventList): DescribePullRequestEventsOutput = {
    val __obj = js.Dynamic.literal(pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePullRequestEventsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePullRequestEventsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPullRequestEvents(value: PullRequestEventList): Self = StObject.set(x, "pullRequestEvents", value.asInstanceOf[js.Any])
    
    inline def setPullRequestEventsVarargs(value: PullRequestEvent*): Self = StObject.set(x, "pullRequestEvents", js.Array(value*))
  }
}
