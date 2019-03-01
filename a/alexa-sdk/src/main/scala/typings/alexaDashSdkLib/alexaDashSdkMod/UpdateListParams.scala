package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateListParams extends js.Object {
  var name: java.lang.String
  var state: ListObjectState
  var version: scala.Double
}

object UpdateListParams {
  @scala.inline
  def apply(name: java.lang.String, state: ListObjectState, version: scala.Double): UpdateListParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UpdateListParams]
  }
}

