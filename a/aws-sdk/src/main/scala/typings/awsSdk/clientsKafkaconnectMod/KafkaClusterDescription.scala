package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaClusterDescription extends StObject {
  
  /**
    * The Apache Kafka cluster to which the connector is connected.
    */
  var apacheKafkaCluster: js.UndefOr[ApacheKafkaClusterDescription] = js.undefined
}
object KafkaClusterDescription {
  
  inline def apply(): KafkaClusterDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaClusterDescription]
  }
  
  extension [Self <: KafkaClusterDescription](x: Self) {
    
    inline def setApacheKafkaCluster(value: ApacheKafkaClusterDescription): Self = StObject.set(x, "apacheKafkaCluster", value.asInstanceOf[js.Any])
    
    inline def setApacheKafkaClusterUndefined: Self = StObject.set(x, "apacheKafkaCluster", js.undefined)
  }
}
