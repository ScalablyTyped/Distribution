package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlexaForBusinessMetadata extends StObject {
  
  /**
    * The ARN of the room resource.
    */
  var AlexaForBusinessRoomArn: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * Starts or stops Alexa for Business.
    */
  var IsAlexaForBusinessEnabled: js.UndefOr[Boolean] = js.undefined
}
object AlexaForBusinessMetadata {
  
  inline def apply(): AlexaForBusinessMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlexaForBusinessMetadata]
  }
  
  extension [Self <: AlexaForBusinessMetadata](x: Self) {
    
    inline def setAlexaForBusinessRoomArn(value: SensitiveString): Self = StObject.set(x, "AlexaForBusinessRoomArn", value.asInstanceOf[js.Any])
    
    inline def setAlexaForBusinessRoomArnUndefined: Self = StObject.set(x, "AlexaForBusinessRoomArn", js.undefined)
    
    inline def setIsAlexaForBusinessEnabled(value: Boolean): Self = StObject.set(x, "IsAlexaForBusinessEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsAlexaForBusinessEnabledUndefined: Self = StObject.set(x, "IsAlexaForBusinessEnabled", js.undefined)
  }
}
