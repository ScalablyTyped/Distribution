package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinuxParameters extends StObject {
  
  /**
    * Any host devices to expose to the container. This parameter maps to Devices in the Create a container section of the Docker Remote API and the --device option to docker run.  This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be provided. 
    */
  var devices: js.UndefOr[DevicesList] = js.undefined
  
  /**
    * If true, run an init process inside the container that forwards signals and reaps processes. This parameter maps to the --init option to docker run. This parameter requires version 1.25 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log into your container instance and run the following command: sudo docker version | grep "Server API version" 
    */
  var initProcessEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The total amount of swap memory (in MiB) a container can use. This parameter is translated to the --memory-swap option to docker run where the value is the sum of the container memory plus the maxSwap value. For more information, see  --memory-swap details in the Docker documentation. If a maxSwap value of 0 is specified, the container doesn't use swap. Accepted values are 0 or any positive integer. If the maxSwap parameter is omitted, the container doesn't use the swap configuration for the container instance it is running on. A maxSwap value must be set for the swappiness parameter to be used.  This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be provided. 
    */
  var maxSwap: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value for the size (in MiB) of the /dev/shm volume. This parameter maps to the --shm-size option to docker run.  This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be provided. 
    */
  var sharedMemorySize: js.UndefOr[Integer] = js.undefined
  
  /**
    * This allows you to tune a container's memory swappiness behavior. A swappiness value of 0 causes swapping not to happen unless absolutely necessary. A swappiness value of 100 causes pages to be swapped very aggressively. Accepted values are whole numbers between 0 and 100. If the swappiness parameter isn't specified, a default value of 60 is used. If a value isn't specified for maxSwap, then this parameter is ignored. If maxSwap is set to 0, the container doesn't use swap. This parameter maps to the --memory-swappiness option to docker run. Consider the following when you use a per-container swap configuration.   Swap space must be enabled and allocated on the container instance for the containers to use.  The Amazon ECS optimized AMIs don't have swap enabled by default. You must enable swap on the instance to use this feature. For more information, see Instance store swap volumes in the Amazon EC2 User Guide for Linux Instances or How do I allocate memory to work as swap space in an Amazon EC2 instance by using a swap file?     The swap space parameters are only supported for job definitions using EC2 resources.   If the maxSwap and swappiness parameters are omitted from a job definition, each container will have a default swappiness value of 60, and the total swap usage will be limited to two times the memory reservation of the container.    This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be provided. 
    */
  var swappiness: js.UndefOr[Integer] = js.undefined
  
  /**
    * The container path, mount options, and size (in MiB) of the tmpfs mount. This parameter maps to the --tmpfs option to docker run.  This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be provided. 
    */
  var tmpfs: js.UndefOr[TmpfsList] = js.undefined
}
object LinuxParameters {
  
  inline def apply(): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxParameters]
  }
  
  extension [Self <: LinuxParameters](x: Self) {
    
    inline def setDevices(value: DevicesList): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setInitProcessEnabled(value: Boolean): Self = StObject.set(x, "initProcessEnabled", value.asInstanceOf[js.Any])
    
    inline def setInitProcessEnabledUndefined: Self = StObject.set(x, "initProcessEnabled", js.undefined)
    
    inline def setMaxSwap(value: Integer): Self = StObject.set(x, "maxSwap", value.asInstanceOf[js.Any])
    
    inline def setMaxSwapUndefined: Self = StObject.set(x, "maxSwap", js.undefined)
    
    inline def setSharedMemorySize(value: Integer): Self = StObject.set(x, "sharedMemorySize", value.asInstanceOf[js.Any])
    
    inline def setSharedMemorySizeUndefined: Self = StObject.set(x, "sharedMemorySize", js.undefined)
    
    inline def setSwappiness(value: Integer): Self = StObject.set(x, "swappiness", value.asInstanceOf[js.Any])
    
    inline def setSwappinessUndefined: Self = StObject.set(x, "swappiness", js.undefined)
    
    inline def setTmpfs(value: TmpfsList): Self = StObject.set(x, "tmpfs", value.asInstanceOf[js.Any])
    
    inline def setTmpfsUndefined: Self = StObject.set(x, "tmpfs", js.undefined)
    
    inline def setTmpfsVarargs(value: Tmpfs*): Self = StObject.set(x, "tmpfs", js.Array(value*))
  }
}
