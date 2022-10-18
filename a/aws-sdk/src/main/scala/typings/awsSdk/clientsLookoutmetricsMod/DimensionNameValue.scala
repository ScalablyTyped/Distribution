package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionNameValue extends StObject {
  
  /**
    * The name of the dimension.
    */
  var DimensionName: ColumnName
  
  /**
    * The value of the dimension.
    */
  var DimensionValue: typings.awsSdk.clientsLookoutmetricsMod.DimensionValue
}
object DimensionNameValue {
  
  inline def apply(DimensionName: ColumnName, DimensionValue: DimensionValue): DimensionNameValue = {
    val __obj = js.Dynamic.literal(DimensionName = DimensionName.asInstanceOf[js.Any], DimensionValue = DimensionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionNameValue]
  }
  
  extension [Self <: DimensionNameValue](x: Self) {
    
    inline def setDimensionName(value: ColumnName): Self = StObject.set(x, "DimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionValue(value: DimensionValue): Self = StObject.set(x, "DimensionValue", value.asInstanceOf[js.Any])
  }
}
