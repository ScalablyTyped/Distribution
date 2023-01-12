package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldIdentifier extends StObject {
  
  /**
    * Unique identifier of a field.
    */
  var id: FieldId
}
object FieldIdentifier {
  
  inline def apply(id: FieldId): FieldIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldIdentifier] (val x: Self) extends AnyVal {
    
    inline def setId(value: FieldId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
