package typings.atom.atomMod

import typings.std.Iterable
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCompatible[Element /* <: Node */] extends Iterable[Element] {
  var jquery: String = js.native
}

