package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubscriptionFilterRequest extends StObject {
  
  /**
    * The name of the subscription filter.
    */
  var filterName: FilterName
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}
object DeleteSubscriptionFilterRequest {
  
  inline def apply(filterName: FilterName, logGroupName: LogGroupName): DeleteSubscriptionFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriptionFilterRequest]
  }
  
  extension [Self <: DeleteSubscriptionFilterRequest](x: Self) {
    
    inline def setFilterName(value: FilterName): Self = StObject.set(x, "filterName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
