package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAutomatedDiscoveryConfigurationRequest extends StObject {
  
  /**
    * The new status of automated sensitive data discovery for the account. Valid values are: ENABLED, start or resume automated sensitive data discovery activities for the account; and, DISABLED, stop performing automated sensitive data discovery activities for the account. When you enable automated sensitive data discovery for the first time, Amazon Macie uses default configuration settings to determine which data sources to analyze and which managed data identifiers to use. To change these settings, use the UpdateClassificationScope and UpdateSensitivityInspectionTemplate operations, respectively. If you change the settings and subsequently disable the configuration, Amazon Macie retains your changes.
    */
  var status: AutomatedDiscoveryStatus
}
object UpdateAutomatedDiscoveryConfigurationRequest {
  
  inline def apply(status: AutomatedDiscoveryStatus): UpdateAutomatedDiscoveryConfigurationRequest = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAutomatedDiscoveryConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAutomatedDiscoveryConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: AutomatedDiscoveryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
