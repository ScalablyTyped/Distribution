package typings.alexaSdk.mod

import typings.alexaSdk.alexaSdkStrings.active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateListParams extends js.Object {
  var name: String
  var state: active
}

object CreateListParams {
  @scala.inline
  def apply(name: String, state: active): CreateListParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateListParams]
  }
}

