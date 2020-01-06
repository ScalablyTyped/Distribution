package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexProgramsResponse extends js.Object {
  /**
    * List of multiplex programs.
    */
  var MultiplexPrograms: js.UndefOr[__listOfMultiplexProgramSummary] = js.native
  /**
    * Token for the next ListMultiplexProgram request.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListMultiplexProgramsResponse {
  @scala.inline
  def apply(MultiplexPrograms: __listOfMultiplexProgramSummary = null, NextToken: __string = null): ListMultiplexProgramsResponse = {
    val __obj = js.Dynamic.literal()
    if (MultiplexPrograms != null) __obj.updateDynamic("MultiplexPrograms")(MultiplexPrograms.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultiplexProgramsResponse]
  }
}

