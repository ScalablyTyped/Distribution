package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostVolumeProperties extends StObject {
  
  /**
    * When the host parameter is used, specify a sourcePath to declare the path on the host container instance that's presented to the container. If this parameter is empty, then the Docker daemon has assigned a host path for you. If the host parameter contains a sourcePath file location, then the data volume persists at the specified location on the host container instance until you delete it manually. If the sourcePath value doesn't exist on the host container instance, the Docker daemon creates it. If the location does exist, the contents of the source path folder are exported. If you're using the Fargate launch type, the sourcePath parameter is not supported.
    */
  var sourcePath: js.UndefOr[String] = js.undefined
}
object HostVolumeProperties {
  
  inline def apply(): HostVolumeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostVolumeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostVolumeProperties] (val x: Self) extends AnyVal {
    
    inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
  }
}
