package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ProtectedViewWindows")
@js.native
class ProtectedViewWindows protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.ProtectedViewWindows_typekey`: ProtectedViewWindows = js.native
  def Item(Index: scala.Double): ProtectedViewWindow = js.native
  /**
    * @param string [ReadPassword='']
    * @param Office.MsoTriState [OpenAndRepair=0]
    */
  def Open(FileName: java.lang.String): ProtectedViewWindow = js.native
  def Open(FileName: java.lang.String, ReadPassword: java.lang.String): ProtectedViewWindow = js.native
  def Open(
    FileName: java.lang.String,
    ReadPassword: java.lang.String,
    OpenAndRepair: activexDashOfficeLib.OfficeNs.MsoTriState
  ): ProtectedViewWindow = js.native
}

