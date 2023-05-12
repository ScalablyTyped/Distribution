package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagerDutyConfiguration extends StObject {
  
  /**
    * The name of the PagerDuty configuration.
    */
  var name: PagerDutyConfigurationNameString
  
  /**
    * Details about the PagerDuty service associated with the configuration.
    */
  var pagerDutyIncidentConfiguration: PagerDutyIncidentConfiguration
  
  /**
    * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access REST API Key or User Token REST API Key, and other user credentials.
    */
  var secretId: PagerDutyConfigurationSecretIdString
}
object PagerDutyConfiguration {
  
  inline def apply(
    name: PagerDutyConfigurationNameString,
    pagerDutyIncidentConfiguration: PagerDutyIncidentConfiguration,
    secretId: PagerDutyConfigurationSecretIdString
  ): PagerDutyConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pagerDutyIncidentConfiguration = pagerDutyIncidentConfiguration.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerDutyConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagerDutyConfiguration] (val x: Self) extends AnyVal {
    
    inline def setName(value: PagerDutyConfigurationNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPagerDutyIncidentConfiguration(value: PagerDutyIncidentConfiguration): Self = StObject.set(x, "pagerDutyIncidentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecretId(value: PagerDutyConfigurationSecretIdString): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
  }
}
