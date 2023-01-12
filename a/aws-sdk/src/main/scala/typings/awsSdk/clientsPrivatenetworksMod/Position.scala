package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  /**
    * The elevation of the equipment at this position.
    */
  var elevation: js.UndefOr[Double] = js.undefined
  
  /**
    * The reference point from which elevation is reported.
    */
  var elevationReference: js.UndefOr[ElevationReference] = js.undefined
  
  /**
    * The units used to measure the elevation of the position.
    */
  var elevationUnit: js.UndefOr[ElevationUnit] = js.undefined
  
  /**
    * The latitude of the position.
    */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /**
    * The longitude of the position.
    */
  var longitude: js.UndefOr[Double] = js.undefined
}
object Position {
  
  inline def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationReference(value: ElevationReference): Self = StObject.set(x, "elevationReference", value.asInstanceOf[js.Any])
    
    inline def setElevationReferenceUndefined: Self = StObject.set(x, "elevationReference", js.undefined)
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setElevationUnit(value: ElevationUnit): Self = StObject.set(x, "elevationUnit", value.asInstanceOf[js.Any])
    
    inline def setElevationUnitUndefined: Self = StObject.set(x, "elevationUnit", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
