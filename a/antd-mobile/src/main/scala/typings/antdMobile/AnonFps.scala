package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFps extends js.Object {
  var className: String
  var fps: Double
  var leading: Double
  var loop: Boolean
  var text: String
  var trailing: Double
}

object AnonFps {
  @scala.inline
  def apply(className: String, fps: Double, leading: Double, loop: Boolean, text: String, trailing: Double): AnonFps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFps]
  }
}

