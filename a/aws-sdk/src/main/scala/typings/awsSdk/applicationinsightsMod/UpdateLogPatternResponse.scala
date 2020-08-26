package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLogPatternResponse extends js.Object {
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogPattern] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
}

object UpdateLogPatternResponse {
  @scala.inline
  def apply(): UpdateLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLogPatternResponse]
  }
  @scala.inline
  implicit class UpdateLogPatternResponseOps[Self <: UpdateLogPatternResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogPattern(value: LogPattern): Self = this.set("LogPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPattern: Self = this.set("LogPattern", js.undefined)
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceGroupName: Self = this.set("ResourceGroupName", js.undefined)
  }
  
}

