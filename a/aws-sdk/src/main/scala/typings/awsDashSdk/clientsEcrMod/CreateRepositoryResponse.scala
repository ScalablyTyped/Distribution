package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRepositoryResponse extends js.Object {
  /**
    * The repository that was created.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}

object CreateRepositoryResponse {
  @scala.inline
  def apply(repository: Repository = null): CreateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[CreateRepositoryResponse]
  }
}

