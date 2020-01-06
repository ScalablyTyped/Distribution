package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbTdtSettings extends js.Object {
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[__integerMin1000Max30000] = js.native
}

object DvbTdtSettings {
  @scala.inline
  def apply(RepInterval: Int | Double = null): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    if (RepInterval != null) __obj.updateDynamic("RepInterval")(RepInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbTdtSettings]
  }
}

