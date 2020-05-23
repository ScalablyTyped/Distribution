package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`9999999`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borders extends js.Object {
  var AlwaysInFront: Boolean
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  var DistanceFrom: WdBorderDistanceFrom
  var DistanceFromBottom: Double
  var DistanceFromLeft: Double
  var DistanceFromRight: Double
  var DistanceFromTop: Double
  var Enable: Boolean | `9999999` | WdLineStyle
  var EnableFirstPageInSection: Boolean
  var EnableOtherPagesInSection: Boolean
  val HasHorizontal: Boolean
  val HasVertical: Boolean
  var InsideColor: WdColor
  var InsideColorIndex: WdColorIndex
  var InsideLineStyle: WdLineStyle
  var InsideLineWidth: WdLineWidth
  var JoinBorders: Boolean
  var OutsideColor: WdColor
  var OutsideColorIndex: WdColorIndex
  var OutsideLineStyle: WdLineStyle
  var OutsideLineWidth: WdLineWidth
  val Parent: js.Any
  var Shadow: Boolean
  var SurroundFooter: Boolean
  var SurroundHeader: Boolean
  @JSName("Word.Borders_typekey")
  var WordDotBorders_typekey: Borders
  def ApplyPageBordersToAllSections(): Unit
  def Item(Index: WdBorderType): Border
}

object Borders {
  @scala.inline
  def apply(
    AlwaysInFront: Boolean,
    Application: Application,
    ApplyPageBordersToAllSections: () => Unit,
    Count: Double,
    Creator: Double,
    DistanceFrom: WdBorderDistanceFrom,
    DistanceFromBottom: Double,
    DistanceFromLeft: Double,
    DistanceFromRight: Double,
    DistanceFromTop: Double,
    Enable: Boolean | `9999999` | WdLineStyle,
    EnableFirstPageInSection: Boolean,
    EnableOtherPagesInSection: Boolean,
    HasHorizontal: Boolean,
    HasVertical: Boolean,
    InsideColor: WdColor,
    InsideColorIndex: WdColorIndex,
    InsideLineStyle: WdLineStyle,
    InsideLineWidth: WdLineWidth,
    Item: WdBorderType => Border,
    JoinBorders: Boolean,
    OutsideColor: WdColor,
    OutsideColorIndex: WdColorIndex,
    OutsideLineStyle: WdLineStyle,
    OutsideLineWidth: WdLineWidth,
    Parent: js.Any,
    Shadow: Boolean,
    SurroundFooter: Boolean,
    SurroundHeader: Boolean,
    WordDotBorders_typekey: Borders
  ): Borders = {
    val __obj = js.Dynamic.literal(AlwaysInFront = AlwaysInFront.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ApplyPageBordersToAllSections = js.Any.fromFunction0(ApplyPageBordersToAllSections), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceFrom = DistanceFrom.asInstanceOf[js.Any], DistanceFromBottom = DistanceFromBottom.asInstanceOf[js.Any], DistanceFromLeft = DistanceFromLeft.asInstanceOf[js.Any], DistanceFromRight = DistanceFromRight.asInstanceOf[js.Any], DistanceFromTop = DistanceFromTop.asInstanceOf[js.Any], Enable = Enable.asInstanceOf[js.Any], EnableFirstPageInSection = EnableFirstPageInSection.asInstanceOf[js.Any], EnableOtherPagesInSection = EnableOtherPagesInSection.asInstanceOf[js.Any], HasHorizontal = HasHorizontal.asInstanceOf[js.Any], HasVertical = HasVertical.asInstanceOf[js.Any], InsideColor = InsideColor.asInstanceOf[js.Any], InsideColorIndex = InsideColorIndex.asInstanceOf[js.Any], InsideLineStyle = InsideLineStyle.asInstanceOf[js.Any], InsideLineWidth = InsideLineWidth.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), JoinBorders = JoinBorders.asInstanceOf[js.Any], OutsideColor = OutsideColor.asInstanceOf[js.Any], OutsideColorIndex = OutsideColorIndex.asInstanceOf[js.Any], OutsideLineStyle = OutsideLineStyle.asInstanceOf[js.Any], OutsideLineWidth = OutsideLineWidth.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SurroundFooter = SurroundFooter.asInstanceOf[js.Any], SurroundHeader = SurroundHeader.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Borders_typekey")(WordDotBorders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
}

