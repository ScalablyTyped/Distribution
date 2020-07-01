package typings.antd.tabsMod

import typings.antd.antdStrings.add
import typings.antd.antdStrings.remove
import typings.antd.sizeContextMod.SizeType
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTabsProps * / any, 'editable'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTabsProps * / any[P]} */ trait TabsProps extends js.Object {
  var addIcon: js.UndefOr[ReactNode] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var hideAdd: js.UndefOr[Boolean] = js.undefined
  var onEdit: js.UndefOr[
    js.Function2[
      /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] | String, 
      /* action */ add | remove, 
      Unit
    ]
  ] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var `type`: js.UndefOr[TabsType] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    addIcon: ReactNode = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    hideAdd: js.UndefOr[Boolean] = js.undefined,
    onEdit: (/* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] | String, /* action */ add | remove) => Unit = null,
    size: SizeType = null,
    `type`: TabsType = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (addIcon != null) __obj.updateDynamic("addIcon")(addIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideAdd)) __obj.updateDynamic("hideAdd")(hideAdd.get.asInstanceOf[js.Any])
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction2(onEdit))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

