package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Table")
@js.native
class Table protected () extends js.Object {
  var AlternativeText: java.lang.String = js.native
  val Application: Application = js.native
  val Background: TableBackground = js.native
  val Columns: Columns = js.native
  var FirstCol: scala.Boolean = js.native
  var FirstRow: scala.Boolean = js.native
  var HorizBanding: scala.Boolean = js.native
  var LastCol: scala.Boolean = js.native
  var LastRow: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Table_typekey`: Table = js.native
  val Rows: Rows = js.native
  val Style: TableStyle = js.native
  var TableDirection: PpDirection = js.native
  var Title: java.lang.String = js.native
  var VertBanding: scala.Boolean = js.native
  /**
    * @param string [StyleID='']
    * @param boolean [SaveFormatting=false]
    */
  def ApplyStyle(): scala.Unit = js.native
  def ApplyStyle(StyleID: java.lang.String): scala.Unit = js.native
  def ApplyStyle(StyleID: java.lang.String, SaveFormatting: scala.Boolean): scala.Unit = js.native
  def Cell(Row: scala.Double, Column: scala.Double): Cell = js.native
  def MergeBorders(): scala.Unit = js.native
  def ScaleProportionally(scale: scala.Double): scala.Unit = js.native
}

