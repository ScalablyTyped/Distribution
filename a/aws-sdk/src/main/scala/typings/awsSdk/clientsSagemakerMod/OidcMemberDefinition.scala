package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OidcMemberDefinition extends StObject {
  
  /**
    * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a group of private workers.
    */
  var Groups: typings.awsSdk.clientsSagemakerMod.Groups
}
object OidcMemberDefinition {
  
  inline def apply(Groups: Groups): OidcMemberDefinition = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcMemberDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OidcMemberDefinition] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "Groups", js.Array(value*))
  }
}
