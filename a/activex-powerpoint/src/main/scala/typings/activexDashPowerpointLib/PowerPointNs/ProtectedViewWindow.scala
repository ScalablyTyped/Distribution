package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ProtectedViewWindow")
@js.native
class ProtectedViewWindow protected () extends js.Object {
  val Active: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Application: Application = js.native
  val Caption: java.lang.String = js.native
  var Height: scala.Double = js.native
  var Left: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.ProtectedViewWindow_typekey`: ProtectedViewWindow = js.native
  val Presentation: Presentation = js.native
  val SourceName: java.lang.String = js.native
  val SourcePath: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Width: scala.Double = js.native
  var WindowState: PpWindowState = js.native
  def Activate(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  /** @param string [ModifyPassword=''] */
  def Edit(): Presentation = js.native
  /** @param string [ModifyPassword=''] */
  def Edit(ModifyPassword: java.lang.String): Presentation = js.native
}

