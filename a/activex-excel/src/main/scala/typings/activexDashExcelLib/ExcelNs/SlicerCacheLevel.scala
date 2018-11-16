package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SlicerCacheLevel")
@js.native
class SlicerCacheLevel protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  var CrossFilterType: XlSlicerCrossFilterType = js.native
  var `Excel.SlicerCacheLevel_typekey`: SlicerCacheLevel = js.native
  val Name: java.lang.String = js.native
  val Ordinal: scala.Double = js.native
  val Parent: js.Any = js.native
  @JSName("SlicerItems")
  val SlicerItems_Original: SlicerItems = js.native
  var SortItems: XlSlicerSort = js.native
  val VisibleSlicerItemsList: js.Any = js.native
  def SlicerItems(Index: java.lang.String): SlicerItem = js.native
  def SlicerItems(Index: scala.Double): SlicerItem = js.native
}

