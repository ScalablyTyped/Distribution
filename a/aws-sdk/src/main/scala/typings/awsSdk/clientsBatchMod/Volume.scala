package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * This parameter is specified when you are using an Amazon Elastic File System file system for job storage. Jobs that are running on Fargate resources must specify a platformVersion of at least 1.4.0.
    */
  var efsVolumeConfiguration: js.UndefOr[EFSVolumeConfiguration] = js.undefined
  
  /**
    * The contents of the host parameter determine whether your data volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed to persist after the containers associated with it stop running.  This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't be provided. 
    */
  var host: js.UndefOr[Host] = js.undefined
  
  /**
    * The name of the volume. It can be up to 255 letters long. It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_). This name is referenced in the sourceVolume parameter of container definition mountPoints.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  extension [Self <: Volume](x: Self) {
    
    inline def setEfsVolumeConfiguration(value: EFSVolumeConfiguration): Self = StObject.set(x, "efsVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEfsVolumeConfigurationUndefined: Self = StObject.set(x, "efsVolumeConfiguration", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
