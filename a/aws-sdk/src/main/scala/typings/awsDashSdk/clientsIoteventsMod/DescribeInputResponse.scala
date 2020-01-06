package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputResponse extends js.Object {
  /**
    * Information about the input.
    */
  var input: js.UndefOr[Input] = js.native
}

object DescribeInputResponse {
  @scala.inline
  def apply(input: Input = null): DescribeInputResponse = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputResponse]
  }
}

