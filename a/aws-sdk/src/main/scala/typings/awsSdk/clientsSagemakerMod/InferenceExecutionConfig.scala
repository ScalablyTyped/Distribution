package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceExecutionConfig extends StObject {
  
  /**
    * How containers in a multi-container are run. The following values are valid.    SERIAL - Containers run as a serial pipeline.    DIRECT - Only the individual container that you specify is run.  
    */
  var Mode: InferenceExecutionMode
}
object InferenceExecutionConfig {
  
  inline def apply(Mode: InferenceExecutionMode): InferenceExecutionConfig = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceExecutionConfig]
  }
  
  extension [Self <: InferenceExecutionConfig](x: Self) {
    
    inline def setMode(value: InferenceExecutionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
