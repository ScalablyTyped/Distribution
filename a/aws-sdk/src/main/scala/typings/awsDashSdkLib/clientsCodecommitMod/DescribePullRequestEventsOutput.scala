package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePullRequestEventsOutput extends js.Object {
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
  @scala.inline
  def apply(pullRequestEvents: PullRequestEventList, nextToken: NextToken = null): DescribePullRequestEventsOutput = {
    val __obj = js.Dynamic.literal(pullRequestEvents = pullRequestEvents)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribePullRequestEventsOutput]
  }
}

