package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.undefined
}
object QueueReference {
  
  inline def apply(): QueueReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueReference] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: QueueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
