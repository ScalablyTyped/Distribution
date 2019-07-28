package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListScriptsOutput extends js.Object {
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Set of properties describing the requested script.
    */
  var Scripts: js.UndefOr[ScriptList] = js.undefined
}

object ListScriptsOutput {
  @scala.inline
  def apply(NextToken: NonEmptyString = null, Scripts: ScriptList = null): ListScriptsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Scripts != null) __obj.updateDynamic("Scripts")(Scripts)
    __obj.asInstanceOf[ListScriptsOutput]
  }
}

