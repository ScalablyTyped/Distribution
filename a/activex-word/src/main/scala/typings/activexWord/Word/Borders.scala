package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`9999999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Borders extends StObject {
  
  var AlwaysInFront: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ApplyPageBordersToAllSections(): Unit = js.native
  
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
  
  def Item(Index: WdBorderType): Border = js.native
  
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
  
  @scala.inline
  implicit class BordersMutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysInFront(value: Boolean): Self = StObject.set(x, "AlwaysInFront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyPageBordersToAllSections(value: () => Unit): Self = StObject.set(x, "ApplyPageBordersToAllSections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFrom(value: WdBorderDistanceFrom): Self = StObject.set(x, "DistanceFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromBottom(value: Double): Self = StObject.set(x, "DistanceFromBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromLeft(value: Double): Self = StObject.set(x, "DistanceFromLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromRight(value: Double): Self = StObject.set(x, "DistanceFromRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromTop(value: Double): Self = StObject.set(x, "DistanceFromTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean | `9999999` | WdLineStyle): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableFirstPageInSection(value: Boolean): Self = StObject.set(x, "EnableFirstPageInSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOtherPagesInSection(value: Boolean): Self = StObject.set(x, "EnableOtherPagesInSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHorizontal(value: Boolean): Self = StObject.set(x, "HasHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasVertical(value: Boolean): Self = StObject.set(x, "HasVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideColor(value: WdColor): Self = StObject.set(x, "InsideColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideColorIndex(value: WdColorIndex): Self = StObject.set(x, "InsideColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideLineStyle(value: WdLineStyle): Self = StObject.set(x, "InsideLineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideLineWidth(value: WdLineWidth): Self = StObject.set(x, "InsideLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdBorderType => Border): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoinBorders(value: Boolean): Self = StObject.set(x, "JoinBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideColor(value: WdColor): Self = StObject.set(x, "OutsideColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideColorIndex(value: WdColorIndex): Self = StObject.set(x, "OutsideColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideLineStyle(value: WdLineStyle): Self = StObject.set(x, "OutsideLineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideLineWidth(value: WdLineWidth): Self = StObject.set(x, "OutsideLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundFooter(value: Boolean): Self = StObject.set(x, "SurroundFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundHeader(value: Boolean): Self = StObject.set(x, "SurroundHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotBorders_typekey(value: Borders): Self = StObject.set(x, "Word.Borders_typekey", value.asInstanceOf[js.Any])
  }
}
