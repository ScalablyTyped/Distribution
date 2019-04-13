package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbTdtSettings extends js.Object {
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
}

object DvbTdtSettings {
  @scala.inline
  def apply(RepInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RepInterval)) __obj.updateDynamic("RepInterval")(RepInterval)
    __obj.asInstanceOf[DvbTdtSettings]
  }
}

