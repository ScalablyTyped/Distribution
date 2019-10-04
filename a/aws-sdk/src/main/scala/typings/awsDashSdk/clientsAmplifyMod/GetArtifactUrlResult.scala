package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetArtifactUrlResult extends js.Object {
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId
  /**
    *  Presigned url for the artifact. 
    */
  var artifactUrl: ArtifactUrl
}

object GetArtifactUrlResult {
  @scala.inline
  def apply(artifactId: ArtifactId, artifactUrl: ArtifactUrl): GetArtifactUrlResult = {
    val __obj = js.Dynamic.literal(artifactId = artifactId, artifactUrl = artifactUrl)
  
    __obj.asInstanceOf[GetArtifactUrlResult]
  }
}

