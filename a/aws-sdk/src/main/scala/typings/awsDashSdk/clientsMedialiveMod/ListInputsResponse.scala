package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInputsResponse extends js.Object {
  var Inputs: js.UndefOr[__listOfInput] = js.undefined
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListInputsResponse {
  @scala.inline
  def apply(Inputs: __listOfInput = null, NextToken: __string = null): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInputsResponse]
  }
}

