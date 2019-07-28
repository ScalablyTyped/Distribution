package typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditor extends js.Object {
  /** If doing full line edit, then gets called when focus should be put into the editor */
  var focusIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** If doing full line edit, then gets called when focus is leaving the editor */
  var focusOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Gets called once after editing is complete. If your return true, then the new value will not be used. The
    *  editing will have no impact on the record. Use this if you do not want a new value from your gui, i.e. you
    *  want to cancel the editing. */
  var isCancelAfterEnd: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** Gets called once after initialised. If you return true, the editor will not be used and the grid will continue
    *  editing. Use this to make a decision on editing inside the init() function, eg maybe you want to only start
    *  editing if the user hits a numeric key, but not a letter, if the editor is for numbers.
    * */
  var isCancelBeforeStart: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** Gets called once after initialised. If you return true, the editor will appear in a popup, so is not constrained
    *  to the boundaries of the cell. This is great if you want to, for example, provide you own custom dropdown list
    *  for selection. Default is false (ie if you don't provide the method). */
  var isPopup: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** Return the final value - called by the grid once after editing is complete */
  def getValue(): js.Any
}

object ICellEditor {
  @scala.inline
  def apply(
    getValue: () => js.Any,
    focusIn: () => Unit = null,
    focusOut: () => Unit = null,
    isCancelAfterEnd: () => Boolean = null,
    isCancelBeforeStart: () => Boolean = null,
    isPopup: () => Boolean = null
  ): ICellEditor = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction0(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction0(focusOut))
    if (isCancelAfterEnd != null) __obj.updateDynamic("isCancelAfterEnd")(js.Any.fromFunction0(isCancelAfterEnd))
    if (isCancelBeforeStart != null) __obj.updateDynamic("isCancelBeforeStart")(js.Any.fromFunction0(isCancelBeforeStart))
    if (isPopup != null) __obj.updateDynamic("isPopup")(js.Any.fromFunction0(isPopup))
    __obj.asInstanceOf[ICellEditor]
  }
}

