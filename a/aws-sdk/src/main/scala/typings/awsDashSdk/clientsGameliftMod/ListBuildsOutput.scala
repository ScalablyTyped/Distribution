package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBuildsOutput extends js.Object {
  /**
    * A collection of build records that match the request.
    */
  var Builds: js.UndefOr[BuildList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListBuildsOutput {
  @scala.inline
  def apply(Builds: BuildList = null, NextToken: NonEmptyString = null): ListBuildsOutput = {
    val __obj = js.Dynamic.literal()
    if (Builds != null) __obj.updateDynamic("Builds")(Builds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBuildsOutput]
  }
}

