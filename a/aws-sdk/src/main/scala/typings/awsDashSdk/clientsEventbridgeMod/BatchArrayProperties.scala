package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchArrayProperties extends js.Object {
  /**
    * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
    */
  var Size: js.UndefOr[Integer] = js.undefined
}

object BatchArrayProperties {
  @scala.inline
  def apply(Size: js.UndefOr[Integer] = js.undefined): BatchArrayProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[BatchArrayProperties]
  }
}

