package typings.antd.textAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTextAreaProps * / any */ trait TextAreaProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply(allowClear: js.UndefOr[Boolean] = js.undefined): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps]
  }
}

