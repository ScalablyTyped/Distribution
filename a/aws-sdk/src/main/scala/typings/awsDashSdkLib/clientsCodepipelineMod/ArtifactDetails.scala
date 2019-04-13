package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactDetails extends js.Object {
  /**
    * The maximum number of artifacts allowed for the action type.
    */
  var maximumCount: MaximumArtifactCount
  /**
    * The minimum number of artifacts allowed for the action type.
    */
  var minimumCount: MinimumArtifactCount
}

object ArtifactDetails {
  @scala.inline
  def apply(maximumCount: MaximumArtifactCount, minimumCount: MinimumArtifactCount): ArtifactDetails = {
    val __obj = js.Dynamic.literal(maximumCount = maximumCount, minimumCount = minimumCount)
  
    __obj.asInstanceOf[ArtifactDetails]
  }
}

