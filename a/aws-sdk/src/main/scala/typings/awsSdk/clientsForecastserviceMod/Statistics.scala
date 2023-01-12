package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistics extends StObject {
  
  /**
    * For a numeric field, the average value in the field.
    */
  var Avg: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of values in the field. If the response value is -1, refer to CountLong.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of distinct values in the field. If the response value is -1, refer to CountDistinctLong.
    */
  var CountDistinct: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of distinct values in the field. CountDistinctLong is used instead of CountDistinct if the value is greater than 2,147,483,647.
    */
  var CountDistinctLong: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of values in the field. CountLong is used instead of Count if the value is greater than 2,147,483,647.
    */
  var CountLong: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of NAN (not a number) values in the field. If the response value is -1, refer to CountNanLong.
    */
  var CountNan: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of NAN (not a number) values in the field. CountNanLong is used instead of CountNan if the value is greater than 2,147,483,647.
    */
  var CountNanLong: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of null values in the field. If the response value is -1, refer to CountNullLong.
    */
  var CountNull: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of null values in the field. CountNullLong is used instead of CountNull if the value is greater than 2,147,483,647.
    */
  var CountNullLong: js.UndefOr[Long] = js.undefined
  
  /**
    * For a numeric field, the maximum value in the field.
    */
  var Max: js.UndefOr[String] = js.undefined
  
  /**
    * For a numeric field, the minimum value in the field.
    */
  var Min: js.UndefOr[String] = js.undefined
  
  /**
    * For a numeric field, the standard deviation.
    */
  var Stddev: js.UndefOr[Double] = js.undefined
}
object Statistics {
  
  inline def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
    
    inline def setAvg(value: Double): Self = StObject.set(x, "Avg", value.asInstanceOf[js.Any])
    
    inline def setAvgUndefined: Self = StObject.set(x, "Avg", js.undefined)
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountDistinct(value: Integer): Self = StObject.set(x, "CountDistinct", value.asInstanceOf[js.Any])
    
    inline def setCountDistinctLong(value: Long): Self = StObject.set(x, "CountDistinctLong", value.asInstanceOf[js.Any])
    
    inline def setCountDistinctLongUndefined: Self = StObject.set(x, "CountDistinctLong", js.undefined)
    
    inline def setCountDistinctUndefined: Self = StObject.set(x, "CountDistinct", js.undefined)
    
    inline def setCountLong(value: Long): Self = StObject.set(x, "CountLong", value.asInstanceOf[js.Any])
    
    inline def setCountLongUndefined: Self = StObject.set(x, "CountLong", js.undefined)
    
    inline def setCountNan(value: Integer): Self = StObject.set(x, "CountNan", value.asInstanceOf[js.Any])
    
    inline def setCountNanLong(value: Long): Self = StObject.set(x, "CountNanLong", value.asInstanceOf[js.Any])
    
    inline def setCountNanLongUndefined: Self = StObject.set(x, "CountNanLong", js.undefined)
    
    inline def setCountNanUndefined: Self = StObject.set(x, "CountNan", js.undefined)
    
    inline def setCountNull(value: Integer): Self = StObject.set(x, "CountNull", value.asInstanceOf[js.Any])
    
    inline def setCountNullLong(value: Long): Self = StObject.set(x, "CountNullLong", value.asInstanceOf[js.Any])
    
    inline def setCountNullLongUndefined: Self = StObject.set(x, "CountNullLong", js.undefined)
    
    inline def setCountNullUndefined: Self = StObject.set(x, "CountNull", js.undefined)
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
    
    inline def setStddev(value: Double): Self = StObject.set(x, "Stddev", value.asInstanceOf[js.Any])
    
    inline def setStddevUndefined: Self = StObject.set(x, "Stddev", js.undefined)
  }
}
