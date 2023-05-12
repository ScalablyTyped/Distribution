package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integration extends StObject {
  
  /**
    * Information about the PagerDuty service where the response plan creates an incident.
    */
  var pagerDutyConfiguration: js.UndefOr[PagerDutyConfiguration] = js.undefined
}
object Integration {
  
  inline def apply(): Integration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Integration] (val x: Self) extends AnyVal {
    
    inline def setPagerDutyConfiguration(value: PagerDutyConfiguration): Self = StObject.set(x, "pagerDutyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPagerDutyConfigurationUndefined: Self = StObject.set(x, "pagerDutyConfiguration", js.undefined)
  }
}
