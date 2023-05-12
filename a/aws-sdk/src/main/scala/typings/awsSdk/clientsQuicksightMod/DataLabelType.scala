package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLabelType extends StObject {
  
  /**
    * The option that specifies individual data values for labels.
    */
  var DataPathLabelType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataPathLabelType] = js.undefined
  
  /**
    * Determines the label configuration for the entire field.
    */
  var FieldLabelType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldLabelType] = js.undefined
  
  /**
    * Determines the label configuration for the maximum value in a visual.
    */
  var MaximumLabelType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MaximumLabelType] = js.undefined
  
  /**
    * Determines the label configuration for the minimum value in a visual.
    */
  var MinimumLabelType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MinimumLabelType] = js.undefined
  
  /**
    * Determines the label configuration for range end value in a visual.
    */
  var RangeEndsLabelType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RangeEndsLabelType] = js.undefined
}
object DataLabelType {
  
  inline def apply(): DataLabelType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataLabelType] (val x: Self) extends AnyVal {
    
    inline def setDataPathLabelType(value: DataPathLabelType): Self = StObject.set(x, "DataPathLabelType", value.asInstanceOf[js.Any])
    
    inline def setDataPathLabelTypeUndefined: Self = StObject.set(x, "DataPathLabelType", js.undefined)
    
    inline def setFieldLabelType(value: FieldLabelType): Self = StObject.set(x, "FieldLabelType", value.asInstanceOf[js.Any])
    
    inline def setFieldLabelTypeUndefined: Self = StObject.set(x, "FieldLabelType", js.undefined)
    
    inline def setMaximumLabelType(value: MaximumLabelType): Self = StObject.set(x, "MaximumLabelType", value.asInstanceOf[js.Any])
    
    inline def setMaximumLabelTypeUndefined: Self = StObject.set(x, "MaximumLabelType", js.undefined)
    
    inline def setMinimumLabelType(value: MinimumLabelType): Self = StObject.set(x, "MinimumLabelType", value.asInstanceOf[js.Any])
    
    inline def setMinimumLabelTypeUndefined: Self = StObject.set(x, "MinimumLabelType", js.undefined)
    
    inline def setRangeEndsLabelType(value: RangeEndsLabelType): Self = StObject.set(x, "RangeEndsLabelType", value.asInstanceOf[js.Any])
    
    inline def setRangeEndsLabelTypeUndefined: Self = StObject.set(x, "RangeEndsLabelType", js.undefined)
  }
}
