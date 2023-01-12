package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiDestinationResponse extends StObject {
  
  /**
    * The ARN of the API destination that was created by the request.
    */
  var ApiDestinationArn: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ApiDestinationArn] = js.undefined
  
  /**
    * The state of the API destination that was created by the request.
    */
  var ApiDestinationState: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ApiDestinationState] = js.undefined
  
  /**
    * A time stamp indicating the time that the API destination was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A time stamp indicating the time that the API destination was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object CreateApiDestinationResponse {
  
  inline def apply(): CreateApiDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiDestinationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApiDestinationResponse] (val x: Self) extends AnyVal {
    
    inline def setApiDestinationArn(value: ApiDestinationArn): Self = StObject.set(x, "ApiDestinationArn", value.asInstanceOf[js.Any])
    
    inline def setApiDestinationArnUndefined: Self = StObject.set(x, "ApiDestinationArn", js.undefined)
    
    inline def setApiDestinationState(value: ApiDestinationState): Self = StObject.set(x, "ApiDestinationState", value.asInstanceOf[js.Any])
    
    inline def setApiDestinationStateUndefined: Self = StObject.set(x, "ApiDestinationState", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
