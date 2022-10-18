package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApacheKafkaCluster extends StObject {
  
  /**
    * The bootstrap servers of the cluster.
    */
  var bootstrapServers: string
  
  /**
    * Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
    */
  var vpc: Vpc
}
object ApacheKafkaCluster {
  
  inline def apply(bootstrapServers: string, vpc: Vpc): ApacheKafkaCluster = {
    val __obj = js.Dynamic.literal(bootstrapServers = bootstrapServers.asInstanceOf[js.Any], vpc = vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApacheKafkaCluster]
  }
  
  extension [Self <: ApacheKafkaCluster](x: Self) {
    
    inline def setBootstrapServers(value: string): Self = StObject.set(x, "bootstrapServers", value.asInstanceOf[js.Any])
    
    inline def setVpc(value: Vpc): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
  }
}
