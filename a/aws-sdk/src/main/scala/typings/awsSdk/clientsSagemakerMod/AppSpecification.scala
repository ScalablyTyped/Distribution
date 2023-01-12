package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppSpecification extends StObject {
  
  /**
    * The arguments for a container used to run a processing job.
    */
  var ContainerArguments: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContainerArguments] = js.undefined
  
  /**
    * The entrypoint for a container used to run a processing job.
    */
  var ContainerEntrypoint: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContainerEntrypoint] = js.undefined
  
  /**
    * The container image to be run by the processing job.
    */
  var ImageUri: typings.awsSdk.clientsSagemakerMod.ImageUri
}
object AppSpecification {
  
  inline def apply(ImageUri: ImageUri): AppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppSpecification] (val x: Self) extends AnyVal {
    
    inline def setContainerArguments(value: ContainerArguments): Self = StObject.set(x, "ContainerArguments", value.asInstanceOf[js.Any])
    
    inline def setContainerArgumentsUndefined: Self = StObject.set(x, "ContainerArguments", js.undefined)
    
    inline def setContainerArgumentsVarargs(value: ContainerArgument*): Self = StObject.set(x, "ContainerArguments", js.Array(value*))
    
    inline def setContainerEntrypoint(value: ContainerEntrypoint): Self = StObject.set(x, "ContainerEntrypoint", value.asInstanceOf[js.Any])
    
    inline def setContainerEntrypointUndefined: Self = StObject.set(x, "ContainerEntrypoint", js.undefined)
    
    inline def setContainerEntrypointVarargs(value: ContainerEntrypointString*): Self = StObject.set(x, "ContainerEntrypoint", js.Array(value*))
    
    inline def setImageUri(value: ImageUri): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
  }
}
