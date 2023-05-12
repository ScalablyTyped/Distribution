package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateImageVersionResponse extends StObject {
  
  /**
    * The ARN of the image version.
    */
  var ImageVersionArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageVersionArn] = js.undefined
}
object UpdateImageVersionResponse {
  
  inline def apply(): UpdateImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateImageVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateImageVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionArnUndefined: Self = StObject.set(x, "ImageVersionArn", js.undefined)
  }
}
