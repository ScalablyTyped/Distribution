package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogPatternResponse extends js.Object {
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogPattern] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object CreateLogPatternResponse {
  @scala.inline
  def apply(LogPattern: LogPattern = null, ResourceGroupName: ResourceGroupName = null): CreateLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    if (LogPattern != null) __obj.updateDynamic("LogPattern")(LogPattern.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogPatternResponse]
  }
}

