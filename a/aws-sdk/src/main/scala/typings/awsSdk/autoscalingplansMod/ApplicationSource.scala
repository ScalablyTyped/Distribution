package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
    */
  var CloudFormationStackARN: js.UndefOr[XmlString] = js.native
  /**
    * A set of tags (up to 50).
    */
  var TagFilters: js.UndefOr[typings.awsSdk.autoscalingplansMod.TagFilters] = js.native
}

object ApplicationSource {
  @scala.inline
  def apply(): ApplicationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSource]
  }
  @scala.inline
  implicit class ApplicationSourceOps[Self <: ApplicationSource] (val x: Self) extends AnyVal {
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
    def setCloudFormationStackARN(value: XmlString): Self = this.set("CloudFormationStackARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudFormationStackARN: Self = this.set("CloudFormationStackARN", js.undefined)
    @scala.inline
    def setTagFiltersVarargs(value: TagFilter*): Self = this.set("TagFilters", js.Array(value :_*))
    @scala.inline
    def setTagFilters(value: TagFilters): Self = this.set("TagFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagFilters: Self = this.set("TagFilters", js.undefined)
  }
  
}

