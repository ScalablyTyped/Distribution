package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageResponse extends StObject {
  
  /**
    * The ARN of the image.
    */
  var ImageArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageArn] = js.undefined
}
object CreateImageResponse {
  
  inline def apply(): CreateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateImageResponse] (val x: Self) extends AnyVal {
    
    inline def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
  }
}
