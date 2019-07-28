package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonPrefix extends js.Object {
  /**
    * 
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
}

object CommonPrefix {
  @scala.inline
  def apply(Prefix: Prefix = null): CommonPrefix = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[CommonPrefix]
  }
}

