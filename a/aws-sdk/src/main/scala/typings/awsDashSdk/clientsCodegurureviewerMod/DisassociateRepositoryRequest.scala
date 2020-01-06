package typings.awsDashSdk.clientsCodegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateRepositoryRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the association.
    */
  var AssociationArn: Arn = js.native
}

object DisassociateRepositoryRequest {
  @scala.inline
  def apply(AssociationArn: Arn): DisassociateRepositoryRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateRepositoryRequest]
  }
}

