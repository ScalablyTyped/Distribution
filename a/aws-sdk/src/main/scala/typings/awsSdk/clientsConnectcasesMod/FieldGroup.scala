package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldGroup extends StObject {
  
  /**
    * Represents an ordered list containing field related information.
    */
  var fields: FieldGroupFieldsList
  
  /**
    * Name of the field group.
    */
  var name: js.UndefOr[FieldGroupNameString] = js.undefined
}
object FieldGroup {
  
  inline def apply(fields: FieldGroupFieldsList): FieldGroup = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldGroup] (val x: Self) extends AnyVal {
    
    inline def setFields(value: FieldGroupFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldItem*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setName(value: FieldGroupNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
