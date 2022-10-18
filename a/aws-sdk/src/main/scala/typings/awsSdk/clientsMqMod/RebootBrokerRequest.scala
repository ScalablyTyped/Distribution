package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootBrokerRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: string
}
object RebootBrokerRequest {
  
  inline def apply(BrokerId: string): RebootBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootBrokerRequest]
  }
  
  extension [Self <: RebootBrokerRequest](x: Self) {
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
  }
}
