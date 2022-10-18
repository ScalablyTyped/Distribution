package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaVersion extends StObject {
  
  var Status: js.UndefOr[KafkaVersionStatus] = js.undefined
  
  var Version: js.UndefOr[string] = js.undefined
}
object KafkaVersion {
  
  inline def apply(): KafkaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaVersion]
  }
  
  extension [Self <: KafkaVersion](x: Self) {
    
    inline def setStatus(value: KafkaVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
