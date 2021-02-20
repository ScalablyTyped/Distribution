package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITracesAndStats extends StObject {
  
  /** TracesAndStats statsWithContext */
  var statsWithContext: js.UndefOr[js.Array[IContextualizedStats] | Null] = js.native
  
  /** TracesAndStats trace */
  var trace: js.UndefOr[js.Array[ITrace] | Null] = js.native
}
object ITracesAndStats {
  
  @scala.inline
  def apply(): ITracesAndStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITracesAndStats]
  }
  
  @scala.inline
  implicit class ITracesAndStatsMutableBuilder[Self <: ITracesAndStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatsWithContext(value: js.Array[IContextualizedStats]): Self = StObject.set(x, "statsWithContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsWithContextNull: Self = StObject.set(x, "statsWithContext", null)
    
    @scala.inline
    def setStatsWithContextUndefined: Self = StObject.set(x, "statsWithContext", js.undefined)
    
    @scala.inline
    def setStatsWithContextVarargs(value: IContextualizedStats*): Self = StObject.set(x, "statsWithContext", js.Array(value :_*))
    
    @scala.inline
    def setTrace(value: js.Array[ITrace]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceNull: Self = StObject.set(x, "trace", null)
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    @scala.inline
    def setTraceVarargs(value: ITrace*): Self = StObject.set(x, "trace", js.Array(value :_*))
  }
}
