package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoricalMetricResult extends StObject {
  
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[HistoricalMetricDataCollections] = js.undefined
  
  /**
    * The dimension for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsConnectMod.Dimensions] = js.undefined
}
object HistoricalMetricResult {
  
  inline def apply(): HistoricalMetricResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetricResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoricalMetricResult] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: HistoricalMetricDataCollections): Self = StObject.set(x, "Collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "Collections", js.undefined)
    
    inline def setCollectionsVarargs(value: HistoricalMetricData*): Self = StObject.set(x, "Collections", js.Array(value*))
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
  }
}
