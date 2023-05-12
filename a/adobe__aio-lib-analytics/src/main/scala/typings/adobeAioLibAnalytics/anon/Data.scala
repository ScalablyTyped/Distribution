package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.UndefOr[js.Array[Double]] = js.undefined
  
  var dataAnomalyDetected: js.UndefOr[js.Array[Boolean]] = js.undefined
  
  var dataExpected: js.UndefOr[js.Array[Double]] = js.undefined
  
  var dataLowerBound: js.UndefOr[js.Array[Double]] = js.undefined
  
  var dataUpperBound: js.UndefOr[js.Array[Double]] = js.undefined
  
  var itemId: js.UndefOr[String] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var percentChange: js.UndefOr[js.Array[Double]] = js.undefined
  
  var rowId: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataAnomalyDetected(value: js.Array[Boolean]): Self = StObject.set(x, "dataAnomalyDetected", value.asInstanceOf[js.Any])
    
    inline def setDataAnomalyDetectedUndefined: Self = StObject.set(x, "dataAnomalyDetected", js.undefined)
    
    inline def setDataAnomalyDetectedVarargs(value: Boolean*): Self = StObject.set(x, "dataAnomalyDetected", js.Array(value*))
    
    inline def setDataExpected(value: js.Array[Double]): Self = StObject.set(x, "dataExpected", value.asInstanceOf[js.Any])
    
    inline def setDataExpectedUndefined: Self = StObject.set(x, "dataExpected", js.undefined)
    
    inline def setDataExpectedVarargs(value: Double*): Self = StObject.set(x, "dataExpected", js.Array(value*))
    
    inline def setDataLowerBound(value: js.Array[Double]): Self = StObject.set(x, "dataLowerBound", value.asInstanceOf[js.Any])
    
    inline def setDataLowerBoundUndefined: Self = StObject.set(x, "dataLowerBound", js.undefined)
    
    inline def setDataLowerBoundVarargs(value: Double*): Self = StObject.set(x, "dataLowerBound", js.Array(value*))
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataUpperBound(value: js.Array[Double]): Self = StObject.set(x, "dataUpperBound", value.asInstanceOf[js.Any])
    
    inline def setDataUpperBoundUndefined: Self = StObject.set(x, "dataUpperBound", js.undefined)
    
    inline def setDataUpperBoundVarargs(value: Double*): Self = StObject.set(x, "dataUpperBound", js.Array(value*))
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setPercentChange(value: js.Array[Double]): Self = StObject.set(x, "percentChange", value.asInstanceOf[js.Any])
    
    inline def setPercentChangeUndefined: Self = StObject.set(x, "percentChange", js.undefined)
    
    inline def setPercentChangeVarargs(value: Double*): Self = StObject.set(x, "percentChange", js.Array(value*))
    
    inline def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
