package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaOfInterest extends StObject {
  
  /**
    * A GeoJSON object representing the geographic extent in the coordinate space.
    */
  var AreaOfInterestGeometry: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.AreaOfInterestGeometry] = js.undefined
}
object AreaOfInterest {
  
  inline def apply(): AreaOfInterest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaOfInterest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaOfInterest] (val x: Self) extends AnyVal {
    
    inline def setAreaOfInterestGeometry(value: AreaOfInterestGeometry): Self = StObject.set(x, "AreaOfInterestGeometry", value.asInstanceOf[js.Any])
    
    inline def setAreaOfInterestGeometryUndefined: Self = StObject.set(x, "AreaOfInterestGeometry", js.undefined)
  }
}
