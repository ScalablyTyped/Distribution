package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnStatisticsData extends StObject {
  
  /**
    * Binary column statistics data.
    */
  var BinaryColumnStatisticsData: js.UndefOr[typings.awsSdk.clientsGlueMod.BinaryColumnStatisticsData] = js.undefined
  
  /**
    * Boolean column statistics data.
    */
  var BooleanColumnStatisticsData: js.UndefOr[typings.awsSdk.clientsGlueMod.BooleanColumnStatisticsData] = js.undefined
  
  /**
    * Date column statistics data.
    */
  var DateColumnStatisticsData: js.UndefOr[typings.awsSdk.clientsGlueMod.DateColumnStatisticsData] = js.undefined
  
  /**
    *  Decimal column statistics data. UnscaledValues within are Base64-encoded binary objects storing big-endian, two's complement representations of the decimal's unscaled value. 
    */
  var DecimalColumnStatisticsData: js.UndefOr[typings.awsSdk.clientsGlueMod.DecimalColumnStatisticsData] = js.undefined
  
  /**
    * Double column statistics data.
    */
  var DoubleColumnStatisticsData: js.UndefOr[typings.awsSdk.clientsGlueMod.DoubleColumnStatisticsData] = js.undefined
  
  /**
    * Long column statistics data.
    */
  var LongColumnStatisticsData: js.UndefOr[typings.awsSdk.clientsGlueMod.LongColumnStatisticsData] = js.undefined
  
  /**
    * String column statistics data.
    */
  var StringColumnStatisticsData: js.UndefOr[typings.awsSdk.clientsGlueMod.StringColumnStatisticsData] = js.undefined
  
  /**
    * The type of column statistics data.
    */
  var Type: ColumnStatisticsType
}
object ColumnStatisticsData {
  
  inline def apply(Type: ColumnStatisticsType): ColumnStatisticsData = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatisticsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnStatisticsData] (val x: Self) extends AnyVal {
    
    inline def setBinaryColumnStatisticsData(value: BinaryColumnStatisticsData): Self = StObject.set(x, "BinaryColumnStatisticsData", value.asInstanceOf[js.Any])
    
    inline def setBinaryColumnStatisticsDataUndefined: Self = StObject.set(x, "BinaryColumnStatisticsData", js.undefined)
    
    inline def setBooleanColumnStatisticsData(value: BooleanColumnStatisticsData): Self = StObject.set(x, "BooleanColumnStatisticsData", value.asInstanceOf[js.Any])
    
    inline def setBooleanColumnStatisticsDataUndefined: Self = StObject.set(x, "BooleanColumnStatisticsData", js.undefined)
    
    inline def setDateColumnStatisticsData(value: DateColumnStatisticsData): Self = StObject.set(x, "DateColumnStatisticsData", value.asInstanceOf[js.Any])
    
    inline def setDateColumnStatisticsDataUndefined: Self = StObject.set(x, "DateColumnStatisticsData", js.undefined)
    
    inline def setDecimalColumnStatisticsData(value: DecimalColumnStatisticsData): Self = StObject.set(x, "DecimalColumnStatisticsData", value.asInstanceOf[js.Any])
    
    inline def setDecimalColumnStatisticsDataUndefined: Self = StObject.set(x, "DecimalColumnStatisticsData", js.undefined)
    
    inline def setDoubleColumnStatisticsData(value: DoubleColumnStatisticsData): Self = StObject.set(x, "DoubleColumnStatisticsData", value.asInstanceOf[js.Any])
    
    inline def setDoubleColumnStatisticsDataUndefined: Self = StObject.set(x, "DoubleColumnStatisticsData", js.undefined)
    
    inline def setLongColumnStatisticsData(value: LongColumnStatisticsData): Self = StObject.set(x, "LongColumnStatisticsData", value.asInstanceOf[js.Any])
    
    inline def setLongColumnStatisticsDataUndefined: Self = StObject.set(x, "LongColumnStatisticsData", js.undefined)
    
    inline def setStringColumnStatisticsData(value: StringColumnStatisticsData): Self = StObject.set(x, "StringColumnStatisticsData", value.asInstanceOf[js.Any])
    
    inline def setStringColumnStatisticsDataUndefined: Self = StObject.set(x, "StringColumnStatisticsData", js.undefined)
    
    inline def setType(value: ColumnStatisticsType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
