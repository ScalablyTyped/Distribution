package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustX extends StObject {
  
  var adjustX: Double = js.native
  
  var adjustY: Double = js.native
}
object AdjustX {
  
  @scala.inline
  def apply(adjustX: Double, adjustY: Double): AdjustX = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustX]
  }
  
  @scala.inline
  implicit class AdjustXMutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustX(value: Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustY(value: Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
  }
}
