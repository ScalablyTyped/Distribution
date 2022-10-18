package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceUserResponse extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
}
object UpdateAppInstanceUserResponse {
  
  inline def apply(): UpdateAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppInstanceUserResponse]
  }
  
  extension [Self <: UpdateAppInstanceUserResponse](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
  }
}
