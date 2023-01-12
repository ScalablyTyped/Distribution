package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateStopCondition extends StObject {
  
  /**
    * The source for the stop condition.
    */
  var source: js.UndefOr[StopConditionSource] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
    */
  var value: js.UndefOr[StopConditionValue] = js.undefined
}
object ExperimentTemplateStopCondition {
  
  inline def apply(): ExperimentTemplateStopCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateStopCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentTemplateStopCondition] (val x: Self) extends AnyVal {
    
    inline def setSource(value: StopConditionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setValue(value: StopConditionValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
