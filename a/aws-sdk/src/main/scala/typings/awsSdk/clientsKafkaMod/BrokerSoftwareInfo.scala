package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerSoftwareInfo extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration used for the cluster. This field isn't visible in this preview release.
    
    */
  var ConfigurationArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The revision of the configuration to use. This field isn't visible in this preview release.
    
    */
  var ConfigurationRevision: js.UndefOr[long] = js.undefined
  
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.undefined
}
object BrokerSoftwareInfo {
  
  inline def apply(): BrokerSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerSoftwareInfo]
  }
  
  extension [Self <: BrokerSoftwareInfo](x: Self) {
    
    inline def setConfigurationArn(value: string): Self = StObject.set(x, "ConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationArnUndefined: Self = StObject.set(x, "ConfigurationArn", js.undefined)
    
    inline def setConfigurationRevision(value: long): Self = StObject.set(x, "ConfigurationRevision", value.asInstanceOf[js.Any])
    
    inline def setConfigurationRevisionUndefined: Self = StObject.set(x, "ConfigurationRevision", js.undefined)
    
    inline def setKafkaVersion(value: string): Self = StObject.set(x, "KafkaVersion", value.asInstanceOf[js.Any])
    
    inline def setKafkaVersionUndefined: Self = StObject.set(x, "KafkaVersion", js.undefined)
  }
}
