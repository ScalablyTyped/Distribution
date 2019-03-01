package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceZip64Format extends js.Object {
  /**
    * If true, packet will include the ZIP64 End of Central Directory Locator and ZIP64 End of Central Directory Record
    * regardless of whether or not they are required (this may be useful for testing.).
    * Otherwise, packer will include these structures if necessary
    */
  var forceZip64Format: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ForceZip64Format {
  @scala.inline
  def apply(forceZip64Format: js.UndefOr[scala.Boolean] = js.undefined): Anon_ForceZip64Format = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format)
    __obj.asInstanceOf[Anon_ForceZip64Format]
  }
}

