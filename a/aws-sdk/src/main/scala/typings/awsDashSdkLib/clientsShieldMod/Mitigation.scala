package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mitigation extends js.Object {
  /**
    * The name of the mitigation taken for this attack.
    */
  var MitigationName: js.UndefOr[String] = js.undefined
}

object Mitigation {
  @scala.inline
  def apply(MitigationName: String = null): Mitigation = {
    val __obj = js.Dynamic.literal()
    if (MitigationName != null) __obj.updateDynamic("MitigationName")(MitigationName)
    __obj.asInstanceOf[Mitigation]
  }
}

