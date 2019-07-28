package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportInstanceResult extends js.Object {
  /**
    * Information about the conversion task.
    */
  var ConversionTask: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ConversionTask] = js.undefined
}

object ImportInstanceResult {
  @scala.inline
  def apply(ConversionTask: ConversionTask = null): ImportInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (ConversionTask != null) __obj.updateDynamic("ConversionTask")(ConversionTask)
    __obj.asInstanceOf[ImportInstanceResult]
  }
}

