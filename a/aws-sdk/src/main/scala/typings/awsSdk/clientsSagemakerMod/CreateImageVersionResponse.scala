package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageVersionResponse extends StObject {
  
  /**
    * The ARN of the image version.
    */
  var ImageVersionArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageVersionArn] = js.undefined
}
object CreateImageVersionResponse {
  
  inline def apply(): CreateImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateImageVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionArnUndefined: Self = StObject.set(x, "ImageVersionArn", js.undefined)
  }
}
