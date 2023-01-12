package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutpostsInput extends StObject {
  
  /**
    * Filters the results by Availability Zone (for example, us-east-1a).
    */
  var AvailabilityZoneFilter: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * Filters the results by AZ ID (for example, use1-az1).
    */
  var AvailabilityZoneIdFilter: js.UndefOr[AvailabilityZoneIdList] = js.undefined
  
  /**
    * Filters the results by the lifecycle status.
    */
  var LifeCycleStatusFilter: js.UndefOr[LifeCycleStatusList] = js.undefined
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListOutpostsInput {
  
  inline def apply(): ListOutpostsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOutpostsInput] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneFilter(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZoneFilter", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneFilterUndefined: Self = StObject.set(x, "AvailabilityZoneFilter", js.undefined)
    
    inline def setAvailabilityZoneFilterVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZoneFilter", js.Array(value*))
    
    inline def setAvailabilityZoneIdFilter(value: AvailabilityZoneIdList): Self = StObject.set(x, "AvailabilityZoneIdFilter", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdFilterUndefined: Self = StObject.set(x, "AvailabilityZoneIdFilter", js.undefined)
    
    inline def setAvailabilityZoneIdFilterVarargs(value: AvailabilityZoneId*): Self = StObject.set(x, "AvailabilityZoneIdFilter", js.Array(value*))
    
    inline def setLifeCycleStatusFilter(value: LifeCycleStatusList): Self = StObject.set(x, "LifeCycleStatusFilter", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStatusFilterUndefined: Self = StObject.set(x, "LifeCycleStatusFilter", js.undefined)
    
    inline def setLifeCycleStatusFilterVarargs(value: LifeCycleStatus*): Self = StObject.set(x, "LifeCycleStatusFilter", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
