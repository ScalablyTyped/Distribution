package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaClusterEncryptionInTransitDescription extends StObject {
  
  /**
    * The type of encryption in transit to the Apache Kafka cluster.
    */
  var encryptionType: js.UndefOr[KafkaClusterEncryptionInTransitType] = js.undefined
}
object KafkaClusterEncryptionInTransitDescription {
  
  inline def apply(): KafkaClusterEncryptionInTransitDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaClusterEncryptionInTransitDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaClusterEncryptionInTransitDescription] (val x: Self) extends AnyVal {
    
    inline def setEncryptionType(value: KafkaClusterEncryptionInTransitType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
  }
}
