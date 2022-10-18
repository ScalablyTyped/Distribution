package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDefaultVpcResult extends StObject {
  
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typings.awsSdk.clientsEc2Mod.Vpc] = js.undefined
}
object CreateDefaultVpcResult {
  
  inline def apply(): CreateDefaultVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDefaultVpcResult]
  }
  
  extension [Self <: CreateDefaultVpcResult](x: Self) {
    
    inline def setVpc(value: Vpc): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
