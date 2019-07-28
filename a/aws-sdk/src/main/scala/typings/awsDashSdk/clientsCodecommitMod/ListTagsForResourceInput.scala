package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceInput extends js.Object {
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource for which you want to get information about tags, if any.
    */
  var resourceArn: ResourceArn
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, nextToken: NextToken = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

