package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedArtifact extends js.Object {
  /**
    * A description that can be free-form text to record additional detail about the artifact for clarity or for later reference.
    */
  var Description: js.UndefOr[CreatedArtifactDescription] = js.undefined
  /**
    * An ARN that uniquely identifies the result of a migration task.
    */
  var Name: CreatedArtifactName
}

object CreatedArtifact {
  @scala.inline
  def apply(Name: CreatedArtifactName, Description: CreatedArtifactDescription = null): CreatedArtifact = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreatedArtifact]
  }
}

