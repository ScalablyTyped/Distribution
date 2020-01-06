package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildsForProjectOutput extends js.Object {
  /**
    * A list of build IDs for the specified build project, with each build ID representing a single build.
    */
  var ids: js.UndefOr[BuildIds] = js.native
  /**
    * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListBuildsForProjectOutput {
  @scala.inline
  def apply(ids: BuildIds = null, nextToken: String = null): ListBuildsForProjectOutput = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBuildsForProjectOutput]
  }
}

