package typings.awsDashSdk.clientsCodegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateRepositoryResponse extends js.Object {
  /**
    * Information about the disassociated repository.
    */
  var RepositoryAssociation: js.UndefOr[typings.awsDashSdk.clientsCodegurureviewerMod.RepositoryAssociation] = js.native
}

object DisassociateRepositoryResponse {
  @scala.inline
  def apply(RepositoryAssociation: RepositoryAssociation = null): DisassociateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    if (RepositoryAssociation != null) __obj.updateDynamic("RepositoryAssociation")(RepositoryAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRepositoryResponse]
  }
}

