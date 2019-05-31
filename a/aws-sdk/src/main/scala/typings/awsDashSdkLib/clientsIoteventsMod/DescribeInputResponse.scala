package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInputResponse extends js.Object {
  /**
    * Information about the input.
    */
  var input: js.UndefOr[Input] = js.undefined
}

object DescribeInputResponse {
  @scala.inline
  def apply(input: Input = null): DescribeInputResponse = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    __obj.asInstanceOf[DescribeInputResponse]
  }
}

