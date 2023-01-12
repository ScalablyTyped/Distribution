package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.ToArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITracesAndStats extends StObject {
  
  /** TracesAndStats internalTracesContributingToStats */
  var internalTracesContributingToStats: js.UndefOr[(js.Array[ITrace | js.typedarray.Uint8Array]) | Null] = js.undefined
  
  /** TracesAndStats referencedFieldsByType */
  var referencedFieldsByType: js.UndefOr[StringDictionary[IReferencedFieldsForType] | Null] = js.undefined
  
  /** TracesAndStats statsWithContext */
  var statsWithContext: js.UndefOr[ToArray[IContextualizedStats] | js.Array[IContextualizedStats] | Null] = js.undefined
  
  /** TracesAndStats trace */
  var trace: js.UndefOr[(js.Array[ITrace | js.typedarray.Uint8Array]) | Null] = js.undefined
}
object ITracesAndStats {
  
  inline def apply(): ITracesAndStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITracesAndStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITracesAndStats] (val x: Self) extends AnyVal {
    
    inline def setInternalTracesContributingToStats(value: js.Array[ITrace | js.typedarray.Uint8Array]): Self = StObject.set(x, "internalTracesContributingToStats", value.asInstanceOf[js.Any])
    
    inline def setInternalTracesContributingToStatsNull: Self = StObject.set(x, "internalTracesContributingToStats", null)
    
    inline def setInternalTracesContributingToStatsUndefined: Self = StObject.set(x, "internalTracesContributingToStats", js.undefined)
    
    inline def setInternalTracesContributingToStatsVarargs(value: (ITrace | js.typedarray.Uint8Array)*): Self = StObject.set(x, "internalTracesContributingToStats", js.Array(value*))
    
    inline def setReferencedFieldsByType(value: StringDictionary[IReferencedFieldsForType]): Self = StObject.set(x, "referencedFieldsByType", value.asInstanceOf[js.Any])
    
    inline def setReferencedFieldsByTypeNull: Self = StObject.set(x, "referencedFieldsByType", null)
    
    inline def setReferencedFieldsByTypeUndefined: Self = StObject.set(x, "referencedFieldsByType", js.undefined)
    
    inline def setStatsWithContext(value: ToArray[IContextualizedStats] | js.Array[IContextualizedStats]): Self = StObject.set(x, "statsWithContext", value.asInstanceOf[js.Any])
    
    inline def setStatsWithContextNull: Self = StObject.set(x, "statsWithContext", null)
    
    inline def setStatsWithContextUndefined: Self = StObject.set(x, "statsWithContext", js.undefined)
    
    inline def setStatsWithContextVarargs(value: IContextualizedStats*): Self = StObject.set(x, "statsWithContext", js.Array(value*))
    
    inline def setTrace(value: js.Array[ITrace | js.typedarray.Uint8Array]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceNull: Self = StObject.set(x, "trace", null)
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setTraceVarargs(value: (ITrace | js.typedarray.Uint8Array)*): Self = StObject.set(x, "trace", js.Array(value*))
  }
}
