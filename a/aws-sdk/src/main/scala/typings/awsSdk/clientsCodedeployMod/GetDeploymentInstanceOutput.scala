package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentInstanceOutput extends StObject {
  
  /**
    *  Information about the instance. 
    */
  var instanceSummary: js.UndefOr[InstanceSummary] = js.undefined
}
object GetDeploymentInstanceOutput {
  
  inline def apply(): GetDeploymentInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentInstanceOutput]
  }
  
  extension [Self <: GetDeploymentInstanceOutput](x: Self) {
    
    inline def setInstanceSummary(value: InstanceSummary): Self = StObject.set(x, "instanceSummary", value.asInstanceOf[js.Any])
    
    inline def setInstanceSummaryUndefined: Self = StObject.set(x, "instanceSummary", js.undefined)
  }
}
