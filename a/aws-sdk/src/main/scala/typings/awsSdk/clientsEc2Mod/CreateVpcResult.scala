package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcResult extends StObject {
  
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typings.awsSdk.clientsEc2Mod.Vpc] = js.undefined
}
object CreateVpcResult {
  
  inline def apply(): CreateVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcResult] (val x: Self) extends AnyVal {
    
    inline def setVpc(value: Vpc): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
