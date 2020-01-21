package typings.activexWord.Word

import typings.activexOffice.Office.MsoCalloutAngleType
import typings.activexOffice.Office.MsoCalloutDropType
import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CalloutFormat")
@js.native
class CalloutFormat protected () extends js.Object {
  var Accent: MsoTriState = js.native
  var Angle: MsoCalloutAngleType = js.native
  val Application: typings.activexWord.Word.Application = js.native
  var AutoAttach: MsoTriState = js.native
  val AutoLength: MsoTriState = js.native
  var Border: MsoTriState = js.native
  val Creator: Double = js.native
  val Drop: Double = js.native
  val DropType: MsoCalloutDropType = js.native
  var Gap: Double = js.native
  val Length: Double = js.native
  val Parent: js.Any = js.native
  var Type: MsoCalloutType = js.native
  @JSName("Word.CalloutFormat_typekey")
  var WordDotCalloutFormat_typekey: CalloutFormat = js.native
  def AutomaticLength(): Unit = js.native
  def CustomDrop(Drop: Double): Unit = js.native
  def CustomLength(Length: Double): Unit = js.native
  def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
}

