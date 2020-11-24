package typings.angularCompiler.parserMod

import typings.angularCompiler.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/parser", "SplitInterpolation")
@js.native
class SplitInterpolation protected () extends js.Object {
  def this(
    strings: js.Array[String],
    stringSpans: js.Array[End],
    expressions: js.Array[String],
    expressionsSpans: js.Array[End],
    offsets: js.Array[Double]
  ) = this()
  
  var expressions: js.Array[String] = js.native
  
  var expressionsSpans: js.Array[End] = js.native
  
  var offsets: js.Array[Double] = js.native
  
  var stringSpans: js.Array[End] = js.native
  
  var strings: js.Array[String] = js.native
}
