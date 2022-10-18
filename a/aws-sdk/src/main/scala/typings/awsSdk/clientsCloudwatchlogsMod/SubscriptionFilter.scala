package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionFilter extends StObject {
  
  /**
    * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var destinationArn: js.UndefOr[DestinationArn] = js.undefined
  
  var distribution: js.UndefOr[Distribution] = js.undefined
  
  /**
    * The name of the subscription filter.
    */
  var filterName: js.UndefOr[FilterName] = js.undefined
  
  var filterPattern: js.UndefOr[FilterPattern] = js.undefined
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * 
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object SubscriptionFilter {
  
  inline def apply(): SubscriptionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionFilter]
  }
  
  extension [Self <: SubscriptionFilter](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "destinationArn", js.undefined)
    
    inline def setDistribution(value: Distribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setFilterName(value: FilterName): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    inline def setFilterNameUndefined: Self = StObject.set(x, "filterName", js.undefined)
    
    inline def setFilterPattern(value: FilterPattern): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    inline def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
