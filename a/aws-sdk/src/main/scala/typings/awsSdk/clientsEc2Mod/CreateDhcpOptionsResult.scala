package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDhcpOptionsResult extends StObject {
  
  /**
    * A set of DHCP options.
    */
  var DhcpOptions: js.UndefOr[typings.awsSdk.clientsEc2Mod.DhcpOptions] = js.undefined
}
object CreateDhcpOptionsResult {
  
  inline def apply(): CreateDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDhcpOptionsResult]
  }
  
  extension [Self <: CreateDhcpOptionsResult](x: Self) {
    
    inline def setDhcpOptions(value: DhcpOptions): Self = StObject.set(x, "DhcpOptions", value.asInstanceOf[js.Any])
    
    inline def setDhcpOptionsUndefined: Self = StObject.set(x, "DhcpOptions", js.undefined)
  }
}
