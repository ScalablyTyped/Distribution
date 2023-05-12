package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateStatus extends StObject {
  
  /**
    * Sparse map of failure signatures.
    */
  var signatureMap: js.UndefOr[SignatureMap] = js.undefined
  
  /**
    * Aggregate status.
    */
  var status: AgentStatus
}
object AggregateStatus {
  
  inline def apply(status: AgentStatus): AggregateStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateStatus] (val x: Self) extends AnyVal {
    
    inline def setSignatureMap(value: SignatureMap): Self = StObject.set(x, "signatureMap", value.asInstanceOf[js.Any])
    
    inline def setSignatureMapUndefined: Self = StObject.set(x, "signatureMap", js.undefined)
    
    inline def setStatus(value: AgentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
