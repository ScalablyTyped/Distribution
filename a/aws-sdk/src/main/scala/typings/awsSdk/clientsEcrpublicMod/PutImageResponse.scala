package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageResponse extends StObject {
  
  /**
    * Details of the image uploaded.
    */
  var image: js.UndefOr[Image] = js.undefined
}
object PutImageResponse {
  
  inline def apply(): PutImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageResponse]
  }
  
  extension [Self <: PutImageResponse](x: Self) {
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
