package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DhcpConfiguration extends StObject {
  
  /**
    * The name of a DHCP option.
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    * One or more values for the DHCP option.
    */
  var Values: js.UndefOr[DhcpConfigurationValueList] = js.undefined
}
object DhcpConfiguration {
  
  inline def apply(): DhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DhcpConfiguration]
  }
  
  extension [Self <: DhcpConfiguration](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: DhcpConfigurationValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: AttributeValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
