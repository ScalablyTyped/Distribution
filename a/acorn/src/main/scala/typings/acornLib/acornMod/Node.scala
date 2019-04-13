package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Node")
@js.native
class Node protected () extends js.Object {
  def this(parser: Parser, pos: scala.Double, loc: scala.Double) = this()
  var end: scala.Double = js.native
  var loc: js.UndefOr[estreeLib.estreeMod.SourceLocation] = js.native
  var range: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
  var sourceFile: js.UndefOr[java.lang.String] = js.native
  var start: scala.Double = js.native
  var `type`: java.lang.String = js.native
}

