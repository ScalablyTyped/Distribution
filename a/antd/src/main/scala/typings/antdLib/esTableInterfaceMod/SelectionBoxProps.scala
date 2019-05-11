package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionBoxProps extends js.Object {
  var defaultSelection: js.Array[java.lang.String] = js.native
  var disabled: js.UndefOr[scala.Boolean] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var rowIndex: java.lang.String = js.native
  var store: antdLib.esTableCreateStoreMod.Store = js.native
  var `type`: js.UndefOr[RowSelectionType] = js.native
  def onChange(e: antdLib.esCheckboxCheckboxMod.CheckboxChangeEvent): scala.Unit = js.native
  def onChange(e: antdLib.esRadioInterfaceMod.RadioChangeEvent): scala.Unit = js.native
}

