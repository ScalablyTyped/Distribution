package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeDeploymentModelConfig extends StObject {
  
  /**
    * The edge packaging job associated with this deployment.
    */
  var EdgePackagingJobName: EntityName
  
  /**
    * The name the device application uses to reference this model.
    */
  var ModelHandle: EntityName
}
object EdgeDeploymentModelConfig {
  
  inline def apply(EdgePackagingJobName: EntityName, ModelHandle: EntityName): EdgeDeploymentModelConfig = {
    val __obj = js.Dynamic.literal(EdgePackagingJobName = EdgePackagingJobName.asInstanceOf[js.Any], ModelHandle = ModelHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDeploymentModelConfig]
  }
  
  extension [Self <: EdgeDeploymentModelConfig](x: Self) {
    
    inline def setEdgePackagingJobName(value: EntityName): Self = StObject.set(x, "EdgePackagingJobName", value.asInstanceOf[js.Any])
    
    inline def setModelHandle(value: EntityName): Self = StObject.set(x, "ModelHandle", value.asInstanceOf[js.Any])
  }
}
