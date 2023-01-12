package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiConditionalBranch extends StObject {
  
  /**
    * The condition to evaluate for the activity path.
    */
  var Condition: js.UndefOr[SimpleCondition] = js.undefined
  
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.undefined
}
object MultiConditionalBranch {
  
  inline def apply(): MultiConditionalBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiConditionalBranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiConditionalBranch] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: SimpleCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    inline def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
  }
}
