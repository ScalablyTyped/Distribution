package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSource extends StObject {
  
  /**
    * The type of the image.
    */
  var Type: js.UndefOr[ImageSourceType] = js.undefined
}
object ImageSource {
  
  inline def apply(): ImageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSource]
  }
  
  extension [Self <: ImageSource](x: Self) {
    
    inline def setType(value: ImageSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
