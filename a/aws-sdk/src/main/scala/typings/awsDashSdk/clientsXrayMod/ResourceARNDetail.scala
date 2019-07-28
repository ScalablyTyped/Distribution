package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceARNDetail extends js.Object {
  /**
    * The ARN of a corresponding resource.
    */
  var ARN: js.UndefOr[String] = js.undefined
}

object ResourceARNDetail {
  @scala.inline
  def apply(ARN: String = null): ResourceARNDetail = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    __obj.asInstanceOf[ResourceARNDetail]
  }
}

