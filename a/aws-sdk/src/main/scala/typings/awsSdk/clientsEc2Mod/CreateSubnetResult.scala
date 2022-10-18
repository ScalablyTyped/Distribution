package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetResult extends StObject {
  
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[typings.awsSdk.clientsEc2Mod.Subnet] = js.undefined
}
object CreateSubnetResult {
  
  inline def apply(): CreateSubnetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetResult]
  }
  
  extension [Self <: CreateSubnetResult](x: Self) {
    
    inline def setSubnet(value: Subnet): Self = StObject.set(x, "Subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetUndefined: Self = StObject.set(x, "Subnet", js.undefined)
  }
}
