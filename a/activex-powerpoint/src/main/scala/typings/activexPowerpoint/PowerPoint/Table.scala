package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  var AlternativeText: String = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Background: TableBackground = js.native
  val Columns: typings.activexPowerpoint.PowerPoint.Columns = js.native
  var FirstCol: Boolean = js.native
  var FirstRow: Boolean = js.native
  var HorizBanding: Boolean = js.native
  var LastCol: Boolean = js.native
  var LastRow: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Table_typekey")
  var PowerPointDotTable_typekey: Table = js.native
  val Rows: typings.activexPowerpoint.PowerPoint.Rows = js.native
  val Style: TableStyle = js.native
  var TableDirection: PpDirection = js.native
  var Title: String = js.native
  var VertBanding: Boolean = js.native
  /**
    * @param string [StyleID='']
    * @param boolean [SaveFormatting=false]
    */
  def ApplyStyle(): Unit = js.native
  def ApplyStyle(StyleID: js.UndefOr[scala.Nothing], SaveFormatting: Boolean): Unit = js.native
  def ApplyStyle(StyleID: String): Unit = js.native
  def ApplyStyle(StyleID: String, SaveFormatting: Boolean): Unit = js.native
  def Cell(Row: Double, Column: Double): typings.activexPowerpoint.PowerPoint.Cell = js.native
  def MergeBorders(): Unit = js.native
  def ScaleProportionally(scale: Double): Unit = js.native
}

