package typings.activexWord.Word

import typings.activexOffice.Office.MsoCalloutAngleType
import typings.activexOffice.Office.MsoCalloutDropType
import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalloutFormat extends js.Object {
  var Accent: MsoTriState
  var Angle: MsoCalloutAngleType
  val Application: typings.activexWord.Word.Application
  var AutoAttach: MsoTriState
  val AutoLength: MsoTriState
  var Border: MsoTriState
  val Creator: Double
  val Drop: Double
  val DropType: MsoCalloutDropType
  var Gap: Double
  val Length: Double
  val Parent: js.Any
  var Type: MsoCalloutType
  @JSName("Word.CalloutFormat_typekey")
  var WordDotCalloutFormat_typekey: CalloutFormat
  def AutomaticLength(): Unit
  def CustomDrop(Drop: Double): Unit
  def CustomLength(Length: Double): Unit
  def PresetDrop(DropType: MsoCalloutDropType): Unit
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
}

