package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinuxParameters extends StObject {
  
  /**
    * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker.  For tasks that use the Fargate launch type, capabilities is supported for all platform versions but the add parameter is only supported if using platform version 1.4.0 or later. 
    */
  var capabilities: js.UndefOr[KernelCapabilities] = js.undefined
  
  /**
    * Any host devices to expose to the container. This parameter maps to Devices in the Create a container section of the Docker Remote API and the --device option to docker run.  If you're using tasks that use the Fargate launch type, the devices parameter isn't supported. 
    */
  var devices: js.UndefOr[DevicesList] = js.undefined
  
  /**
    * Run an init process inside the container that forwards signals and reaps processes. This parameter maps to the --init option to docker run. This parameter requires version 1.25 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version --format '{{.Server.APIVersion}}' 
    */
  var initProcessEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The total amount of swap memory (in MiB) a container can use. This parameter will be translated to the --memory-swap option to docker run where the value would be the sum of the container memory plus the maxSwap value. If a maxSwap value of 0 is specified, the container will not use swap. Accepted values are 0 or any positive integer. If the maxSwap parameter is omitted, the container will use the swap configuration for the container instance it is running on. A maxSwap value must be set for the swappiness parameter to be used.  If you're using tasks that use the Fargate launch type, the maxSwap parameter isn't supported. 
    */
  var maxSwap: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The value for the size (in MiB) of the /dev/shm volume. This parameter maps to the --shm-size option to docker run.  If you are using tasks that use the Fargate launch type, the sharedMemorySize parameter is not supported. 
    */
  var sharedMemorySize: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * This allows you to tune a container's memory swappiness behavior. A swappiness value of 0 will cause swapping to not happen unless absolutely necessary. A swappiness value of 100 will cause pages to be swapped very aggressively. Accepted values are whole numbers between 0 and 100. If the swappiness parameter is not specified, a default value of 60 is used. If a value is not specified for maxSwap then this parameter is ignored. This parameter maps to the --memory-swappiness option to docker run.  If you're using tasks that use the Fargate launch type, the swappiness parameter isn't supported. 
    */
  var swappiness: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the --tmpfs option to docker run.  If you're using tasks that use the Fargate launch type, the tmpfs parameter isn't supported. 
    */
  var tmpfs: js.UndefOr[TmpfsList] = js.undefined
}
object LinuxParameters {
  
  inline def apply(): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinuxParameters] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: KernelCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setDevices(value: DevicesList): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setInitProcessEnabled(value: BoxedBoolean): Self = StObject.set(x, "initProcessEnabled", value.asInstanceOf[js.Any])
    
    inline def setInitProcessEnabledUndefined: Self = StObject.set(x, "initProcessEnabled", js.undefined)
    
    inline def setMaxSwap(value: BoxedInteger): Self = StObject.set(x, "maxSwap", value.asInstanceOf[js.Any])
    
    inline def setMaxSwapUndefined: Self = StObject.set(x, "maxSwap", js.undefined)
    
    inline def setSharedMemorySize(value: BoxedInteger): Self = StObject.set(x, "sharedMemorySize", value.asInstanceOf[js.Any])
    
    inline def setSharedMemorySizeUndefined: Self = StObject.set(x, "sharedMemorySize", js.undefined)
    
    inline def setSwappiness(value: BoxedInteger): Self = StObject.set(x, "swappiness", value.asInstanceOf[js.Any])
    
    inline def setSwappinessUndefined: Self = StObject.set(x, "swappiness", js.undefined)
    
    inline def setTmpfs(value: TmpfsList): Self = StObject.set(x, "tmpfs", value.asInstanceOf[js.Any])
    
    inline def setTmpfsUndefined: Self = StObject.set(x, "tmpfs", js.undefined)
    
    inline def setTmpfsVarargs(value: Tmpfs*): Self = StObject.set(x, "tmpfs", js.Array(value*))
  }
}
