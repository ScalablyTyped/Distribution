package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightRuleContributorDatapoint extends StObject {
  
  /**
    * The approximate value that this contributor added during this timestamp.
    */
  var ApproximateValue: InsightRuleUnboundDouble
  
  /**
    * The timestamp of the data point.
    */
  var Timestamp: js.Date
}
object InsightRuleContributorDatapoint {
  
  inline def apply(ApproximateValue: InsightRuleUnboundDouble, Timestamp: js.Date): InsightRuleContributorDatapoint = {
    val __obj = js.Dynamic.literal(ApproximateValue = ApproximateValue.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleContributorDatapoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightRuleContributorDatapoint] (val x: Self) extends AnyVal {
    
    inline def setApproximateValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "ApproximateValue", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
