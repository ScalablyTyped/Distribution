package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerStateChange extends StObject {
  
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The exit code for the container, if the state change is a result of the container exiting.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The container image SHA 256 digest.
    */
  var imageDigest: js.UndefOr[String] = js.undefined
  
  /**
    * Any network bindings that are associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.undefined
  
  /**
    * The reason for the state change.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the container.
    */
  var status: js.UndefOr[String] = js.undefined
}
object ContainerStateChange {
  
  inline def apply(): ContainerStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerStateChange] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setExitCode(value: BoxedInteger): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setNetworkBindings(value: NetworkBindings): Self = StObject.set(x, "networkBindings", value.asInstanceOf[js.Any])
    
    inline def setNetworkBindingsUndefined: Self = StObject.set(x, "networkBindings", js.undefined)
    
    inline def setNetworkBindingsVarargs(value: NetworkBinding*): Self = StObject.set(x, "networkBindings", js.Array(value*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRuntimeId(value: String): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
