package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerConfiguration extends StObject {
  
  /**
    *  The name of the container. 
    */
  var containerName: js.UndefOr[ContainerName] = js.undefined
  
  /**
    *  The number of CPU units reserved for the container. 
    */
  var cpu: js.UndefOr[NullableCpu] = js.undefined
  
  /**
    *  The memory size configurations for the container. 
    */
  var memorySizeConfiguration: js.UndefOr[MemorySizeConfiguration] = js.undefined
}
object ContainerConfiguration {
  
  inline def apply(): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setCpu(value: NullableCpu): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setMemorySizeConfiguration(value: MemorySizeConfiguration): Self = StObject.set(x, "memorySizeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeConfigurationUndefined: Self = StObject.set(x, "memorySizeConfiguration", js.undefined)
  }
}
