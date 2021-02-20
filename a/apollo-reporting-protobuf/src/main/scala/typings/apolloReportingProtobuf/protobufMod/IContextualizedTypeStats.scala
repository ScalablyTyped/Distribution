package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualizedTypeStats extends StObject {
  
  /** ContextualizedTypeStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.native
  
  /** ContextualizedTypeStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.native
}
object IContextualizedTypeStats {
  
  @scala.inline
  def apply(): IContextualizedTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedTypeStats]
  }
  
  @scala.inline
  implicit class IContextualizedTypeStatsMutableBuilder[Self <: IContextualizedTypeStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: IStatsContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextNull: Self = StObject.set(x, "context", null)
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setPerTypeStat(value: StringDictionary[ITypeStat]): Self = StObject.set(x, "perTypeStat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerTypeStatNull: Self = StObject.set(x, "perTypeStat", null)
    
    @scala.inline
    def setPerTypeStatUndefined: Self = StObject.set(x, "perTypeStat", js.undefined)
  }
}
