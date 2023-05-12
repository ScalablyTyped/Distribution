package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionCoordinates extends StObject {
  
  /**
    * Cartesian coordinates.
    */
  var cartesianCoordinates: js.UndefOr[CartesianCoordinates] = js.undefined
}
object PositionCoordinates {
  
  inline def apply(): PositionCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionCoordinates] (val x: Self) extends AnyVal {
    
    inline def setCartesianCoordinates(value: CartesianCoordinates): Self = StObject.set(x, "cartesianCoordinates", value.asInstanceOf[js.Any])
    
    inline def setCartesianCoordinatesUndefined: Self = StObject.set(x, "cartesianCoordinates", js.undefined)
  }
}
