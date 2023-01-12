package typings.activexWord.Word

import typings.activexWord.activexWordInts.`9999999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borders extends StObject {
  
  var AlwaysInFront: Boolean
  
  val Application: typings.activexWord.Word.Application
  
  def ApplyPageBordersToAllSections(): Unit
  
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
  
  def Item(Index: WdBorderType): Border
  
  var JoinBorders: Boolean
  
  var OutsideColor: WdColor
  
  var OutsideColorIndex: WdColorIndex
  
  var OutsideLineStyle: WdLineStyle
  
  var OutsideLineWidth: WdLineWidth
  
  val Parent: Any
  
  var Shadow: Boolean
  
  var SurroundFooter: Boolean
  
  var SurroundHeader: Boolean
  
  /* private */ @JSName("Word.Borders_typekey")
  var WordDotBorders_typekey: Borders
}
object Borders {
  
  inline def apply(
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
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
    
    inline def setAlwaysInFront(value: Boolean): Self = StObject.set(x, "AlwaysInFront", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplyPageBordersToAllSections(value: () => Unit): Self = StObject.set(x, "ApplyPageBordersToAllSections", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDistanceFrom(value: WdBorderDistanceFrom): Self = StObject.set(x, "DistanceFrom", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromBottom(value: Double): Self = StObject.set(x, "DistanceFromBottom", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromLeft(value: Double): Self = StObject.set(x, "DistanceFromLeft", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromRight(value: Double): Self = StObject.set(x, "DistanceFromRight", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromTop(value: Double): Self = StObject.set(x, "DistanceFromTop", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Boolean | `9999999` | WdLineStyle): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    inline def setEnableFirstPageInSection(value: Boolean): Self = StObject.set(x, "EnableFirstPageInSection", value.asInstanceOf[js.Any])
    
    inline def setEnableOtherPagesInSection(value: Boolean): Self = StObject.set(x, "EnableOtherPagesInSection", value.asInstanceOf[js.Any])
    
    inline def setHasHorizontal(value: Boolean): Self = StObject.set(x, "HasHorizontal", value.asInstanceOf[js.Any])
    
    inline def setHasVertical(value: Boolean): Self = StObject.set(x, "HasVertical", value.asInstanceOf[js.Any])
    
    inline def setInsideColor(value: WdColor): Self = StObject.set(x, "InsideColor", value.asInstanceOf[js.Any])
    
    inline def setInsideColorIndex(value: WdColorIndex): Self = StObject.set(x, "InsideColorIndex", value.asInstanceOf[js.Any])
    
    inline def setInsideLineStyle(value: WdLineStyle): Self = StObject.set(x, "InsideLineStyle", value.asInstanceOf[js.Any])
    
    inline def setInsideLineWidth(value: WdLineWidth): Self = StObject.set(x, "InsideLineWidth", value.asInstanceOf[js.Any])
    
    inline def setItem(value: WdBorderType => Border): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setJoinBorders(value: Boolean): Self = StObject.set(x, "JoinBorders", value.asInstanceOf[js.Any])
    
    inline def setOutsideColor(value: WdColor): Self = StObject.set(x, "OutsideColor", value.asInstanceOf[js.Any])
    
    inline def setOutsideColorIndex(value: WdColorIndex): Self = StObject.set(x, "OutsideColorIndex", value.asInstanceOf[js.Any])
    
    inline def setOutsideLineStyle(value: WdLineStyle): Self = StObject.set(x, "OutsideLineStyle", value.asInstanceOf[js.Any])
    
    inline def setOutsideLineWidth(value: WdLineWidth): Self = StObject.set(x, "OutsideLineWidth", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSurroundFooter(value: Boolean): Self = StObject.set(x, "SurroundFooter", value.asInstanceOf[js.Any])
    
    inline def setSurroundHeader(value: Boolean): Self = StObject.set(x, "SurroundHeader", value.asInstanceOf[js.Any])
    
    inline def setWordDotBorders_typekey(value: Borders): Self = StObject.set(x, "Word.Borders_typekey", value.asInstanceOf[js.Any])
  }
}
