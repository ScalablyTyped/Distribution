package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsJobAbortCriteria extends StObject {
  
  /**
    * The type of job action to take to initiate the job abort.
    */
  var action: AwsJobAbortCriteriaAbortAction
  
  /**
    * The type of job execution failures that can initiate a job abort.
    */
  var failureType: AwsJobAbortCriteriaFailureType
  
  /**
    * The minimum number of things which must receive job execution notifications before the job can be aborted.
    */
  var minNumberOfExecutedThings: AwsJobAbortCriteriaMinimumNumberOfExecutedThings
  
  /**
    * The minimum percentage of job execution failures that must occur to initiate the job abort. Amazon Web Services IoT Core supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
    */
  var thresholdPercentage: AwsJobAbortCriteriaAbortThresholdPercentage
}
object AwsJobAbortCriteria {
  
  inline def apply(
    action: AwsJobAbortCriteriaAbortAction,
    failureType: AwsJobAbortCriteriaFailureType,
    minNumberOfExecutedThings: AwsJobAbortCriteriaMinimumNumberOfExecutedThings,
    thresholdPercentage: AwsJobAbortCriteriaAbortThresholdPercentage
  ): AwsJobAbortCriteria = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], minNumberOfExecutedThings = minNumberOfExecutedThings.asInstanceOf[js.Any], thresholdPercentage = thresholdPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobAbortCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsJobAbortCriteria] (val x: Self) extends AnyVal {
    
    inline def setAction(value: AwsJobAbortCriteriaAbortAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: AwsJobAbortCriteriaFailureType): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    inline def setMinNumberOfExecutedThings(value: AwsJobAbortCriteriaMinimumNumberOfExecutedThings): Self = StObject.set(x, "minNumberOfExecutedThings", value.asInstanceOf[js.Any])
    
    inline def setThresholdPercentage(value: AwsJobAbortCriteriaAbortThresholdPercentage): Self = StObject.set(x, "thresholdPercentage", value.asInstanceOf[js.Any])
  }
}
