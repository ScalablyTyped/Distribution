package typings
package angularDashFormlyLib.AngularFormlyNs

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
    if (postWrapper != null) __obj.updateDynamic("postWrapper")(postWrapper)
    if (preWrapper != null) __obj.updateDynamic("preWrapper")(preWrapper)
    __obj.asInstanceOf[ITemplateManipulators]
  }
}

