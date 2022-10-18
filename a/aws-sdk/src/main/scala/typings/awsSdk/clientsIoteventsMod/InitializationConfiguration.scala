package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationConfiguration extends StObject {
  
  /**
    * The value must be TRUE or FALSE. If FALSE, all alarm instances created based on the alarm model are activated. The default value is TRUE.
    */
  var disabledOnInitialization: DisabledOnInitialization
}
object InitializationConfiguration {
  
  inline def apply(disabledOnInitialization: DisabledOnInitialization): InitializationConfiguration = {
    val __obj = js.Dynamic.literal(disabledOnInitialization = disabledOnInitialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationConfiguration]
  }
  
  extension [Self <: InitializationConfiguration](x: Self) {
    
    inline def setDisabledOnInitialization(value: DisabledOnInitialization): Self = StObject.set(x, "disabledOnInitialization", value.asInstanceOf[js.Any])
  }
}
