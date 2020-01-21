package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Node")
@js.native
class Node protected () extends js.Object {
  def this(parser: Parser, pos: Double, loc: Double) = this()
  var end: Double = js.native
  var loc: js.UndefOr[typings.estree.mod.SourceLocation] = js.native
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var sourceFile: js.UndefOr[String] = js.native
  var start: Double = js.native
  var `type`: String = js.native
}

