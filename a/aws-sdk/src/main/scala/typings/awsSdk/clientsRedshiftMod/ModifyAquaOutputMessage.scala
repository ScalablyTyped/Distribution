package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAquaOutputMessage extends StObject {
  
  /**
    * This parameter is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator). 
    */
  var AquaConfiguration: js.UndefOr[typings.awsSdk.clientsRedshiftMod.AquaConfiguration] = js.undefined
}
object ModifyAquaOutputMessage {
  
  inline def apply(): ModifyAquaOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAquaOutputMessage]
  }
  
  extension [Self <: ModifyAquaOutputMessage](x: Self) {
    
    inline def setAquaConfiguration(value: AquaConfiguration): Self = StObject.set(x, "AquaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAquaConfigurationUndefined: Self = StObject.set(x, "AquaConfiguration", js.undefined)
  }
}
