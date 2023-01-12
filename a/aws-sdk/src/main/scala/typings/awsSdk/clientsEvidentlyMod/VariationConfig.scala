package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariationConfig extends StObject {
  
  /**
    * The name of the variation.
    */
  var name: VariationName
  
  /**
    * The value assigned to this variation.
    */
  var value: VariableValue
}
object VariationConfig {
  
  inline def apply(name: VariationName, value: VariableValue): VariationConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariationConfig] (val x: Self) extends AnyVal {
    
    inline def setName(value: VariationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: VariableValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
