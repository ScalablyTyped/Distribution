package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateListParams extends js.Object {
  var name: String
  var state: ListObjectState
  var version: Double
}

object UpdateListParams {
  @scala.inline
  def apply(name: String, state: ListObjectState, version: Double): UpdateListParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListParams]
  }
}

