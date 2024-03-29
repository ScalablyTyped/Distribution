package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Image Builder image resource to delete.
    */
  var imageBuildVersionArn: ImageBuildVersionArn
}
object DeleteImageRequest {
  
  inline def apply(imageBuildVersionArn: ImageBuildVersionArn): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteImageRequest] (val x: Self) extends AnyVal {
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
