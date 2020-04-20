package typings.antDesignReactNative.stepsItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderIconParams extends js.Object {
  var error: Boolean
  var starting: Boolean
  var waiting: Boolean
}

object RenderIconParams {
  @scala.inline
  def apply(error: Boolean, starting: Boolean, waiting: Boolean): RenderIconParams = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], starting = starting.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderIconParams]
  }
}

