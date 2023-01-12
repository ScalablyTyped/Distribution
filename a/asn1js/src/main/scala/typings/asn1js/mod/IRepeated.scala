package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRepeated
  extends StObject
     with IAny {
  
  var local: scala.Boolean
  
  var value: Any
}
object IRepeated {
  
  inline def apply(local: scala.Boolean, name: String, optional: scala.Boolean, value: Any): IRepeated = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRepeated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRepeated] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: scala.Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
