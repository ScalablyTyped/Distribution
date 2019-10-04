package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  /**
    *  File name for the artifact. 
    */
  var artifactFileName: ArtifactFileName
  /**
    *  Unique Id for a artifact. 
    */
  var artifactId: ArtifactId
}

object Artifact {
  @scala.inline
  def apply(artifactFileName: ArtifactFileName, artifactId: ArtifactId): Artifact = {
    val __obj = js.Dynamic.literal(artifactFileName = artifactFileName, artifactId = artifactId)
  
    __obj.asInstanceOf[Artifact]
  }
}

