package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterOutput extends StObject {
  
  /**
    * The number of steps that can be executed concurrently.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.undefined
}
object ModifyClusterOutput {
  
  inline def apply(): ModifyClusterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterOutput]
  }
  
  extension [Self <: ModifyClusterOutput](x: Self) {
    
    inline def setStepConcurrencyLevel(value: Integer): Self = StObject.set(x, "StepConcurrencyLevel", value.asInstanceOf[js.Any])
    
    inline def setStepConcurrencyLevelUndefined: Self = StObject.set(x, "StepConcurrencyLevel", js.undefined)
  }
}
