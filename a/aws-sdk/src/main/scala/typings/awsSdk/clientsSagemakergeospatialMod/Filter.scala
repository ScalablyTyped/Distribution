package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The maximum value of the filter.
    */
  var Maximum: js.UndefOr[Float] = js.undefined
  
  /**
    * The minimum value of the filter.
    */
  var Minimum: js.UndefOr[Float] = js.undefined
  
  /**
    * The name of the filter.
    */
  var Name: String
  
  /**
    * The type of the filter being used.
    */
  var Type: String
}
object Filter {
  
  inline def apply(Name: String, Type: String): Filter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: Float): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
    
    inline def setMinimum(value: Float): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "Minimum", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
