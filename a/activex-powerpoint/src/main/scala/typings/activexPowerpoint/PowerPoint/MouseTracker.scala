package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseTracker extends StObject {
  
  def EndTrack(X: Double, Y: Double): Unit
  
  def OnTrack(X: Double, Y: Double): Unit
  
  /* private */ @JSName("PowerPoint.MouseTracker_typekey")
  var PowerPointDotMouseTracker_typekey: MouseTracker
}
object MouseTracker {
  
  inline def apply(
    EndTrack: (Double, Double) => Unit,
    OnTrack: (Double, Double) => Unit,
    PowerPointDotMouseTracker_typekey: MouseTracker
  ): MouseTracker = {
    val __obj = js.Dynamic.literal(EndTrack = js.Any.fromFunction2(EndTrack), OnTrack = js.Any.fromFunction2(OnTrack))
    __obj.updateDynamic("PowerPoint.MouseTracker_typekey")(PowerPointDotMouseTracker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTracker]
  }
  
  extension [Self <: MouseTracker](x: Self) {
    
    inline def setEndTrack(value: (Double, Double) => Unit): Self = StObject.set(x, "EndTrack", js.Any.fromFunction2(value))
    
    inline def setOnTrack(value: (Double, Double) => Unit): Self = StObject.set(x, "OnTrack", js.Any.fromFunction2(value))
    
    inline def setPowerPointDotMouseTracker_typekey(value: MouseTracker): Self = StObject.set(x, "PowerPoint.MouseTracker_typekey", value.asInstanceOf[js.Any])
  }
}
