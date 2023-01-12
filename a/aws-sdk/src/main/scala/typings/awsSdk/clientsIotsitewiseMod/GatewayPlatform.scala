package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayPlatform extends StObject {
  
  /**
    * A gateway that runs on IoT Greengrass.
    */
  var greengrass: js.UndefOr[Greengrass] = js.undefined
  
  /**
    * A gateway that runs on IoT Greengrass V2.
    */
  var greengrassV2: js.UndefOr[GreengrassV2] = js.undefined
}
object GatewayPlatform {
  
  inline def apply(): GatewayPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayPlatform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayPlatform] (val x: Self) extends AnyVal {
    
    inline def setGreengrass(value: Greengrass): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
    
    inline def setGreengrassUndefined: Self = StObject.set(x, "greengrass", js.undefined)
    
    inline def setGreengrassV2(value: GreengrassV2): Self = StObject.set(x, "greengrassV2", value.asInstanceOf[js.Any])
    
    inline def setGreengrassV2Undefined: Self = StObject.set(x, "greengrassV2", js.undefined)
  }
}
