package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceUserResponse extends StObject {
  
  /**
    * The user's ARN.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
}
object CreateAppInstanceUserResponse {
  
  inline def apply(): CreateAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppInstanceUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppInstanceUserResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
  }
}
