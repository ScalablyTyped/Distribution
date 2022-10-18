package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmConfigurationResult extends StObject {
  
  var HsmConfiguration: js.UndefOr[typings.awsSdk.clientsRedshiftMod.HsmConfiguration] = js.undefined
}
object CreateHsmConfigurationResult {
  
  inline def apply(): CreateHsmConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmConfigurationResult]
  }
  
  extension [Self <: CreateHsmConfigurationResult](x: Self) {
    
    inline def setHsmConfiguration(value: HsmConfiguration): Self = StObject.set(x, "HsmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setHsmConfigurationUndefined: Self = StObject.set(x, "HsmConfiguration", js.undefined)
  }
}
