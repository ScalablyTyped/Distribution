package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagerDutyIncidentDetail extends StObject {
  
  /**
    * Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager incident.
    */
  var autoResolve: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the incident associated with the PagerDuty service for the response plan.
    */
  var id: PagerDutyIncidentDetailIdString
  
  /**
    * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access REST API Key or User Token REST API Key, and other user credentials.
    */
  var secretId: js.UndefOr[PagerDutyIncidentDetailSecretIdString] = js.undefined
}
object PagerDutyIncidentDetail {
  
  inline def apply(id: PagerDutyIncidentDetailIdString): PagerDutyIncidentDetail = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerDutyIncidentDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagerDutyIncidentDetail] (val x: Self) extends AnyVal {
    
    inline def setAutoResolve(value: Boolean): Self = StObject.set(x, "autoResolve", value.asInstanceOf[js.Any])
    
    inline def setAutoResolveUndefined: Self = StObject.set(x, "autoResolve", js.undefined)
    
    inline def setId(value: PagerDutyIncidentDetailIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSecretId(value: PagerDutyIncidentDetailSecretIdString): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
    
    inline def setSecretIdUndefined: Self = StObject.set(x, "secretId", js.undefined)
  }
}
