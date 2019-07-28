package typings.alexaDashSdk.alexaDashSdkMod

import typings.alexaDashSdk.alexaDashSdkStrings.active
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
    val __obj = js.Dynamic.literal(name = name, state = state)
  
    __obj.asInstanceOf[CreateListParams]
  }
}

