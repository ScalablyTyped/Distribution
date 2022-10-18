package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetOnPremisesInstancesOutput extends StObject {
  
  /**
    * Information about the on-premises instances.
    */
  var instanceInfos: js.UndefOr[InstanceInfoList] = js.undefined
}
object BatchGetOnPremisesInstancesOutput {
  
  inline def apply(): BatchGetOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetOnPremisesInstancesOutput]
  }
  
  extension [Self <: BatchGetOnPremisesInstancesOutput](x: Self) {
    
    inline def setInstanceInfos(value: InstanceInfoList): Self = StObject.set(x, "instanceInfos", value.asInstanceOf[js.Any])
    
    inline def setInstanceInfosUndefined: Self = StObject.set(x, "instanceInfos", js.undefined)
    
    inline def setInstanceInfosVarargs(value: InstanceInfo*): Self = StObject.set(x, "instanceInfos", js.Array(value*))
  }
}
