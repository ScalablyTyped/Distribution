package typings.awsDashSdk.clientsCodegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRepositoryRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you want to add a new repository association, this parameter specifies a unique identifier for the new repository association that helps ensure idempotency. If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for new versions and include that value in the request. You typically only need to interact with this value if you implement your own retry logic and want to ensure that a given repository association is not created twice. We recommend that you generate a UUID-type value to ensure uniqueness within the specified repository association. Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate repository associations if there are failures and retries. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsCodegurureviewerMod.ClientRequestToken] = js.native
  /**
    * The repository to associate.
    */
  var Repository: typings.awsDashSdk.clientsCodegurureviewerMod.Repository = js.native
}

object AssociateRepositoryRequest {
  @scala.inline
  def apply(Repository: Repository, ClientRequestToken: ClientRequestToken = null): AssociateRepositoryRequest = {
    val __obj = js.Dynamic.literal(Repository = Repository.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRepositoryRequest]
  }
}

