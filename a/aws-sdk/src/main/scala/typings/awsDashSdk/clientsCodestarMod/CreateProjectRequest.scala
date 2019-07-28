package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectRequest extends js.Object {
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. This token can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  /**
    * The ID of the project to be created in AWS CodeStar.
    */
  var id: ProjectId
  /**
    * The display name for the project to be created in AWS CodeStar.
    */
  var name: ProjectName
  /**
    * A list of the Code objects submitted with the project request. If this parameter is specified, the request must also include the toolchain parameter.
    */
  var sourceCode: js.UndefOr[SourceCode] = js.undefined
  /**
    * The tags created for the project.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The name of the toolchain template file submitted with the project request. If this parameter is specified, the request must also include the sourceCode parameter.
    */
  var toolchain: js.UndefOr[Toolchain] = js.undefined
}

object CreateProjectRequest {
  @scala.inline
  def apply(
    id: ProjectId,
    name: ProjectName,
    clientRequestToken: ClientRequestToken = null,
    description: ProjectDescription = null,
    sourceCode: SourceCode = null,
    tags: Tags = null,
    toolchain: Toolchain = null
  ): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (description != null) __obj.updateDynamic("description")(description)
    if (sourceCode != null) __obj.updateDynamic("sourceCode")(sourceCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (toolchain != null) __obj.updateDynamic("toolchain")(toolchain)
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

