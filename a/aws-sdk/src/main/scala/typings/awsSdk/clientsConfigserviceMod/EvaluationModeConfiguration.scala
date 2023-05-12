package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationModeConfiguration extends StObject {
  
  /**
    * The mode of an evaluation. The valid values are Detective or Proactive.
    */
  var Mode: js.UndefOr[EvaluationMode] = js.undefined
}
object EvaluationModeConfiguration {
  
  inline def apply(): EvaluationModeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationModeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationModeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMode(value: EvaluationMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
