package typings.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDirectionHeuristic extends StObject {
  
  def isRtl(cs: String, start: Double, count: Double): Boolean = js.native
}
object TextDirectionHeuristic {
  
  @scala.inline
  def apply(isRtl: (String, Double, Double) => Boolean): TextDirectionHeuristic = {
    val __obj = js.Dynamic.literal(isRtl = js.Any.fromFunction3(isRtl))
    __obj.asInstanceOf[TextDirectionHeuristic]
  }
  
  @scala.inline
  implicit class TextDirectionHeuristicMutableBuilder[Self <: TextDirectionHeuristic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRtl(value: (String, Double, Double) => Boolean): Self = StObject.set(x, "isRtl", js.Any.fromFunction3(value))
  }
}
