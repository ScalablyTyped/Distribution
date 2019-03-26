package typings
package agDashGridLib.distLibRenderingCellEditorsICellEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditorComp
  extends ICellEditor
     with agDashGridLib.distLibInterfacesIComponentMod.IComponent[ICellEditorParams]

object ICellEditorComp {
  @scala.inline
  def apply(
    getGui: () => stdLib.HTMLElement,
    getValue: () => js.Any,
    afterGuiAttached: /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    focusIn: () => scala.Unit = null,
    focusOut: () => scala.Unit = null,
    init: ICellEditorParams => agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit = null,
    isCancelAfterEnd: () => scala.Boolean = null,
    isCancelBeforeStart: () => scala.Boolean = null,
    isPopup: () => scala.Boolean = null
  ): ICellEditorComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getValue = js.Any.fromFunction0(getValue))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction0(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction0(focusOut))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (isCancelAfterEnd != null) __obj.updateDynamic("isCancelAfterEnd")(js.Any.fromFunction0(isCancelAfterEnd))
    if (isCancelBeforeStart != null) __obj.updateDynamic("isCancelBeforeStart")(js.Any.fromFunction0(isCancelBeforeStart))
    if (isPopup != null) __obj.updateDynamic("isPopup")(js.Any.fromFunction0(isPopup))
    __obj.asInstanceOf[ICellEditorComp]
  }
}

