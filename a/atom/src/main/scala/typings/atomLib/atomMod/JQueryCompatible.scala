package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCompatible[Element /* <: stdLib.Node */]
  extends stdLib.Iterable[Element] {
  var jquery: java.lang.String = js.native
}

