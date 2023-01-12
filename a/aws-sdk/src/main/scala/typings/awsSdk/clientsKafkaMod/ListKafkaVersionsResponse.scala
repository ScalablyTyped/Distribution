package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKafkaVersionsResponse extends StObject {
  
  var KafkaVersions: js.UndefOr[listOfKafkaVersion] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListKafkaVersionsResponse {
  
  inline def apply(): ListKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKafkaVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKafkaVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setKafkaVersions(value: listOfKafkaVersion): Self = StObject.set(x, "KafkaVersions", value.asInstanceOf[js.Any])
    
    inline def setKafkaVersionsUndefined: Self = StObject.set(x, "KafkaVersions", js.undefined)
    
    inline def setKafkaVersionsVarargs(value: KafkaVersion*): Self = StObject.set(x, "KafkaVersions", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
