package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /**
    *  Internal only. The name of the dimension.
    */
  var Name: String
  
  /**
    *  Internal only. The value of the dimension.
    */
  var Value: String
}
object Dimension {
  
  inline def apply(Name: String, Value: String): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
