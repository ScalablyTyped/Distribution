package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentsOutput extends StObject {
  
  /**
    *  Information about the deployments. 
    */
  var deploymentsInfo: js.UndefOr[DeploymentsInfoList] = js.undefined
}
object BatchGetDeploymentsOutput {
  
  inline def apply(): BatchGetDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentsOutput]
  }
  
  extension [Self <: BatchGetDeploymentsOutput](x: Self) {
    
    inline def setDeploymentsInfo(value: DeploymentsInfoList): Self = StObject.set(x, "deploymentsInfo", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsInfoUndefined: Self = StObject.set(x, "deploymentsInfo", js.undefined)
    
    inline def setDeploymentsInfoVarargs(value: DeploymentInfo*): Self = StObject.set(x, "deploymentsInfo", js.Array(value*))
  }
}
