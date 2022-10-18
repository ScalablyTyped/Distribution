package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullValueField extends StObject {
  
  /**
    * The datatype of the value.
    */
  var Datatype: typings.awsSdk.clientsGlueMod.Datatype
  
  /**
    * The value of the null placeholder.
    */
  var Value: EnclosedInStringProperty
}
object NullValueField {
  
  inline def apply(Datatype: Datatype, Value: EnclosedInStringProperty): NullValueField = {
    val __obj = js.Dynamic.literal(Datatype = Datatype.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullValueField]
  }
  
  extension [Self <: NullValueField](x: Self) {
    
    inline def setDatatype(value: Datatype): Self = StObject.set(x, "Datatype", value.asInstanceOf[js.Any])
    
    inline def setValue(value: EnclosedInStringProperty): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
