package typings.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITemplateManipulators extends js.Object {
  var postWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.native
  var preWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.native
}

object ITemplateManipulators {
  @scala.inline
  def apply(): ITemplateManipulators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateManipulators]
  }
  @scala.inline
  implicit class ITemplateManipulatorsOps[Self <: ITemplateManipulators] (val x: Self) extends AnyVal {
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
    def setPostWrapperVarargs(value: ITemplateManipulator*): Self = this.set("postWrapper", js.Array(value :_*))
    @scala.inline
    def setPostWrapper(value: js.Array[ITemplateManipulator]): Self = this.set("postWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostWrapper: Self = this.set("postWrapper", js.undefined)
    @scala.inline
    def setPreWrapperVarargs(value: ITemplateManipulator*): Self = this.set("preWrapper", js.Array(value :_*))
    @scala.inline
    def setPreWrapper(value: js.Array[ITemplateManipulator]): Self = this.set("preWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreWrapper: Self = this.set("preWrapper", js.undefined)
  }
  
}

