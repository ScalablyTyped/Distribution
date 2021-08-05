package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutFormat extends StObject {
  
  var Accent: MsoTriState
  
  var Angle: MsoCalloutAngleType
  
  val Application: js.Any
  
  var AutoAttach: MsoTriState
  
  val AutoLength: MsoTriState
  
  def AutomaticLength(): Unit
  
  var Border: MsoTriState
  
  val Creator: Double
  
  def CustomDrop(Drop: Double): Unit
  
  def CustomLength(Length: Double): Unit
  
  val Drop: Double
  
  val DropType: MsoCalloutDropType
  
  var Gap: Double
  
  val Length: Double
  
  /* private */ @JSName("Office.CalloutFormat_typekey")
  var OfficeDotCalloutFormat_typekey: CalloutFormat
  
  val Parent: js.Any
  
  def PresetDrop(DropType: MsoCalloutDropType): Unit
  
  var Type: MsoCalloutType
}
object CalloutFormat {
  
  inline def apply(
    Accent: MsoTriState,
    Angle: MsoCalloutAngleType,
    Application: js.Any,
    AutoAttach: MsoTriState,
    AutoLength: MsoTriState,
    AutomaticLength: () => Unit,
    Border: MsoTriState,
    Creator: Double,
    CustomDrop: Double => Unit,
    CustomLength: Double => Unit,
    Drop: Double,
    DropType: MsoCalloutDropType,
    Gap: Double,
    Length: Double,
    OfficeDotCalloutFormat_typekey: CalloutFormat,
    Parent: js.Any,
    PresetDrop: MsoCalloutDropType => Unit,
    Type: MsoCalloutType
  ): CalloutFormat = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Angle = Angle.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoAttach = AutoAttach.asInstanceOf[js.Any], AutoLength = AutoLength.asInstanceOf[js.Any], AutomaticLength = js.Any.fromFunction0(AutomaticLength), Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomDrop = js.Any.fromFunction1(CustomDrop), CustomLength = js.Any.fromFunction1(CustomLength), Drop = Drop.asInstanceOf[js.Any], DropType = DropType.asInstanceOf[js.Any], Gap = Gap.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetDrop = js.Any.fromFunction1(PresetDrop), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CalloutFormat_typekey")(OfficeDotCalloutFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutFormat]
  }
  
  extension [Self <: CalloutFormat](x: Self) {
    
    inline def setAccent(value: MsoTriState): Self = StObject.set(x, "Accent", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: MsoCalloutAngleType): Self = StObject.set(x, "Angle", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoAttach(value: MsoTriState): Self = StObject.set(x, "AutoAttach", value.asInstanceOf[js.Any])
    
    inline def setAutoLength(value: MsoTriState): Self = StObject.set(x, "AutoLength", value.asInstanceOf[js.Any])
    
    inline def setAutomaticLength(value: () => Unit): Self = StObject.set(x, "AutomaticLength", js.Any.fromFunction0(value))
    
    inline def setBorder(value: MsoTriState): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCustomDrop(value: Double => Unit): Self = StObject.set(x, "CustomDrop", js.Any.fromFunction1(value))
    
    inline def setCustomLength(value: Double => Unit): Self = StObject.set(x, "CustomLength", js.Any.fromFunction1(value))
    
    inline def setDrop(value: Double): Self = StObject.set(x, "Drop", value.asInstanceOf[js.Any])
    
    inline def setDropType(value: MsoCalloutDropType): Self = StObject.set(x, "DropType", value.asInstanceOf[js.Any])
    
    inline def setGap(value: Double): Self = StObject.set(x, "Gap", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotCalloutFormat_typekey(value: CalloutFormat): Self = StObject.set(x, "Office.CalloutFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPresetDrop(value: MsoCalloutDropType => Unit): Self = StObject.set(x, "PresetDrop", js.Any.fromFunction1(value))
    
    inline def setType(value: MsoCalloutType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
