package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails extends StObject {
  
  /**
    * The path on the container to mount the host volume at.
    */
  var ContainerPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the container has read-only access to the volume.
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the volume to mount. Must match the name of a volume listed in VolumeDetails for the task definition.
    */
  var SourceVolume: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails](x: Self) {
    
    inline def setContainerPath(value: NonEmptyString): Self = StObject.set(x, "ContainerPath", value.asInstanceOf[js.Any])
    
    inline def setContainerPathUndefined: Self = StObject.set(x, "ContainerPath", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setSourceVolume(value: NonEmptyString): Self = StObject.set(x, "SourceVolume", value.asInstanceOf[js.Any])
    
    inline def setSourceVolumeUndefined: Self = StObject.set(x, "SourceVolume", js.undefined)
  }
}
