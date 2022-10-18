package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerServicePowersResult extends StObject {
  
  /**
    * An array of objects that describe the powers that can be specified for a container service.
    */
  var powers: js.UndefOr[ContainerServicePowerList] = js.undefined
}
object GetContainerServicePowersResult {
  
  inline def apply(): GetContainerServicePowersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServicePowersResult]
  }
  
  extension [Self <: GetContainerServicePowersResult](x: Self) {
    
    inline def setPowers(value: ContainerServicePowerList): Self = StObject.set(x, "powers", value.asInstanceOf[js.Any])
    
    inline def setPowersUndefined: Self = StObject.set(x, "powers", js.undefined)
    
    inline def setPowersVarargs(value: ContainerServicePower*): Self = StObject.set(x, "powers", js.Array(value*))
  }
}
