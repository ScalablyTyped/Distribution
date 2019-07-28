package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Design")
@js.native
class Design protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val HasTitleMaster: MsoTriState = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Design_typekey`: Design = js.native
  var Preserved: MsoTriState = js.native
  val SlideMaster: Master = js.native
  val TitleMaster: Master = js.native
  def AddTitleMaster(): Master = js.native
  def Delete(): Unit = js.native
  def MoveTo(toPos: Double): Unit = js.native
}

