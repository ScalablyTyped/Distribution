package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySchemaElement extends StObject {
  
  /**
    * The name of a partition key.
    */
  var Name: NameString
  
  /**
    * The type of a partition key.
    */
  var Type: ColumnTypeString
}
object KeySchemaElement {
  
  inline def apply(Name: NameString, Type: ColumnTypeString): KeySchemaElement = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySchemaElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeySchemaElement] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ColumnTypeString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
