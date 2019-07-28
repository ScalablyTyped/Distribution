package typings.antd.libTableInterfaceMod

import typings.antd.Anon_DefaultChecked
import typings.antd.libTableCreateStoreMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionCheckboxAllProps[T] extends js.Object {
  var data: js.Array[T] = js.native
  var disabled: Boolean = js.native
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  var hideDefaultSelections: js.UndefOr[Boolean] = js.native
  var locale: TableLocale = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var selections: js.UndefOr[js.Array[SelectionItem] | Boolean] = js.native
  var store: Store = js.native
  def getCheckboxPropsByItem(item: T, index: Double): Anon_DefaultChecked = js.native
  def getRecordKey(record: T): String = js.native
  def getRecordKey(record: T, index: Double): String = js.native
  def onSelect(key: String, index: Double, selectFunc: js.Any): Unit = js.native
}

