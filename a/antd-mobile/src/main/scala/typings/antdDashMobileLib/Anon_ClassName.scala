package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: java.lang.String
  var fps: scala.Double
  var leading: scala.Double
  var loop: scala.Boolean
  var text: java.lang.String
  var trailing: scala.Double
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: java.lang.String,
    fps: scala.Double,
    leading: scala.Double,
    loop: scala.Boolean,
    text: java.lang.String,
    trailing: scala.Double
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, fps = fps, leading = leading, loop = loop, text = text, trailing = trailing)
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

