package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolutionValueContainer extends js.Object {
  var value: ResolutionValue
}

object ResolutionValueContainer {
  @scala.inline
  def apply(value: ResolutionValue): ResolutionValueContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ResolutionValueContainer]
  }
}

