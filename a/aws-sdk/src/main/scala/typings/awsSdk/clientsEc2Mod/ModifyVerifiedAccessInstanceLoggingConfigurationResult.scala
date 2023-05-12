package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessInstanceLoggingConfigurationResult extends StObject {
  
  /**
    * The logging configuration for the Verified Access instance.
    */
  var LoggingConfiguration: js.UndefOr[VerifiedAccessInstanceLoggingConfiguration] = js.undefined
}
object ModifyVerifiedAccessInstanceLoggingConfigurationResult {
  
  inline def apply(): ModifyVerifiedAccessInstanceLoggingConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVerifiedAccessInstanceLoggingConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessInstanceLoggingConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setLoggingConfiguration(value: VerifiedAccessInstanceLoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
