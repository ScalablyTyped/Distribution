package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbTdtSettings extends js.Object {
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var TdtInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
}

object DvbTdtSettings {
  @scala.inline
  def apply(TdtInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(TdtInterval)) __obj.updateDynamic("TdtInterval")(TdtInterval)
    __obj.asInstanceOf[DvbTdtSettings]
  }
}

