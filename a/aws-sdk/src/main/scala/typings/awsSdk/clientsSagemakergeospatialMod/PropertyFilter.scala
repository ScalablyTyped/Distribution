package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyFilter extends StObject {
  
  /**
    * Represents a single property to match with when searching a raster data collection.
    */
  var Property: typings.awsSdk.clientsSagemakergeospatialMod.Property
}
object PropertyFilter {
  
  inline def apply(Property: Property): PropertyFilter = {
    val __obj = js.Dynamic.literal(Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyFilter] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: Property): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
  }
}
