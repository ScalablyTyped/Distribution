package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRunResponse extends StObject {
  
  /**
    * The run's ARN.
    */
  var arn: js.UndefOr[RunArn] = js.undefined
  
  /**
    * The run's ID.
    */
  var id: js.UndefOr[RunId] = js.undefined
  
  /**
    * The run's status.
    */
  var status: js.UndefOr[RunStatus] = js.undefined
  
  /**
    * The run's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartRunResponse {
  
  inline def apply(): StartRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRunResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RunArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: RunStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
