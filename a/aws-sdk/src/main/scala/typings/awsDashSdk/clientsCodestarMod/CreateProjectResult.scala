package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created project.
    */
  var arn: ProjectArn
  /**
    * A user- or system-generated token that identifies the entity that requested project creation.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The ID of the project.
    */
  var id: ProjectId
  /**
    * Reserved for future use.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.undefined
}

object CreateProjectResult {
  @scala.inline
  def apply(
    arn: ProjectArn,
    id: ProjectId,
    clientRequestToken: ClientRequestToken = null,
    projectTemplateId: ProjectTemplateId = null
  ): CreateProjectResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (projectTemplateId != null) __obj.updateDynamic("projectTemplateId")(projectTemplateId)
    __obj.asInstanceOf[CreateProjectResult]
  }
}

