package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEditable extends StObject {
  
  var isEditable: Boolean
  
  var preIsEditable: Boolean
  
  var recordKey: String
}
object IsEditable {
  
  inline def apply(isEditable: Boolean, preIsEditable: Boolean, recordKey: String): IsEditable = {
    val __obj = js.Dynamic.literal(isEditable = isEditable.asInstanceOf[js.Any], preIsEditable = preIsEditable.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEditable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsEditable] (val x: Self) extends AnyVal {
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setPreIsEditable(value: Boolean): Self = StObject.set(x, "preIsEditable", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: String): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
