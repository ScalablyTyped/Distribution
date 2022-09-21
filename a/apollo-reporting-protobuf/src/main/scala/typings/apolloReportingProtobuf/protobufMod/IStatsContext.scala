package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatsContext extends StObject {
  
  /** StatsContext clientName */
  var clientName: js.UndefOr[String | Null] = js.undefined
  
  /** StatsContext clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.undefined
}
object IStatsContext {
  
  inline def apply(): IStatsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatsContext]
  }
  
  extension [Self <: IStatsContext](x: Self) {
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameNull: Self = StObject.set(x, "clientName", null)
    
    inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionNull: Self = StObject.set(x, "clientVersion", null)
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
  }
}
