package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionType extends js.Object {
  /**
    * The configuration properties for the action type.
    */
  var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.undefined
  /**
    * Represents information about an action type.
    */
  var id: ActionTypeId
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails
  /**
    * The settings for the action type.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.undefined
}

object ActionType {
  @scala.inline
  def apply(
    id: ActionTypeId,
    inputArtifactDetails: ArtifactDetails,
    outputArtifactDetails: ArtifactDetails,
    actionConfigurationProperties: ActionConfigurationPropertyList = null,
    settings: ActionTypeSettings = null
  ): ActionType = {
    val __obj = js.Dynamic.literal(id = id, inputArtifactDetails = inputArtifactDetails, outputArtifactDetails = outputArtifactDetails)
    if (actionConfigurationProperties != null) __obj.updateDynamic("actionConfigurationProperties")(actionConfigurationProperties)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[ActionType]
  }
}

