package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Warning extends js.Object {
  /**
    * The error code for the warning.
    */
  var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * A list of the pages that the warning applies to.
    */
  var Pages: js.UndefOr[Pages] = js.undefined
}

object Warning {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, Pages: Pages = null): Warning = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Pages != null) __obj.updateDynamic("Pages")(Pages)
    __obj.asInstanceOf[Warning]
  }
}

