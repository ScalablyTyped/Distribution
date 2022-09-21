package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChoice
  extends StObject
     with IAny {
  
  var value: js.Array[BaseBlock[ValueBlock, ValueBlockJson]]
}
object IChoice {
  
  inline def apply(name: String, optional: scala.Boolean, value: js.Array[BaseBlock[ValueBlock, ValueBlockJson]]): IChoice = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoice]
  }
  
  extension [Self <: IChoice](x: Self) {
    
    inline def setValue(value: js.Array[BaseBlock[ValueBlock, ValueBlockJson]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (BaseBlock[ValueBlock, ValueBlockJson])*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
