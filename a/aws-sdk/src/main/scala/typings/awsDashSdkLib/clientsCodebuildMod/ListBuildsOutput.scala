package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBuildsOutput extends js.Object {
  /**
    * A list of build IDs, with each build ID representing a single build.
    */
  var ids: js.UndefOr[BuildIds] = js.undefined
  /**
    * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListBuildsOutput {
  @scala.inline
  def apply(ids: BuildIds = null, nextToken: String = null): ListBuildsOutput = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBuildsOutput]
  }
}

