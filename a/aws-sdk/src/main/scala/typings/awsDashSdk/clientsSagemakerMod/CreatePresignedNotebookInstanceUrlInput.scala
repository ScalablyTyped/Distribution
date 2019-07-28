package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
  /**
    * The name of the notebook instance.
    */
  var NotebookInstanceName: typings.awsDashSdk.clientsSagemakerMod.NotebookInstanceName
  /**
    * The duration of the session, in seconds. The default is 12 hours.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SessionExpirationDurationInSeconds] = js.undefined
}

object CreatePresignedNotebookInstanceUrlInput {
  @scala.inline
  def apply(
    NotebookInstanceName: NotebookInstanceName,
    SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined
  ): CreatePresignedNotebookInstanceUrlInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName)
    if (!js.isUndefined(SessionExpirationDurationInSeconds)) __obj.updateDynamic("SessionExpirationDurationInSeconds")(SessionExpirationDurationInSeconds)
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
  }
}

