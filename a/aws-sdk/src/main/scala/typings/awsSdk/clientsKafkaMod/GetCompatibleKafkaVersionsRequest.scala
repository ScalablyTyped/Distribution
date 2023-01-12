package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleKafkaVersionsRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster check.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
}
object GetCompatibleKafkaVersionsRequest {
  
  inline def apply(): GetCompatibleKafkaVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleKafkaVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCompatibleKafkaVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
  }
}
