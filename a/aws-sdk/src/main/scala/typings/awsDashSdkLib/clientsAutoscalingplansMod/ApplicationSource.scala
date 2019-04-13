package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
    */
  var CloudFormationStackARN: js.UndefOr[XmlString] = js.undefined
  /**
    * A set of tags (up to 50).
    */
  var TagFilters: js.UndefOr[TagFilters] = js.undefined
}

object ApplicationSource {
  @scala.inline
  def apply(CloudFormationStackARN: XmlString = null, TagFilters: TagFilters = null): ApplicationSource = {
    val __obj = js.Dynamic.literal()
    if (CloudFormationStackARN != null) __obj.updateDynamic("CloudFormationStackARN")(CloudFormationStackARN)
    if (TagFilters != null) __obj.updateDynamic("TagFilters")(TagFilters)
    __obj.asInstanceOf[ApplicationSource]
  }
}

