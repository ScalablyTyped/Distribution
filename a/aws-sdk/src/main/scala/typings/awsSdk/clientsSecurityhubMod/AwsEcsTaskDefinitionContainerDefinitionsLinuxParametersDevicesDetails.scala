package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails extends StObject {
  
  /**
    * The path inside the container at which to expose the host device.
    */
  var ContainerPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The path for the device on the host container instance.
    */
  var HostPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The explicit permissions to provide to the container for the device. By default, the container has permissions for read, write, and mknod for the device.
    */
  var Permissions: js.UndefOr[NonEmptyStringList] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails] (val x: Self) extends AnyVal {
    
    inline def setContainerPath(value: NonEmptyString): Self = StObject.set(x, "ContainerPath", value.asInstanceOf[js.Any])
    
    inline def setContainerPathUndefined: Self = StObject.set(x, "ContainerPath", js.undefined)
    
    inline def setHostPath(value: NonEmptyString): Self = StObject.set(x, "HostPath", value.asInstanceOf[js.Any])
    
    inline def setHostPathUndefined: Self = StObject.set(x, "HostPath", js.undefined)
    
    inline def setPermissions(value: NonEmptyStringList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Permissions", js.Array(value*))
  }
}
