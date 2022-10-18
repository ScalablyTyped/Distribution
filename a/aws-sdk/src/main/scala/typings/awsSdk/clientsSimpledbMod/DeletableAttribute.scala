package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletableAttribute extends StObject {
  
  /**
    * The name of the attribute.
    */
  var Name: String
  
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object DeletableAttribute {
  
  inline def apply(Name: String): DeletableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletableAttribute]
  }
  
  extension [Self <: DeletableAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
