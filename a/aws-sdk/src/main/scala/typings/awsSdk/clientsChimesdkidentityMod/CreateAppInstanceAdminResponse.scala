package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceAdminResponse extends StObject {
  
  /**
    * The ARN and name of the administrator, the ARN of the AppInstance, and the created and last-updated timestamps. All timestamps use epoch milliseconds.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppInstanceAdminResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceAdmin(value: Identity): Self = StObject.set(x, "AppInstanceAdmin", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceAdminUndefined: Self = StObject.set(x, "AppInstanceAdmin", js.undefined)
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
  }
}
