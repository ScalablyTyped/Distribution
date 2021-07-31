package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoThemeColorSchemeIndex
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.ThemeColor
import typings.activexOffice.Office.ThemeColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayout extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Background: ShapeRange
  
  def Copy(): Unit
  
  val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  val Design: typings.activexPowerpoint.PowerPoint.Design
  
  var DisplayMasterShapes: MsoTriState
  
  def Duplicate(): CustomLayout
  
  var FollowMasterBackground: MsoTriState
  
  val HeadersFooters: typings.activexPowerpoint.PowerPoint.HeadersFooters
  
  val Height: Double
  
  val Hyperlinks: typings.activexPowerpoint.PowerPoint.Hyperlinks
  
  val Index: Double
  
  var MatchingName: String
  
  def MoveTo(toPos: Double): Unit
  
  var Name: String
  
  val Parent: js.Any
  
  @JSName("PowerPoint.CustomLayout_typekey")
  var PowerPointDotCustomLayout_typekey: CustomLayout
  
  var Preserved: MsoTriState
  
  def Select(): Unit
  
  val Shapes: typings.activexPowerpoint.PowerPoint.Shapes
  
  val SlideShowTransition: typings.activexPowerpoint.PowerPoint.SlideShowTransition
  
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme
  
  val TimeLine: typings.activexPowerpoint.PowerPoint.TimeLine
  
  val Width: Double
}
object CustomLayout {
  
  @scala.inline
  def apply(
    Application: Application,
    Background: ShapeRange,
    Copy: () => Unit,
    CustomerData: CustomerData,
    Cut: () => Unit,
    Delete: () => Unit,
    Design: Design,
    DisplayMasterShapes: MsoTriState,
    Duplicate: () => CustomLayout,
    FollowMasterBackground: MsoTriState,
    HeadersFooters: HeadersFooters,
    Height: Double,
    Hyperlinks: Hyperlinks,
    Index: Double,
    MatchingName: String,
    MoveTo: Double => Unit,
    Name: String,
    Parent: js.Any,
    PowerPointDotCustomLayout_typekey: CustomLayout,
    Preserved: MsoTriState,
    Select: () => Unit,
    Shapes: Shapes,
    SlideShowTransition: SlideShowTransition,
    ThemeColorScheme: ThemeColorScheme,
    TimeLine: TimeLine,
    Width: Double
  ): CustomLayout = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), CustomerData = CustomerData.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Design = Design.asInstanceOf[js.Any], DisplayMasterShapes = DisplayMasterShapes.asInstanceOf[js.Any], Duplicate = js.Any.fromFunction0(Duplicate), FollowMasterBackground = FollowMasterBackground.asInstanceOf[js.Any], HeadersFooters = HeadersFooters.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hyperlinks = Hyperlinks.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MatchingName = MatchingName.asInstanceOf[js.Any], MoveTo = js.Any.fromFunction1(MoveTo), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Preserved = Preserved.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shapes = Shapes.asInstanceOf[js.Any], SlideShowTransition = SlideShowTransition.asInstanceOf[js.Any], ThemeColorScheme = ThemeColorScheme.asInstanceOf[js.Any], TimeLine = TimeLine.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CustomLayout_typekey")(PowerPointDotCustomLayout_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLayout]
  }
  
  @scala.inline
  implicit class CustomLayoutMutableBuilder[Self <: CustomLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: ShapeRange): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomerData(value: CustomerData): Self = StObject.set(x, "CustomerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDesign(value: Design): Self = StObject.set(x, "Design", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMasterShapes(value: MsoTriState): Self = StObject.set(x, "DisplayMasterShapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicate(value: () => CustomLayout): Self = StObject.set(x, "Duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFollowMasterBackground(value: MsoTriState): Self = StObject.set(x, "FollowMasterBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersFooters(value: HeadersFooters): Self = StObject.set(x, "HeadersFooters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinks(value: Hyperlinks): Self = StObject.set(x, "Hyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingName(value: String): Self = StObject.set(x, "MatchingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveTo(value: Double => Unit): Self = StObject.set(x, "MoveTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotCustomLayout_typekey(value: CustomLayout): Self = StObject.set(x, "PowerPoint.CustomLayout_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserved(value: MsoTriState): Self = StObject.set(x, "Preserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShapes(value: Shapes): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowTransition(value: SlideShowTransition): Self = StObject.set(x, "SlideShowTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorScheme(value: ThemeColorScheme): Self = StObject.set(x, "ThemeColorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLine(value: TimeLine): Self = StObject.set(x, "TimeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
