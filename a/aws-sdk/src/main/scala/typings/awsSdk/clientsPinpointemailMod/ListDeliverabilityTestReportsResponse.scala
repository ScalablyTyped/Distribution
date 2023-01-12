package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeliverabilityTestReportsResponse extends StObject {
  
  /**
    * An object that contains a lists of predictive inbox placement tests that you've performed.
    */
  var DeliverabilityTestReports: typings.awsSdk.clientsPinpointemailMod.DeliverabilityTestReports
  
  /**
    * A token that indicates that there are additional predictive inbox placement tests to list. To view additional predictive inbox placement tests, issue another request to ListDeliverabilityTestReports, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.NextToken] = js.undefined
}
object ListDeliverabilityTestReportsResponse {
  
  inline def apply(DeliverabilityTestReports: DeliverabilityTestReports): ListDeliverabilityTestReportsResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReports = DeliverabilityTestReports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeliverabilityTestReportsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeliverabilityTestReports(value: DeliverabilityTestReports): Self = StObject.set(x, "DeliverabilityTestReports", value.asInstanceOf[js.Any])
    
    inline def setDeliverabilityTestReportsVarargs(value: DeliverabilityTestReport*): Self = StObject.set(x, "DeliverabilityTestReports", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
