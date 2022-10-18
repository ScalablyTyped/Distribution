package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManagedEventSource extends StObject {
  
  /**
    * The list of bootstrap servers for your Kafka brokers in the following format: "KAFKA_BOOTSTRAP_SERVERS": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"].
    */
  var Endpoints: js.UndefOr[typings.awsSdk.clientsLambdaMod.Endpoints] = js.undefined
}
object SelfManagedEventSource {
  
  inline def apply(): SelfManagedEventSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedEventSource]
  }
  
  extension [Self <: SelfManagedEventSource](x: Self) {
    
    inline def setEndpoints(value: Endpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
  }
}
