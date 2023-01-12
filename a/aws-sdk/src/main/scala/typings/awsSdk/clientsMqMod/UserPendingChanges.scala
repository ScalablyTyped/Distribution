package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPendingChanges extends StObject {
  
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Required. The type of change pending for the ActiveMQ user.
    */
  var PendingChange: ChangeType
}
object UserPendingChanges {
  
  inline def apply(PendingChange: ChangeType): UserPendingChanges = {
    val __obj = js.Dynamic.literal(PendingChange = PendingChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPendingChanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserPendingChanges] (val x: Self) extends AnyVal {
    
    inline def setConsoleAccess(value: boolean): Self = StObject.set(x, "ConsoleAccess", value.asInstanceOf[js.Any])
    
    inline def setConsoleAccessUndefined: Self = StObject.set(x, "ConsoleAccess", js.undefined)
    
    inline def setGroups(value: listOfString): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: string*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setPendingChange(value: ChangeType): Self = StObject.set(x, "PendingChange", value.asInstanceOf[js.Any])
  }
}
