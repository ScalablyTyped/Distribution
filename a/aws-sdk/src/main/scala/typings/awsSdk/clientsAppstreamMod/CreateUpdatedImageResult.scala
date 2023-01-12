package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUpdatedImageResult extends StObject {
  
  /**
    * Indicates whether a new image can be created.
    */
  var canUpdateImage: js.UndefOr[Boolean] = js.undefined
  
  var image: js.UndefOr[Image] = js.undefined
}
object CreateUpdatedImageResult {
  
  inline def apply(): CreateUpdatedImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUpdatedImageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUpdatedImageResult] (val x: Self) extends AnyVal {
    
    inline def setCanUpdateImage(value: Boolean): Self = StObject.set(x, "canUpdateImage", value.asInstanceOf[js.Any])
    
    inline def setCanUpdateImageUndefined: Self = StObject.set(x, "canUpdateImage", js.undefined)
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
