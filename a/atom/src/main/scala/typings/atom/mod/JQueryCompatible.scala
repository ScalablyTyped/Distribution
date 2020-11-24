package typings.atom.mod

import typings.std.Iterable
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCompatible[Element /* <: Node */] extends Iterable[Element] {
  
  var jquery: String = js.native
}
