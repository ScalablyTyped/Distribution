package typings.activexWord.Word

import typings.activexOffice.Office.MsoCalloutAngleType
import typings.activexOffice.Office.MsoCalloutDropType
import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutFormat extends StObject {
  
  var Accent: MsoTriState = js.native
  
  var Angle: MsoCalloutAngleType = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoAttach: MsoTriState = js.native
  
  val AutoLength: MsoTriState = js.native
  
  def AutomaticLength(): Unit = js.native
  
  var Border: MsoTriState = js.native
  
  val Creator: Double = js.native
  
  def CustomDrop(Drop: Double): Unit = js.native
  
  def CustomLength(Length: Double): Unit = js.native
  
  val Drop: Double = js.native
  
  val DropType: MsoCalloutDropType = js.native
  
  var Gap: Double = js.native
  
  val Length: Double = js.native
  
  val Parent: js.Any = js.native
  
  def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
  
  var Type: MsoCalloutType = js.native
  
  @JSName("Word.CalloutFormat_typekey")
  var WordDotCalloutFormat_typekey: CalloutFormat = js.native
}
object CalloutFormat {
  
  @scala.inline
  def apply(
    Accent: MsoTriState,
    Angle: MsoCalloutAngleType,
    Application: Application,
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
    Parent: js.Any,
    PresetDrop: MsoCalloutDropType => Unit,
    Type: MsoCalloutType,
    WordDotCalloutFormat_typekey: CalloutFormat
  ): CalloutFormat = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Angle = Angle.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoAttach = AutoAttach.asInstanceOf[js.Any], AutoLength = AutoLength.asInstanceOf[js.Any], AutomaticLength = js.Any.fromFunction0(AutomaticLength), Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomDrop = js.Any.fromFunction1(CustomDrop), CustomLength = js.Any.fromFunction1(CustomLength), Drop = Drop.asInstanceOf[js.Any], DropType = DropType.asInstanceOf[js.Any], Gap = Gap.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetDrop = js.Any.fromFunction1(PresetDrop), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CalloutFormat_typekey")(WordDotCalloutFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutFormat]
  }
  
  @scala.inline
  implicit class CalloutFormatMutableBuilder[Self <: CalloutFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccent(value: MsoTriState): Self = StObject.set(x, "Accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: MsoCalloutAngleType): Self = StObject.set(x, "Angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAttach(value: MsoTriState): Self = StObject.set(x, "AutoAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLength(value: MsoTriState): Self = StObject.set(x, "AutoLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticLength(value: () => Unit): Self = StObject.set(x, "AutomaticLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBorder(value: MsoTriState): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDrop(value: Double => Unit): Self = StObject.set(x, "CustomDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomLength(value: Double => Unit): Self = StObject.set(x, "CustomLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrop(value: Double): Self = StObject.set(x, "Drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropType(value: MsoCalloutDropType): Self = StObject.set(x, "DropType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "Gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetDrop(value: MsoCalloutDropType => Unit): Self = StObject.set(x, "PresetDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: MsoCalloutType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCalloutFormat_typekey(value: CalloutFormat): Self = StObject.set(x, "Word.CalloutFormat_typekey", value.asInstanceOf[js.Any])
  }
}
