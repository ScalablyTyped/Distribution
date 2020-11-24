package typings.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstStrong extends TextDirectionAlgorithm
object FirstStrong {
  
  @scala.inline
  def apply(checkRtl: (String, Double, Double) => Double): FirstStrong = {
    val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl))
    __obj.asInstanceOf[FirstStrong]
  }
}
