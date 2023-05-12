package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricFilterV2 extends StObject {
  
  /**
    * The key to use for filtering data.  Valid metric filter keys: INITIATION_METHOD, DISCONNECT_REASON. These are the same values as the InitiationMethod and DisconnectReason in the contact record. For more information, see ContactTraceRecord in the Amazon Connect Administrator's Guide. 
    */
  var MetricFilterKey: js.UndefOr[String] = js.undefined
  
  /**
    * The values to use for filtering data.  Valid metric filter values for INITIATION_METHOD: INBOUND | OUTBOUND | TRANSFER | QUEUE_TRANSFER | CALLBACK | API  Valid metric filter values for DISCONNECT_REASON: CUSTOMER_DISCONNECT | AGENT_DISCONNECT | THIRD_PARTY_DISCONNECT | TELECOM_PROBLEM | BARGED | CONTACT_FLOW_DISCONNECT | OTHER | EXPIRED | API 
    */
  var MetricFilterValues: js.UndefOr[MetricFilterValueList] = js.undefined
}
object MetricFilterV2 {
  
  inline def apply(): MetricFilterV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilterV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricFilterV2] (val x: Self) extends AnyVal {
    
    inline def setMetricFilterKey(value: String): Self = StObject.set(x, "MetricFilterKey", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterKeyUndefined: Self = StObject.set(x, "MetricFilterKey", js.undefined)
    
    inline def setMetricFilterValues(value: MetricFilterValueList): Self = StObject.set(x, "MetricFilterValues", value.asInstanceOf[js.Any])
    
    inline def setMetricFilterValuesUndefined: Self = StObject.set(x, "MetricFilterValues", js.undefined)
    
    inline def setMetricFilterValuesVarargs(value: String*): Self = StObject.set(x, "MetricFilterValues", js.Array(value*))
  }
}
