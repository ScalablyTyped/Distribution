package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionCheckboxAllProps[T] extends js.Object {
  var data: js.Array[T] = js.native
  var disabled: scala.Boolean = js.native
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  var hideDefaultSelections: js.UndefOr[scala.Boolean] = js.native
  var locale: TableLocale = js.native
  var prefixCls: js.UndefOr[java.lang.String] = js.native
  var selections: js.UndefOr[js.Array[SelectionItem] | scala.Boolean] = js.native
  var store: antdLib.esTableCreateStoreMod.Store = js.native
  def getCheckboxPropsByItem(item: T, index: scala.Double): antdLib.Anon_DefaultChecked = js.native
  def getRecordKey(record: T): java.lang.String = js.native
  def getRecordKey(record: T, index: scala.Double): java.lang.String = js.native
  def onSelect(key: java.lang.String, index: scala.Double, selectFunc: js.Any): scala.Unit = js.native
}

