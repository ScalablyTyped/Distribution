package typings.antd.treeSelectMod

import typings.antd.sizeContextMod.SizeType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any, 'showTreeIcon' | 'treeMotion' | 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any[P]} */ trait TreeSelectProps[T] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
}

object TreeSelectProps {
  @scala.inline
  def apply[T](bordered: js.UndefOr[Boolean] = js.undefined, size: SizeType = null, suffixIcon: ReactNode = null): TreeSelectProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSelectProps[T]]
  }
}

