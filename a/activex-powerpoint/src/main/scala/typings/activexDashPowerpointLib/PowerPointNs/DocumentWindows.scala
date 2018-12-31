package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.DocumentWindows")
@js.native
class DocumentWindows protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.DocumentWindows_typekey`: DocumentWindows = js.native
  /** @param PowerPoint.PpArrangeStyle [arrangeStyle=1] */
  def Arrange(): scala.Unit = js.native
  def Arrange(arrangeStyle: PpArrangeStyle): scala.Unit = js.native
  def Item(Index: scala.Double): DocumentWindow = js.native
}

