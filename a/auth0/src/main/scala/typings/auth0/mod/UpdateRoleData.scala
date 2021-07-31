package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoleData extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object UpdateRoleData {
  
  @scala.inline
  def apply(): UpdateRoleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoleData]
  }
  
  @scala.inline
  implicit class UpdateRoleDataMutableBuilder[Self <: UpdateRoleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
