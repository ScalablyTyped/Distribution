package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideShowWindow extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: MsoTriState = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var Height: Double = js.native
  
  val IsFullScreen: MsoTriState = js.native
  
  var Left: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.SlideShowWindow_typekey")
  var PowerPointDotSlideShowWindow_typekey: SlideShowWindow = js.native
  
  val Presentation: typings.activexPowerpoint.PowerPoint.Presentation = js.native
  
  var Top: Double = js.native
  
  val View: SlideShowView = js.native
  
  var Width: Double = js.native
}
object SlideShowWindow {
  
  @scala.inline
  def apply(
    Activate: () => Unit,
    Active: MsoTriState,
    Application: Application,
    Height: Double,
    IsFullScreen: MsoTriState,
    Left: Double,
    Parent: js.Any,
    PowerPointDotSlideShowWindow_typekey: SlideShowWindow,
    Presentation: Presentation,
    Top: Double,
    View: SlideShowView,
    Width: Double
  ): SlideShowWindow = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFullScreen = IsFullScreen.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Presentation = Presentation.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowWindow_typekey")(PowerPointDotSlideShowWindow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowWindow]
  }
  
  @scala.inline
  implicit class SlideShowWindowMutableBuilder[Self <: SlideShowWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActive(value: MsoTriState): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFullScreen(value: MsoTriState): Self = StObject.set(x, "IsFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSlideShowWindow_typekey(value: SlideShowWindow): Self = StObject.set(x, "PowerPoint.SlideShowWindow_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentation(value: Presentation): Self = StObject.set(x, "Presentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: SlideShowView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
