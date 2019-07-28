package typings.alexaDashSdk.alexaDashSdkMod

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
    val __obj = js.Dynamic.literal(name = name, state = state, version = version)
  
    __obj.asInstanceOf[UpdateListParams]
  }
}

