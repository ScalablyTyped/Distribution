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

