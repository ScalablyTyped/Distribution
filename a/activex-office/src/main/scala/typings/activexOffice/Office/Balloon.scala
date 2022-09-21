package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Balloon extends StObject {
  
  var Animation: MsoAnimationType
  
  val Application: Any
  
  var BalloonType: MsoBalloonType
  
  var Button: MsoButtonSetType
  
  var Callback: String
  
  def Checkboxes(Index: Double): BalloonCheckbox
  @JSName("Checkboxes")
  val Checkboxes_Original: BalloonCheckboxes
  
  def Close(): Unit
  
  val Creator: Double
  
  var Heading: String
  
  var Icon: MsoIconType
  
  def Labels(Index: Double): BalloonLabel
  @JSName("Labels")
  val Labels_Original: BalloonLabels
  
  var Mode: MsoModeType
  
  val Name: String
  
  /* private */ @JSName("Office.Balloon_typekey")
  var OfficeDotBalloon_typekey: Balloon
  
  val Parent: Any
  
  var Private: Double
  
  def SetAvoidRectangle(Left: Double, Top: Double, Right: Double, Bottom: Double): Unit
  
  def Show(): MsoBalloonButtonType
  
  var Text: String
}
object Balloon {
  
  inline def apply(
    Animation: MsoAnimationType,
    Application: Any,
    BalloonType: MsoBalloonType,
    Button: MsoButtonSetType,
    Callback: String,
    Checkboxes: BalloonCheckboxes,
    Close: () => Unit,
    Creator: Double,
    Heading: String,
    Icon: MsoIconType,
    Labels: BalloonLabels,
    Mode: MsoModeType,
    Name: String,
    OfficeDotBalloon_typekey: Balloon,
    Parent: Any,
    Private: Double,
    SetAvoidRectangle: (Double, Double, Double, Double) => Unit,
    Show: () => MsoBalloonButtonType,
    Text: String
  ): Balloon = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BalloonType = BalloonType.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], Callback = Callback.asInstanceOf[js.Any], Checkboxes = Checkboxes.asInstanceOf[js.Any], Close = js.Any.fromFunction0(Close), Creator = Creator.asInstanceOf[js.Any], Heading = Heading.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Private = Private.asInstanceOf[js.Any], SetAvoidRectangle = js.Any.fromFunction4(SetAvoidRectangle), Show = js.Any.fromFunction0(Show), Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Balloon_typekey")(OfficeDotBalloon_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balloon]
  }
  
  extension [Self <: Balloon](x: Self) {
    
    inline def setAnimation(value: MsoAnimationType): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBalloonType(value: MsoBalloonType): Self = StObject.set(x, "BalloonType", value.asInstanceOf[js.Any])
    
    inline def setButton(value: MsoButtonSetType): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    inline def setCallback(value: String): Self = StObject.set(x, "Callback", value.asInstanceOf[js.Any])
    
    inline def setCheckboxes(value: BalloonCheckboxes): Self = StObject.set(x, "Checkboxes", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setHeading(value: String): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: MsoIconType): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: BalloonLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setMode(value: MsoModeType): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotBalloon_typekey(value: Balloon): Self = StObject.set(x, "Office.Balloon_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Double): Self = StObject.set(x, "Private", value.asInstanceOf[js.Any])
    
    inline def setSetAvoidRectangle(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "SetAvoidRectangle", js.Any.fromFunction4(value))
    
    inline def setShow(value: () => MsoBalloonButtonType): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
