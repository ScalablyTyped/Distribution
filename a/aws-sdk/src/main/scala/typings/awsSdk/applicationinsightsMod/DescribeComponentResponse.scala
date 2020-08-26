package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentResponse extends js.Object {
  var ApplicationComponent: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationComponent] = js.native
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceList] = js.native
}

object DescribeComponentResponse {
  @scala.inline
  def apply(): DescribeComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentResponse]
  }
  @scala.inline
  implicit class DescribeComponentResponseOps[Self <: DescribeComponentResponse] (val x: Self) extends AnyVal {
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
    def setApplicationComponent(value: ApplicationComponent): Self = this.set("ApplicationComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationComponent: Self = this.set("ApplicationComponent", js.undefined)
    @scala.inline
    def setResourceListVarargs(value: ResourceARN*): Self = this.set("ResourceList", js.Array(value :_*))
    @scala.inline
    def setResourceList(value: ResourceList): Self = this.set("ResourceList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceList: Self = this.set("ResourceList", js.undefined)
  }
  
}

