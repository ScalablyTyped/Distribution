package typings.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateManipulators extends js.Object {
  var postWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.undefined
  var preWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.undefined
}

object ITemplateManipulators {
  @scala.inline
  def apply(
    postWrapper: js.Array[ITemplateManipulator] = null,
    preWrapper: js.Array[ITemplateManipulator] = null
  ): ITemplateManipulators = {
    val __obj = js.Dynamic.literal()
    if (postWrapper != null) __obj.updateDynamic("postWrapper")(postWrapper.asInstanceOf[js.Any])
    if (preWrapper != null) __obj.updateDynamic("preWrapper")(preWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateManipulators]
  }
}

