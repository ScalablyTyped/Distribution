package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRevealConfigurationResponse extends StObject {
  
  /**
    * The new configuration settings and the status of the configuration for the account.
    */
  var configuration: js.UndefOr[RevealConfiguration] = js.undefined
}
object UpdateRevealConfigurationResponse {
  
  inline def apply(): UpdateRevealConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRevealConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRevealConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: RevealConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
