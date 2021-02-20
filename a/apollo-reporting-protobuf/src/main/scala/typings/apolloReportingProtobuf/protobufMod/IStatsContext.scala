package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStatsContext extends StObject {
  
  /** StatsContext clientName */
  var clientName: js.UndefOr[String | Null] = js.native
  
  /** StatsContext clientReferenceId */
  var clientReferenceId: js.UndefOr[String | Null] = js.native
  
  /** StatsContext clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.native
}
object IStatsContext {
  
  @scala.inline
  def apply(): IStatsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatsContext]
  }
  
  @scala.inline
  implicit class IStatsContextMutableBuilder[Self <: IStatsContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNameNull: Self = StObject.set(x, "clientName", null)
    
    @scala.inline
    def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    @scala.inline
    def setClientReferenceId(value: String): Self = StObject.set(x, "clientReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientReferenceIdNull: Self = StObject.set(x, "clientReferenceId", null)
    
    @scala.inline
    def setClientReferenceIdUndefined: Self = StObject.set(x, "clientReferenceId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionNull: Self = StObject.set(x, "clientVersion", null)
    
    @scala.inline
    def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
  }
}
