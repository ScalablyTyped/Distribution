package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointFilter extends StObject {
  
  /**
    * Specifies a date after which the returned endpoint or endpoints were created.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies a date before which the returned endpoint or endpoints were created.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting, Failed.
    */
  var Status: js.UndefOr[EndpointStatus] = js.undefined
}
object EndpointFilter {
  
  inline def apply(): EndpointFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointFilter]
  }
  
  extension [Self <: EndpointFilter](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
