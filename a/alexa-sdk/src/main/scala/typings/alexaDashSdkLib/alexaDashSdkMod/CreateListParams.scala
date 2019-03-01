package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateListParams extends js.Object {
  var name: java.lang.String
  var state: alexaDashSdkLib.alexaDashSdkLibStrings.active
}

object CreateListParams {
  @scala.inline
  def apply(name: java.lang.String, state: alexaDashSdkLib.alexaDashSdkLibStrings.active): CreateListParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CreateListParams]
  }
}

