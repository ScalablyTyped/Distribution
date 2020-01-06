package typings.awsDashSdk.clientsCodegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeCommitRepository extends js.Object {
  /**
    * The name of the AWS CodeCommit repository.
    */
  var Name: typings.awsDashSdk.clientsCodegurureviewerMod.Name = js.native
}

object CodeCommitRepository {
  @scala.inline
  def apply(Name: Name): CodeCommitRepository = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeCommitRepository]
  }
}

