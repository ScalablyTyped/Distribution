package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContextKeysForPolicyResponse extends js.Object {
  /**
    * The list of context keys that are referenced in the input policies.
    */
  var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
}

object GetContextKeysForPolicyResponse {
  @scala.inline
  def apply(ContextKeyNames: ContextKeyNamesResultListType = null): GetContextKeysForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ContextKeyNames != null) __obj.updateDynamic("ContextKeyNames")(ContextKeyNames)
    __obj.asInstanceOf[GetContextKeysForPolicyResponse]
  }
}

