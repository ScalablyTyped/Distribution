package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewDhcpConfiguration extends StObject {
  
  var Key: js.UndefOr[String] = js.undefined
  
  var Values: js.UndefOr[ValueStringList] = js.undefined
}
object NewDhcpConfiguration {
  
  inline def apply(): NewDhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDhcpConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewDhcpConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
