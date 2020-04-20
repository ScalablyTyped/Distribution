package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArtifactUrlResult extends js.Object {
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId = js.native
  /**
    *  Presigned url for the artifact. 
    */
  var artifactUrl: ArtifactUrl = js.native
}

object GetArtifactUrlResult {
  @scala.inline
  def apply(artifactId: ArtifactId, artifactUrl: ArtifactUrl): GetArtifactUrlResult = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any], artifactUrl = artifactUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlResult]
  }
}

