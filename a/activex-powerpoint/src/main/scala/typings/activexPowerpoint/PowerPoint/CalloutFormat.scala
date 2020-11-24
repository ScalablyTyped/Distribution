package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoCalloutAngleType
import typings.activexOffice.Office.MsoCalloutDropType
import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutFormat extends js.Object {
  
  var Accent: MsoTriState = js.native
  
  var Angle: MsoCalloutAngleType = js.native
  
  val Application: js.Any = js.native
  
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
  
  @JSName("PowerPoint.CalloutFormat_typekey")
  var PowerPointDotCalloutFormat_typekey: CalloutFormat = js.native
  
  def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
  
  var Type: MsoCalloutType = js.native
}
object CalloutFormat {
  
  @scala.inline
  def apply(
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
    Parent: js.Any,
    PowerPointDotCalloutFormat_typekey: CalloutFormat,
    PresetDrop: MsoCalloutDropType => Unit,
    Type: MsoCalloutType
  ): CalloutFormat = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Angle = Angle.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoAttach = AutoAttach.asInstanceOf[js.Any], AutoLength = AutoLength.asInstanceOf[js.Any], AutomaticLength = js.Any.fromFunction0(AutomaticLength), Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomDrop = js.Any.fromFunction1(CustomDrop), CustomLength = js.Any.fromFunction1(CustomLength), Drop = Drop.asInstanceOf[js.Any], DropType = DropType.asInstanceOf[js.Any], Gap = Gap.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetDrop = js.Any.fromFunction1(PresetDrop), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CalloutFormat_typekey")(PowerPointDotCalloutFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutFormat]
  }
  
  @scala.inline
  implicit class CalloutFormatOps[Self <: CalloutFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccent(value: MsoTriState): Self = this.set("Accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: MsoCalloutAngleType): Self = this.set("Angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAttach(value: MsoTriState): Self = this.set("AutoAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLength(value: MsoTriState): Self = this.set("AutoLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticLength(value: () => Unit): Self = this.set("AutomaticLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBorder(value: MsoTriState): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDrop(value: Double => Unit): Self = this.set("CustomDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomLength(value: Double => Unit): Self = this.set("CustomLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDrop(value: Double): Self = this.set("Drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropType(value: MsoCalloutDropType): Self = this.set("DropType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGap(value: Double): Self = this.set("Gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotCalloutFormat_typekey(value: CalloutFormat): Self = this.set("PowerPoint.CalloutFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetDrop(value: MsoCalloutDropType => Unit): Self = this.set("PresetDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: MsoCalloutType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
