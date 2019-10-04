package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPipelinesInput extends js.Object {
  /**
    * An identifier that was returned from the previous list pipelines call. It can be used to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListPipelinesInput {
  @scala.inline
  def apply(nextToken: NextToken = null): ListPipelinesInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListPipelinesInput]
  }
}

