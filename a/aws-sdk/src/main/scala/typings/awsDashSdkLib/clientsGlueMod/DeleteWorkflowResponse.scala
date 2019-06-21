package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkflowResponse extends js.Object {
  /**
    * Name of the workflow specified in input.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object DeleteWorkflowResponse {
  @scala.inline
  def apply(Name: NameString = null): DeleteWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DeleteWorkflowResponse]
  }
}

