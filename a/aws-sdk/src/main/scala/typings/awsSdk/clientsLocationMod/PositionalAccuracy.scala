package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionalAccuracy extends StObject {
  
  /**
    * Estimated maximum distance, in meters, between the measured position and the true position of a device, along the Earth's surface.
    */
  var Horizontal: PositionalAccuracyHorizontalDouble
}
object PositionalAccuracy {
  
  inline def apply(Horizontal: PositionalAccuracyHorizontalDouble): PositionalAccuracy = {
    val __obj = js.Dynamic.literal(Horizontal = Horizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionalAccuracy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionalAccuracy] (val x: Self) extends AnyVal {
    
    inline def setHorizontal(value: PositionalAccuracyHorizontalDouble): Self = StObject.set(x, "Horizontal", value.asInstanceOf[js.Any])
  }
}
