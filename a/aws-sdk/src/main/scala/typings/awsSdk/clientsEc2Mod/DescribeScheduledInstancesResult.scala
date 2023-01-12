package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledInstancesResult extends StObject {
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[typings.awsSdk.clientsEc2Mod.ScheduledInstanceSet] = js.undefined
}
object DescribeScheduledInstancesResult {
  
  inline def apply(): DescribeScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstancesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeScheduledInstancesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledInstanceSet(value: ScheduledInstanceSet): Self = StObject.set(x, "ScheduledInstanceSet", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstanceSetUndefined: Self = StObject.set(x, "ScheduledInstanceSet", js.undefined)
    
    inline def setScheduledInstanceSetVarargs(value: ScheduledInstance*): Self = StObject.set(x, "ScheduledInstanceSet", js.Array(value*))
  }
}
