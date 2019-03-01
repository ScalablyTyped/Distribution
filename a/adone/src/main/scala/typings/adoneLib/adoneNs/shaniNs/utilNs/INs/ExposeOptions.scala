package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExposeOptions extends js.Object {
  /**
    * Whether to copy the fail and failException properties
    */
  var includeFail: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * prefix to give assertions
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ExposeOptions {
  @scala.inline
  def apply(includeFail: js.UndefOr[scala.Boolean] = js.undefined, prefix: java.lang.String = null): ExposeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeFail)) __obj.updateDynamic("includeFail")(includeFail)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ExposeOptions]
  }
}

