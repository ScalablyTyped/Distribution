package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPolicyAttachmentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of ObjectIdentifiers to which the policy is attached.
    */
  var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
}

object ListPolicyAttachmentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ObjectIdentifiers: ObjectIdentifierList = null): ListPolicyAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ObjectIdentifiers != null) __obj.updateDynamic("ObjectIdentifiers")(ObjectIdentifiers)
    __obj.asInstanceOf[ListPolicyAttachmentsResponse]
  }
}

