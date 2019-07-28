package typings.antd.libTableInterfaceMod

import typings.antd.libCheckboxCheckboxMod.CheckboxChangeEvent
import typings.antd.libRadioInterfaceMod.RadioChangeEvent
import typings.antd.libTableCreateStoreMod.Store
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

