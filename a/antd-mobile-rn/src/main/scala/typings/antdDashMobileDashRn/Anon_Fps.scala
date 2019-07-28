package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fps extends js.Object {
  var fps: Double
  var leading: Double
  var loop: Boolean
  var maxWidth: Double
  var text: String
  var trailing: Double
}

object Anon_Fps {
  @scala.inline
  def apply(fps: Double, leading: Double, loop: Boolean, maxWidth: Double, text: String, trailing: Double): Anon_Fps = {
    val __obj = js.Dynamic.literal(fps = fps, leading = leading, loop = loop, maxWidth = maxWidth, text = text, trailing = trailing)
  
    __obj.asInstanceOf[Anon_Fps]
  }
}

