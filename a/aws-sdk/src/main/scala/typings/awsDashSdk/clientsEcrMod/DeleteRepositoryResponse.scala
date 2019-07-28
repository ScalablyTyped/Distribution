package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRepositoryResponse extends js.Object {
  /**
    * The repository that was deleted.
    */
  var repository: js.UndefOr[Repository] = js.undefined
}

object DeleteRepositoryResponse {
  @scala.inline
  def apply(repository: Repository = null): DeleteRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[DeleteRepositoryResponse]
  }
}

