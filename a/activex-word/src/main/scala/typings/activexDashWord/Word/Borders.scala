package typings.activexDashWord.Word

import typings.activexDashWord.activexDashWordNumbers.`9999999`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Borders")
@js.native
class Borders protected () extends js.Object {
  var AlwaysInFront: Boolean = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var DistanceFrom: WdBorderDistanceFrom = js.native
  var DistanceFromBottom: Double = js.native
  var DistanceFromLeft: Double = js.native
  var DistanceFromRight: Double = js.native
  var DistanceFromTop: Double = js.native
  var Enable: Boolean | `9999999` | WdLineStyle = js.native
  var EnableFirstPageInSection: Boolean = js.native
  var EnableOtherPagesInSection: Boolean = js.native
  val HasHorizontal: Boolean = js.native
  val HasVertical: Boolean = js.native
  var InsideColor: WdColor = js.native
  var InsideColorIndex: WdColorIndex = js.native
  var InsideLineStyle: WdLineStyle = js.native
  var InsideLineWidth: WdLineWidth = js.native
  var JoinBorders: Boolean = js.native
  var OutsideColor: WdColor = js.native
  var OutsideColorIndex: WdColorIndex = js.native
  var OutsideLineStyle: WdLineStyle = js.native
  var OutsideLineWidth: WdLineWidth = js.native
  val Parent: js.Any = js.native
  var Shadow: Boolean = js.native
  var SurroundFooter: Boolean = js.native
  var SurroundHeader: Boolean = js.native
  @JSName("Word.Borders_typekey")
  var WordDotBorders_typekey: Borders = js.native
  def ApplyPageBordersToAllSections(): Unit = js.native
  def Item(Index: WdBorderType): Border = js.native
}

