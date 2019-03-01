package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolutionStatus extends js.Object {
  var code: java.lang.String
}

object ResolutionStatus {
  @scala.inline
  def apply(code: java.lang.String): ResolutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[ResolutionStatus]
  }
}

