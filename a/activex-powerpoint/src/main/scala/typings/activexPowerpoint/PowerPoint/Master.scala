package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoBackgroundStyleIndex
import typings.activexOffice.Office.OfficeTheme
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Master extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def ApplyTheme(themeName: String): Unit
  
  val Background: ShapeRange
  
  var BackgroundStyle: MsoBackgroundStyleIndex
  
  var ColorScheme: typings.activexPowerpoint.PowerPoint.ColorScheme
  
  val CustomLayouts: typings.activexPowerpoint.PowerPoint.CustomLayouts
  
  val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData
  
  def Delete(): Unit
  
  val Design: typings.activexPowerpoint.PowerPoint.Design
  
  val HeadersFooters: typings.activexPowerpoint.PowerPoint.HeadersFooters
  
  val Height: Double
  
  val Hyperlinks: typings.activexPowerpoint.PowerPoint.Hyperlinks
  
  var Name: String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Master_typekey")
  var PowerPointDotMaster_typekey: Master
  
  def Scripts(Index: Any): Script
  @JSName("Scripts")
  val Scripts_Original: Scripts
  
  val Shapes: typings.activexPowerpoint.PowerPoint.Shapes
  
  val SlideShowTransition: typings.activexPowerpoint.PowerPoint.SlideShowTransition
  
  val TextStyles: typings.activexPowerpoint.PowerPoint.TextStyles
  
  val Theme: OfficeTheme
  
  val TimeLine: typings.activexPowerpoint.PowerPoint.TimeLine
  
  val Width: Double
}
object Master {
  
  inline def apply(
    Application: Application,
    ApplyTheme: String => Unit,
    Background: ShapeRange,
    BackgroundStyle: MsoBackgroundStyleIndex,
    ColorScheme: ColorScheme,
    CustomLayouts: CustomLayouts,
    CustomerData: CustomerData,
    Delete: () => Unit,
    Design: Design,
    HeadersFooters: HeadersFooters,
    Height: Double,
    Hyperlinks: Hyperlinks,
    Name: String,
    Parent: Any,
    PowerPointDotMaster_typekey: Master,
    Scripts: Scripts,
    Shapes: Shapes,
    SlideShowTransition: SlideShowTransition,
    TextStyles: TextStyles,
    Theme: OfficeTheme,
    TimeLine: TimeLine,
    Width: Double
  ): Master = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ApplyTheme = js.Any.fromFunction1(ApplyTheme), Background = Background.asInstanceOf[js.Any], BackgroundStyle = BackgroundStyle.asInstanceOf[js.Any], ColorScheme = ColorScheme.asInstanceOf[js.Any], CustomLayouts = CustomLayouts.asInstanceOf[js.Any], CustomerData = CustomerData.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Design = Design.asInstanceOf[js.Any], HeadersFooters = HeadersFooters.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Hyperlinks = Hyperlinks.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Scripts = Scripts.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any], SlideShowTransition = SlideShowTransition.asInstanceOf[js.Any], TextStyles = TextStyles.asInstanceOf[js.Any], Theme = Theme.asInstanceOf[js.Any], TimeLine = TimeLine.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Master_typekey")(PowerPointDotMaster_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Master]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Master] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplyTheme(value: String => Unit): Self = StObject.set(x, "ApplyTheme", js.Any.fromFunction1(value))
    
    inline def setBackground(value: ShapeRange): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundStyle(value: MsoBackgroundStyleIndex): Self = StObject.set(x, "BackgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "ColorScheme", value.asInstanceOf[js.Any])
    
    inline def setCustomLayouts(value: CustomLayouts): Self = StObject.set(x, "CustomLayouts", value.asInstanceOf[js.Any])
    
    inline def setCustomerData(value: CustomerData): Self = StObject.set(x, "CustomerData", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDesign(value: Design): Self = StObject.set(x, "Design", value.asInstanceOf[js.Any])
    
    inline def setHeadersFooters(value: HeadersFooters): Self = StObject.set(x, "HeadersFooters", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHyperlinks(value: Hyperlinks): Self = StObject.set(x, "Hyperlinks", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotMaster_typekey(value: Master): Self = StObject.set(x, "PowerPoint.Master_typekey", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: Scripts): Self = StObject.set(x, "Scripts", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: Shapes): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
    
    inline def setSlideShowTransition(value: SlideShowTransition): Self = StObject.set(x, "SlideShowTransition", value.asInstanceOf[js.Any])
    
    inline def setTextStyles(value: TextStyles): Self = StObject.set(x, "TextStyles", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: OfficeTheme): Self = StObject.set(x, "Theme", value.asInstanceOf[js.Any])
    
    inline def setTimeLine(value: TimeLine): Self = StObject.set(x, "TimeLine", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
