package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Borders")
@js.native
class Borders protected () extends js.Object {
  var AlwaysInFront: scala.Boolean = js.native
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DistanceFrom: WdBorderDistanceFrom = js.native
  var DistanceFromBottom: scala.Double = js.native
  var DistanceFromLeft: scala.Double = js.native
  var DistanceFromRight: scala.Double = js.native
  var DistanceFromTop: scala.Double = js.native
  var Enable: scala.Boolean | activexDashWordLib.activexDashWordLibNumbers.`9999999` | WdLineStyle = js.native
  var EnableFirstPageInSection: scala.Boolean = js.native
  var EnableOtherPagesInSection: scala.Boolean = js.native
  val HasHorizontal: scala.Boolean = js.native
  val HasVertical: scala.Boolean = js.native
  var InsideColor: WdColor = js.native
  var InsideColorIndex: WdColorIndex = js.native
  var InsideLineStyle: WdLineStyle = js.native
  var InsideLineWidth: WdLineWidth = js.native
  var JoinBorders: scala.Boolean = js.native
  var OutsideColor: WdColor = js.native
  var OutsideColorIndex: WdColorIndex = js.native
  var OutsideLineStyle: WdLineStyle = js.native
  var OutsideLineWidth: WdLineWidth = js.native
  val Parent: js.Any = js.native
  var Shadow: scala.Boolean = js.native
  var SurroundFooter: scala.Boolean = js.native
  var SurroundHeader: scala.Boolean = js.native
  var `Word.Borders_typekey`: Borders = js.native
  def ApplyPageBordersToAllSections(): scala.Unit = js.native
  def Item(Index: WdBorderType): Border = js.native
}

