package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionValuesWithAttributes extends StObject {
  
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Attributes] = js.undefined
  
  /**
    * The value of a dimension with a specific attribute.
    */
  var Value: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Value] = js.undefined
}
object DimensionValuesWithAttributes {
  
  inline def apply(): DimensionValuesWithAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValuesWithAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionValuesWithAttributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
