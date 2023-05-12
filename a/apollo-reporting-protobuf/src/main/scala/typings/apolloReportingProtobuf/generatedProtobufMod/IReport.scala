package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloReportingProtobuf.generatedProtobufMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReport extends StObject {
  
  /** Report endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Report header */
  var header: js.UndefOr[IReportHeader | Null] = js.undefined
  
  /** Report operationCount */
  var operationCount: js.UndefOr[Double | Null] = js.undefined
  
  /** Report tracesPerQuery */
  var tracesPerQuery: js.UndefOr[StringDictionary[ITracesAndStats] | Null] = js.undefined
  
  /** Report tracesPreAggregated */
  var tracesPreAggregated: js.UndefOr[Boolean | Null] = js.undefined
}
object IReport {
  
  inline def apply(): IReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IReport] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setHeader(value: IReportHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setOperationCount(value: Double): Self = StObject.set(x, "operationCount", value.asInstanceOf[js.Any])
    
    inline def setOperationCountNull: Self = StObject.set(x, "operationCount", null)
    
    inline def setOperationCountUndefined: Self = StObject.set(x, "operationCount", js.undefined)
    
    inline def setTracesPerQuery(value: StringDictionary[ITracesAndStats]): Self = StObject.set(x, "tracesPerQuery", value.asInstanceOf[js.Any])
    
    inline def setTracesPerQueryNull: Self = StObject.set(x, "tracesPerQuery", null)
    
    inline def setTracesPerQueryUndefined: Self = StObject.set(x, "tracesPerQuery", js.undefined)
    
    inline def setTracesPreAggregated(value: Boolean): Self = StObject.set(x, "tracesPreAggregated", value.asInstanceOf[js.Any])
    
    inline def setTracesPreAggregatedNull: Self = StObject.set(x, "tracesPreAggregated", null)
    
    inline def setTracesPreAggregatedUndefined: Self = StObject.set(x, "tracesPreAggregated", js.undefined)
  }
}
