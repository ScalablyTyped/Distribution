package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.ObjectWithId & {  invitation_id :string,   fields :string | undefined,   include_fields :boolean | undefined} */
trait ObjectWithIdinvitationids extends StObject {
  
  var fields: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var include_fields: js.UndefOr[Boolean] = js.undefined
  
  var invitation_id: String
}
object ObjectWithIdinvitationids {
  
  inline def apply(id: String, invitation_id: String): ObjectWithIdinvitationids = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithIdinvitationids]
  }
  
  extension [Self <: ObjectWithIdinvitationids](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInclude_fields(value: Boolean): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    inline def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    inline def setInvitation_id(value: String): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
