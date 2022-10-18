package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageResult extends StObject {
  
  /**
    * Information about the image.
    */
  var Image: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Image] = js.undefined
}
object DeleteImageResult {
  
  inline def apply(): DeleteImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageResult]
  }
  
  extension [Self <: DeleteImageResult](x: Self) {
    
    inline def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
  }
}
