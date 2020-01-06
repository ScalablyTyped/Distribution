package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image that you wish to retrieve. 
    */
  var imageBuildVersionArn: ImageBuildVersionArn = js.native
}

object GetImageRequest {
  @scala.inline
  def apply(imageBuildVersionArn: ImageBuildVersionArn): GetImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetImageRequest]
  }
}

