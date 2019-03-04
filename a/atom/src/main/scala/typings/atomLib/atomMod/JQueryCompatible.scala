package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCompatible[Element /* <: stdLib.Node */]
  extends nodeLib.Iterable[Element] {
  var jquery: java.lang.String
}

object JQueryCompatible {
  @scala.inline
  def apply[Element /* <: stdLib.Node */](jquery: java.lang.String): JQueryCompatible[Element] = {
    val __obj = js.Dynamic.literal(jquery = jquery)
  
    __obj.asInstanceOf[JQueryCompatible[Element]]
  }
}

