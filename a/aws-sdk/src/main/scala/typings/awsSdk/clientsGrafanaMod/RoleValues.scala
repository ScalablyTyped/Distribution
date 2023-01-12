package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleValues extends StObject {
  
  /**
    * A list of groups from the SAML assertion attribute to grant the Grafana Admin role to.
    */
  var admin: js.UndefOr[RoleValueList] = js.undefined
  
  /**
    * A list of groups from the SAML assertion attribute to grant the Grafana Editor role to.
    */
  var editor: js.UndefOr[RoleValueList] = js.undefined
}
object RoleValues {
  
  inline def apply(): RoleValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleValues] (val x: Self) extends AnyVal {
    
    inline def setAdmin(value: RoleValueList): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
    
    inline def setAdminVarargs(value: RoleValue*): Self = StObject.set(x, "admin", js.Array(value*))
    
    inline def setEditor(value: RoleValueList): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEditorVarargs(value: RoleValue*): Self = StObject.set(x, "editor", js.Array(value*))
  }
}
