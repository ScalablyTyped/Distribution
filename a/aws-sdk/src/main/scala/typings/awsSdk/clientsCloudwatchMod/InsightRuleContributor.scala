package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightRuleContributor extends StObject {
  
  /**
    * An approximation of the aggregate value that comes from this contributor.
    */
  var ApproximateAggregateValue: InsightRuleUnboundDouble
  
  /**
    * An array of the data points where this contributor is present. Only the data points when this contributor appeared are included in the array.
    */
  var Datapoints: InsightRuleContributorDatapoints
  
  /**
    * One of the log entry field keywords that is used to define contributors for this rule.
    */
  var Keys: InsightRuleContributorKeys
}
object InsightRuleContributor {
  
  inline def apply(
    ApproximateAggregateValue: InsightRuleUnboundDouble,
    Datapoints: InsightRuleContributorDatapoints,
    Keys: InsightRuleContributorKeys
  ): InsightRuleContributor = {
    val __obj = js.Dynamic.literal(ApproximateAggregateValue = ApproximateAggregateValue.asInstanceOf[js.Any], Datapoints = Datapoints.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleContributor]
  }
  
  extension [Self <: InsightRuleContributor](x: Self) {
    
    inline def setApproximateAggregateValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "ApproximateAggregateValue", value.asInstanceOf[js.Any])
    
    inline def setDatapoints(value: InsightRuleContributorDatapoints): Self = StObject.set(x, "Datapoints", value.asInstanceOf[js.Any])
    
    inline def setDatapointsVarargs(value: InsightRuleContributorDatapoint*): Self = StObject.set(x, "Datapoints", js.Array(value*))
    
    inline def setKeys(value: InsightRuleContributorKeys): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: InsightRuleContributorKey*): Self = StObject.set(x, "Keys", js.Array(value*))
  }
}
