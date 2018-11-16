package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Design")
@js.native
class Design protected () extends js.Object {
  val Application: Application = js.native
  val HasTitleMaster: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Index: scala.Double = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Design_typekey`: Design = js.native
  var Preserved: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val SlideMaster: Master = js.native
  val TitleMaster: Master = js.native
  def AddTitleMaster(): Master = js.native
  def Delete(): scala.Unit = js.native
  def MoveTo(toPos: scala.Double): scala.Unit = js.native
}

