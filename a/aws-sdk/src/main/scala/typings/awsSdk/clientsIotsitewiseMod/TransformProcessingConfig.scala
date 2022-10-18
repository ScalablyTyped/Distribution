package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformProcessingConfig extends StObject {
  
  /**
    * The compute location for the given transform property. 
    */
  var computeLocation: ComputeLocation
  
  var forwardingConfig: js.UndefOr[ForwardingConfig] = js.undefined
}
object TransformProcessingConfig {
  
  inline def apply(computeLocation: ComputeLocation): TransformProcessingConfig = {
    val __obj = js.Dynamic.literal(computeLocation = computeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformProcessingConfig]
  }
  
  extension [Self <: TransformProcessingConfig](x: Self) {
    
    inline def setComputeLocation(value: ComputeLocation): Self = StObject.set(x, "computeLocation", value.asInstanceOf[js.Any])
    
    inline def setForwardingConfig(value: ForwardingConfig): Self = StObject.set(x, "forwardingConfig", value.asInstanceOf[js.Any])
    
    inline def setForwardingConfigUndefined: Self = StObject.set(x, "forwardingConfig", js.undefined)
  }
}
