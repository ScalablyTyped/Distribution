package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  /**
    *  File name for the artifact. 
    */
  var artifactFileName: ArtifactFileName = js.native
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId = js.native
}

object Artifact {
  @scala.inline
  def apply(artifactFileName: ArtifactFileName, artifactId: ArtifactId): Artifact = {
    val __obj = js.Dynamic.literal(artifactFileName = artifactFileName.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Artifact]
  }
}

