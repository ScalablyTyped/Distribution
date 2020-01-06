package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created project.
    */
  var arn: ProjectArn = js.native
  /**
    * A user- or system-generated token that identifies the entity that requested project creation.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The ID of the project.
    */
  var id: ProjectId = js.native
  /**
    * Reserved for future use.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.native
}

object CreateProjectResult {
  @scala.inline
  def apply(
    arn: ProjectArn,
    id: ProjectId,
    clientRequestToken: ClientRequestToken = null,
    projectTemplateId: ProjectTemplateId = null
  ): CreateProjectResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (projectTemplateId != null) __obj.updateDynamic("projectTemplateId")(projectTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResult]
  }
}

