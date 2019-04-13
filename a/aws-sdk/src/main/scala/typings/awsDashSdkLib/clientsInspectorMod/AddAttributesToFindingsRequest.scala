package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAttributesToFindingsRequest extends js.Object {
  /**
    * The array of attributes that you want to assign to specified findings.
    */
  var attributes: UserAttributeList
  /**
    * The ARNs that specify the findings that you want to assign attributes to.
    */
  var findingArns: AddRemoveAttributesFindingArnList
}

object AddAttributesToFindingsRequest {
  @scala.inline
  def apply(attributes: UserAttributeList, findingArns: AddRemoveAttributesFindingArnList): AddAttributesToFindingsRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes, findingArns = findingArns)
  
    __obj.asInstanceOf[AddAttributesToFindingsRequest]
  }
}

