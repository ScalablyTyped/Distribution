package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAttributesToFindingsRequest extends js.Object {
  /**
    * The array of attributes that you want to assign to specified findings.
    */
  var attributes: UserAttributeList = js.native
  /**
    * The ARNs that specify the findings that you want to assign attributes to.
    */
  var findingArns: AddRemoveAttributesFindingArnList = js.native
}

object AddAttributesToFindingsRequest {
  @scala.inline
  def apply(attributes: UserAttributeList, findingArns: AddRemoveAttributesFindingArnList): AddAttributesToFindingsRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], findingArns = findingArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddAttributesToFindingsRequest]
  }
}

