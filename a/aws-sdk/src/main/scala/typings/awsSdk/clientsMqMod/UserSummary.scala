package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSummary extends StObject {
  
  /**
    * The type of change pending for the broker user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.undefined
  
  /**
    * Required. The username of the broker user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: string
}
object UserSummary {
  
  inline def apply(Username: string): UserSummary = {
    val __obj = js.Dynamic.literal(Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSummary] (val x: Self) extends AnyVal {
    
    inline def setPendingChange(value: ChangeType): Self = StObject.set(x, "PendingChange", value.asInstanceOf[js.Any])
    
    inline def setPendingChangeUndefined: Self = StObject.set(x, "PendingChange", js.undefined)
    
    inline def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
