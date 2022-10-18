package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /**
    * The container runtime (such as, Docker or containerd) used to run the container.
    */
  var ContainerRuntime: js.UndefOr[String] = js.undefined
  
  /**
    * Container ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * Container image.
    */
  var Image: js.UndefOr[String] = js.undefined
  
  /**
    * Part of the image name before the last slash. For example, imagePrefix for public.ecr.aws/amazonlinux/amazonlinux:latest would be public.ecr.aws/amazonlinux. If the image name is relative and does not have a slash, this field is empty.
    */
  var ImagePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Container name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Container security context.
    */
  var SecurityContext: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.SecurityContext] = js.undefined
  
  /**
    * Container volume mounts.
    */
  var VolumeMounts: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.VolumeMounts] = js.undefined
}
object Container {
  
  inline def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainerRuntime(value: String): Self = StObject.set(x, "ContainerRuntime", value.asInstanceOf[js.Any])
    
    inline def setContainerRuntimeUndefined: Self = StObject.set(x, "ContainerRuntime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImagePrefix(value: String): Self = StObject.set(x, "ImagePrefix", value.asInstanceOf[js.Any])
    
    inline def setImagePrefixUndefined: Self = StObject.set(x, "ImagePrefix", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecurityContext(value: SecurityContext): Self = StObject.set(x, "SecurityContext", value.asInstanceOf[js.Any])
    
    inline def setSecurityContextUndefined: Self = StObject.set(x, "SecurityContext", js.undefined)
    
    inline def setVolumeMounts(value: VolumeMounts): Self = StObject.set(x, "VolumeMounts", value.asInstanceOf[js.Any])
    
    inline def setVolumeMountsUndefined: Self = StObject.set(x, "VolumeMounts", js.undefined)
    
    inline def setVolumeMountsVarargs(value: VolumeMount*): Self = StObject.set(x, "VolumeMounts", js.Array(value*))
  }
}
