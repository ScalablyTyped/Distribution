package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDetails extends StObject {
  
  /**
    * The runtime of the container. 
    */
  var ContainerRuntime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the container image related to a finding.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the container image related to a finding.
    */
  var ImageName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the container started. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the container related to a finding.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user). 
    */
  var Privileged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides information about the mounting of a volume in a container. 
    */
  var VolumeMounts: js.UndefOr[VolumeMountList] = js.undefined
}
object ContainerDetails {
  
  inline def apply(): ContainerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerDetails] (val x: Self) extends AnyVal {
    
    inline def setContainerRuntime(value: NonEmptyString): Self = StObject.set(x, "ContainerRuntime", value.asInstanceOf[js.Any])
    
    inline def setContainerRuntimeUndefined: Self = StObject.set(x, "ContainerRuntime", js.undefined)
    
    inline def setImageId(value: NonEmptyString): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setImageName(value: NonEmptyString): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setImageNameUndefined: Self = StObject.set(x, "ImageName", js.undefined)
    
    inline def setLaunchedAt(value: NonEmptyString): Self = StObject.set(x, "LaunchedAt", value.asInstanceOf[js.Any])
    
    inline def setLaunchedAtUndefined: Self = StObject.set(x, "LaunchedAt", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
    
    inline def setVolumeMounts(value: VolumeMountList): Self = StObject.set(x, "VolumeMounts", value.asInstanceOf[js.Any])
    
    inline def setVolumeMountsUndefined: Self = StObject.set(x, "VolumeMounts", js.undefined)
    
    inline def setVolumeMountsVarargs(value: VolumeMount*): Self = StObject.set(x, "VolumeMounts", js.Array(value*))
  }
}
