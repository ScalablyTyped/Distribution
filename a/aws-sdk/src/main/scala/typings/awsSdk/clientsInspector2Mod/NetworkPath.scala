package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPath extends StObject {
  
  /**
    * The details on the steps in the network path.
    */
  var steps: js.UndefOr[StepList] = js.undefined
}
object NetworkPath {
  
  inline def apply(): NetworkPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPath]
  }
  
  extension [Self <: NetworkPath](x: Self) {
    
    inline def setSteps(value: StepList): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
