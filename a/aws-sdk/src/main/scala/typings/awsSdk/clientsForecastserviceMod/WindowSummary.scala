package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowSummary extends StObject {
  
  /**
    * The type of evaluation.    SUMMARY - The average metrics across all windows.    COMPUTED - The metrics for the specified window.  
    */
  var EvaluationType: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.EvaluationType] = js.undefined
  
  /**
    * The number of data points within the window.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Provides metrics used to evaluate the performance of a predictor.
    */
  var Metrics: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Metrics] = js.undefined
  
  /**
    * The timestamp that defines the end of the window.
    */
  var TestWindowEnd: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp that defines the start of the window.
    */
  var TestWindowStart: js.UndefOr[js.Date] = js.undefined
}
object WindowSummary {
  
  inline def apply(): WindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowSummary] (val x: Self) extends AnyVal {
    
    inline def setEvaluationType(value: EvaluationType): Self = StObject.set(x, "EvaluationType", value.asInstanceOf[js.Any])
    
    inline def setEvaluationTypeUndefined: Self = StObject.set(x, "EvaluationType", js.undefined)
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setTestWindowEnd(value: js.Date): Self = StObject.set(x, "TestWindowEnd", value.asInstanceOf[js.Any])
    
    inline def setTestWindowEndUndefined: Self = StObject.set(x, "TestWindowEnd", js.undefined)
    
    inline def setTestWindowStart(value: js.Date): Self = StObject.set(x, "TestWindowStart", value.asInstanceOf[js.Any])
    
    inline def setTestWindowStartUndefined: Self = StObject.set(x, "TestWindowStart", js.undefined)
  }
}
