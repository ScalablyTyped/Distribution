package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var fps: Double
  var leading: Double
  var loop: Boolean
  var text: String
  var trailing: Double
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String, fps: Double, leading: Double, loop: Boolean, text: String, trailing: Double): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, fps = fps, leading = leading, loop = loop, text = text, trailing = trailing)
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

