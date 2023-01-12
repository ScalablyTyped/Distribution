package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /**
    * A list of URIs for containers created in the context Region.
    */
  var imageUris: js.UndefOr[StringList] = js.undefined
  
  /**
    * Containers and container images are Region-specific. This is the Region context for the container.
    */
  var region: js.UndefOr[NonEmptyString] = js.undefined
}
object Container {
  
  inline def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setImageUris(value: StringList): Self = StObject.set(x, "imageUris", value.asInstanceOf[js.Any])
    
    inline def setImageUrisUndefined: Self = StObject.set(x, "imageUris", js.undefined)
    
    inline def setImageUrisVarargs(value: NonEmptyString*): Self = StObject.set(x, "imageUris", js.Array(value*))
    
    inline def setRegion(value: NonEmptyString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
