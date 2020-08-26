package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "SourceLocation")
@js.native
class SourceLocation protected () extends js.Object {
  def this(p: Parser, start: Position, end: Position) = this()
  var end: Position = js.native
  var source: js.UndefOr[String | Null] = js.native
  var start: Position = js.native
}

