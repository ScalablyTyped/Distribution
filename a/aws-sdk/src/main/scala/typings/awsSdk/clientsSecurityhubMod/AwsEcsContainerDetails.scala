package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsContainerDetails extends StObject {
  
  /**
    * The image used for the container. 
    */
  var Image: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The mount points for data volumes in your container. 
    */
  var MountPoints: js.UndefOr[AwsMountPointList] = js.undefined
  
  /**
    * The name of the container. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user). 
    */
  var Privileged: js.UndefOr[Boolean] = js.undefined
}
object AwsEcsContainerDetails {
  
  inline def apply(): AwsEcsContainerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsContainerDetails]
  }
  
  extension [Self <: AwsEcsContainerDetails](x: Self) {
    
    inline def setImage(value: NonEmptyString): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setMountPoints(value: AwsMountPointList): Self = StObject.set(x, "MountPoints", value.asInstanceOf[js.Any])
    
    inline def setMountPointsUndefined: Self = StObject.set(x, "MountPoints", js.undefined)
    
    inline def setMountPointsVarargs(value: AwsMountPoint*): Self = StObject.set(x, "MountPoints", js.Array(value*))
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
  }
}
