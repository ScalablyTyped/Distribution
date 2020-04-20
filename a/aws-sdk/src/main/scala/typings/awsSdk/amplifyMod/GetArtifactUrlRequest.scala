package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArtifactUrlRequest extends js.Object {
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId = js.native
}

object GetArtifactUrlRequest {
  @scala.inline
  def apply(artifactId: ArtifactId): GetArtifactUrlRequest = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlRequest]
  }
}

