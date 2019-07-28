package typings.antd.esTableInterfaceMod

import typings.antd.esCheckboxCheckboxMod.CheckboxChangeEvent
import typings.antd.esRadioInterfaceMod.RadioChangeEvent
import typings.antd.esTableCreateStoreMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionBoxProps extends js.Object {
  var defaultSelection: js.Array[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var rowIndex: String = js.native
  var store: Store = js.native
  var `type`: js.UndefOr[RowSelectionType] = js.native
  def onChange(e: CheckboxChangeEvent): Unit = js.native
  def onChange(e: RadioChangeEvent): Unit = js.native
}

