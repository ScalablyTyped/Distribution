package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceAdmin extends StObject {
  
  /**
    * The AppInstanceAdmin data.
    */
  var Admin: js.UndefOr[Identity] = js.undefined
  
  /**
    * The ARN of the AppInstance for which the user is an administrator.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The time at which an administrator was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object AppInstanceAdmin {
  
  inline def apply(): AppInstanceAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceAdmin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInstanceAdmin] (val x: Self) extends AnyVal {
    
    inline def setAdmin(value: Identity): Self = StObject.set(x, "Admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "Admin", js.undefined)
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
  }
}
