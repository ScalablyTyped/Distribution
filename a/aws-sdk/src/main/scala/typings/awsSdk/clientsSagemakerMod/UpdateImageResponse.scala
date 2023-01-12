package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImageResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var ImageArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageArn] = js.undefined
}
object UpdateImageResponse {
  
  inline def apply(): UpdateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateImageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateImageResponse] (val x: Self) extends AnyVal {
    
    inline def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
  }
}
