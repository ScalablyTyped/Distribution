package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Player")
@js.native
class Player protected () extends js.Object {
  val Application: Application = js.native
  var CurrentPosition: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Player_typekey`: Player = js.native
  val State: PpPlayerState = js.native
  def GoToNextBookmark(): scala.Unit = js.native
  def GoToPreviousBookmark(): scala.Unit = js.native
  def Pause(): scala.Unit = js.native
  def Play(): scala.Unit = js.native
  def Stop(): scala.Unit = js.native
}

