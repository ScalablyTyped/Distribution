package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInputRequest extends js.Object {
  /**
    * The name of the input.
    */
  var inputName: InputName
}

object DescribeInputRequest {
  @scala.inline
  def apply(inputName: InputName): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(inputName = inputName)
  
    __obj.asInstanceOf[DescribeInputRequest]
  }
}

