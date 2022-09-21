package typings.awsSdk.chimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceAdminResponse extends StObject {
  
  /**
    * The name and ARN of the admin for the AppInstance.
    */
  var AppInstanceAdmin: js.UndefOr[Identity] = js.undefined
  
  /**
    * The ARN of the of the admin for the AppInstance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
}
object CreateAppInstanceAdminResponse {
  
  inline def apply(): CreateAppInstanceAdminResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppInstanceAdminResponse]
  }
  
  extension [Self <: CreateAppInstanceAdminResponse](x: Self) {
    
    inline def setAppInstanceAdmin(value: Identity): Self = StObject.set(x, "AppInstanceAdmin", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceAdminUndefined: Self = StObject.set(x, "AppInstanceAdmin", js.undefined)
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
  }
}
