package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fps extends js.Object {
  var fps: scala.Double
  var leading: scala.Double
  var loop: scala.Boolean
  var maxWidth: scala.Double
  var text: java.lang.String
  var trailing: scala.Double
}

object Anon_Fps {
  @scala.inline
  def apply(
    fps: scala.Double,
    leading: scala.Double,
    loop: scala.Boolean,
    maxWidth: scala.Double,
    text: java.lang.String,
    trailing: scala.Double
  ): Anon_Fps = {
    val __obj = js.Dynamic.literal(fps = fps, leading = leading, loop = loop, maxWidth = maxWidth, text = text, trailing = trailing)
  
    __obj.asInstanceOf[Anon_Fps]
  }
}

