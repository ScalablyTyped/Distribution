package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagerDutyIncidentConfiguration extends StObject {
  
  /**
    * The ID of the PagerDuty service that the response plan associates with an incident when it launches.
    */
  var serviceId: PagerDutyIncidentConfigurationServiceIdString
}
object PagerDutyIncidentConfiguration {
  
  inline def apply(serviceId: PagerDutyIncidentConfigurationServiceIdString): PagerDutyIncidentConfiguration = {
    val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerDutyIncidentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagerDutyIncidentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setServiceId(value: PagerDutyIncidentConfigurationServiceIdString): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
