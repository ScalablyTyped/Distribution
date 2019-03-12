package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCompatible[Element /* <: stdLib.Node */]
  extends stdLib.Iterable[Element] {
  var jquery: java.lang.String
}

object JQueryCompatible {
  @scala.inline
  def apply[Element /* <: stdLib.Node */](iterator: () => stdLib.Iterator[Element], jquery: java.lang.String): JQueryCompatible[Element] = {
    val __obj = js.Dynamic.literal(iterator = js.Any.fromFunction0(iterator), jquery = jquery)
  
    __obj.asInstanceOf[JQueryCompatible[Element]]
  }
}

