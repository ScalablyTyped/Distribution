package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image that you want to retrieve.
    */
  var imageBuildVersionArn: ImageVersionArnOrBuildVersionArn
}
object GetImageRequest {
  
  inline def apply(imageBuildVersionArn: ImageVersionArnOrBuildVersionArn): GetImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImageRequest] (val x: Self) extends AnyVal {
    
    inline def setImageBuildVersionArn(value: ImageVersionArnOrBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
