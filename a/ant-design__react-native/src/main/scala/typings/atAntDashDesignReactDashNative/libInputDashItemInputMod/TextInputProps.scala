package typings.atAntDashDesignReactDashNative.libInputDashItemInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties * / any */ trait TextInputProps extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(focused: js.UndefOr[Boolean] = js.undefined): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputProps]
  }
}

