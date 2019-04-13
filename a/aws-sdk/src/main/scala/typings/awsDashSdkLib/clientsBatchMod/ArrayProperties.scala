package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayProperties extends js.Object {
  /**
    * The size of the array job.
    */
  var size: js.UndefOr[Integer] = js.undefined
}

object ArrayProperties {
  @scala.inline
  def apply(size: js.UndefOr[Integer] = js.undefined): ArrayProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ArrayProperties]
  }
}

