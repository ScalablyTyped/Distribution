package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArtifactUrlRequest extends js.Object {
  /**
    *  The unique ID for an artifact. 
    */
  var artifactId: ArtifactId = js.native
}

object GetArtifactUrlRequest {
  @scala.inline
  def apply(artifactId: ArtifactId): GetArtifactUrlRequest = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlRequest]
  }
  @scala.inline
  implicit class GetArtifactUrlRequestOps[Self <: GetArtifactUrlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArtifactId(value: ArtifactId): Self = this.set("artifactId", value.asInstanceOf[js.Any])
  }
  
}

