package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionFilter extends StObject {
  
  /**
    * The dimension name to be matched.
    */
  var Name: DimensionName
  
  /**
    * The value of the dimension to be matched.
    */
  var Value: js.UndefOr[DimensionValue] = js.undefined
}
object DimensionFilter {
  
  inline def apply(Name: DimensionName): DimensionFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilter]
  }
  
  extension [Self <: DimensionFilter](x: Self) {
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
