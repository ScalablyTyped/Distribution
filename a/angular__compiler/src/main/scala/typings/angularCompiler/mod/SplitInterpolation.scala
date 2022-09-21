package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SplitInterpolation")
@js.native
open class SplitInterpolation protected () extends StObject {
  def this(
    strings: js.Array[InterpolationPiece],
    expressions: js.Array[InterpolationPiece],
    offsets: js.Array[Double]
  ) = this()
  
  var expressions: js.Array[InterpolationPiece] = js.native
  
  var offsets: js.Array[Double] = js.native
  
  var strings: js.Array[InterpolationPiece] = js.native
}
