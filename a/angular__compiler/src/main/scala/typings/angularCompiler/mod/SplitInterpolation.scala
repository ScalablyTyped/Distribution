package typings.angularCompiler.mod

import typings.angularCompiler.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SplitInterpolation")
@js.native
class SplitInterpolation protected ()
  extends typings.angularCompiler.compilerMod.SplitInterpolation {
  def this(
    strings: js.Array[String],
    stringSpans: js.Array[End],
    expressions: js.Array[String],
    expressionsSpans: js.Array[End],
    offsets: js.Array[Double]
  ) = this()
}
