package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerImagesResult extends StObject {
  
  /**
    * An array of objects that describe container images that are registered to the container service.
    */
  var containerImages: js.UndefOr[ContainerImageList] = js.undefined
}
object GetContainerImagesResult {
  
  inline def apply(): GetContainerImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerImagesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContainerImagesResult] (val x: Self) extends AnyVal {
    
    inline def setContainerImages(value: ContainerImageList): Self = StObject.set(x, "containerImages", value.asInstanceOf[js.Any])
    
    inline def setContainerImagesUndefined: Self = StObject.set(x, "containerImages", js.undefined)
    
    inline def setContainerImagesVarargs(value: ContainerImage*): Self = StObject.set(x, "containerImages", js.Array(value*))
  }
}
