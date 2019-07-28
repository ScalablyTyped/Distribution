package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  /**
    * The ARN of the builder.
    */
  var ARN: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ARN] = js.undefined
}

object Builder {
  @scala.inline
  def apply(ARN: ARN = null): Builder = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    __obj.asInstanceOf[Builder]
  }
}

