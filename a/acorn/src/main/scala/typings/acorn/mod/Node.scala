package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn", "Node")
@js.native
class Node protected () extends js.Object {
  def this(parser: Parser, pos: Double) = this()
  def this(parser: Parser, pos: Double, loc: SourceLocation) = this()
  
  var end: Double = js.native
  
  var loc: js.UndefOr[SourceLocation] = js.native
  
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var sourceFile: js.UndefOr[String] = js.native
  
  var start: Double = js.native
  
  var `type`: String = js.native
}
