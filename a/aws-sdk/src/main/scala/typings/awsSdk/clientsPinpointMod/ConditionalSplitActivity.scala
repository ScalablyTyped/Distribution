package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalSplitActivity extends StObject {
  
  /**
    * The conditions that define the paths for the activity, and the relationship between the conditions.
    */
  var Condition: js.UndefOr[typings.awsSdk.clientsPinpointMod.Condition] = js.undefined
  
  /**
    * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon Pinpoint determines whether the conditions are met.
    */
  var EvaluationWaitTime: js.UndefOr[WaitTime] = js.undefined
  
  /**
    * The unique identifier for the activity to perform if the conditions aren't met.
    */
  var FalseActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the activity to perform if the conditions are met.
    */
  var TrueActivity: js.UndefOr[string] = js.undefined
}
object ConditionalSplitActivity {
  
  inline def apply(): ConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalSplitActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalSplitActivity] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setEvaluationWaitTime(value: WaitTime): Self = StObject.set(x, "EvaluationWaitTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationWaitTimeUndefined: Self = StObject.set(x, "EvaluationWaitTime", js.undefined)
    
    inline def setFalseActivity(value: string): Self = StObject.set(x, "FalseActivity", value.asInstanceOf[js.Any])
    
    inline def setFalseActivityUndefined: Self = StObject.set(x, "FalseActivity", js.undefined)
    
    inline def setTrueActivity(value: string): Self = StObject.set(x, "TrueActivity", value.asInstanceOf[js.Any])
    
    inline def setTrueActivityUndefined: Self = StObject.set(x, "TrueActivity", js.undefined)
  }
}
