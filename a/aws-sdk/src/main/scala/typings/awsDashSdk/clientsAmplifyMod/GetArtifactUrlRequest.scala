package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArtifactUrlRequest extends js.Object {
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId
}

object GetArtifactUrlRequest {
  @scala.inline
  def apply(artifactId: ArtifactId): GetArtifactUrlRequest = {
    val __obj = js.Dynamic.literal(artifactId = artifactId)
  
    __obj.asInstanceOf[GetArtifactUrlRequest]
  }
}

