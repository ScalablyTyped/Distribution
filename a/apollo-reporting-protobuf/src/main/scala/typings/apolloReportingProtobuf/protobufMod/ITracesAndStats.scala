package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITracesAndStats extends StObject {
  
  /** TracesAndStats statsWithContext */
  var statsWithContext: js.UndefOr[js.Array[IContextualizedStats] | Null] = js.undefined
  
  /** TracesAndStats trace */
  var trace: js.UndefOr[js.Array[ITrace] | Null] = js.undefined
}
object ITracesAndStats {
  
  inline def apply(): ITracesAndStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITracesAndStats]
  }
  
  extension [Self <: ITracesAndStats](x: Self) {
    
    inline def setStatsWithContext(value: js.Array[IContextualizedStats]): Self = StObject.set(x, "statsWithContext", value.asInstanceOf[js.Any])
    
    inline def setStatsWithContextNull: Self = StObject.set(x, "statsWithContext", null)
    
    inline def setStatsWithContextUndefined: Self = StObject.set(x, "statsWithContext", js.undefined)
    
    inline def setStatsWithContextVarargs(value: IContextualizedStats*): Self = StObject.set(x, "statsWithContext", js.Array(value :_*))
    
    inline def setTrace(value: js.Array[ITrace]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceNull: Self = StObject.set(x, "trace", null)
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setTraceVarargs(value: ITrace*): Self = StObject.set(x, "trace", js.Array(value :_*))
  }
}
