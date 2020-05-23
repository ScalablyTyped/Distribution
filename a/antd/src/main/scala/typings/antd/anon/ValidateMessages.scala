package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateMessages extends js.Object {
  var validateMessages: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidateMessages */ js.Any
  ] = js.undefined
}

object ValidateMessages {
  @scala.inline
  def apply(
    validateMessages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidateMessages */ js.Any = null
  ): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateMessages]
  }
}

