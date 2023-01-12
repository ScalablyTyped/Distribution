package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceConfiguration extends StObject {
  
  /**
    * The type of the compute resource used to execute the containerAction. Possible values are: ACU_1 (vCPU=4, memory=16 GiB) or ACU_2 (vCPU=8, memory=32 GiB).
    */
  var computeType: ComputeType
  
  /**
    * The size, in GB, of the persistent storage available to the resource instance used to execute the containerAction (min: 1, max: 50).
    */
  var volumeSizeInGB: VolumeSizeInGB
}
object ResourceConfiguration {
  
  inline def apply(computeType: ComputeType, volumeSizeInGB: VolumeSizeInGB): ResourceConfiguration = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], volumeSizeInGB = volumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setComputeType(value: ComputeType): Self = StObject.set(x, "computeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGB(value: VolumeSizeInGB): Self = StObject.set(x, "volumeSizeInGB", value.asInstanceOf[js.Any])
  }
}
