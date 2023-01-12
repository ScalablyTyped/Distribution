package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContextualizedTypeStats extends StObject {
  
  /** ContextualizedTypeStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.undefined
  
  /** ContextualizedTypeStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.undefined
}
object IContextualizedTypeStats {
  
  inline def apply(): IContextualizedTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedTypeStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContextualizedTypeStats] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IStatsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setPerTypeStat(value: StringDictionary[ITypeStat]): Self = StObject.set(x, "perTypeStat", value.asInstanceOf[js.Any])
    
    inline def setPerTypeStatNull: Self = StObject.set(x, "perTypeStat", null)
    
    inline def setPerTypeStatUndefined: Self = StObject.set(x, "perTypeStat", js.undefined)
  }
}
