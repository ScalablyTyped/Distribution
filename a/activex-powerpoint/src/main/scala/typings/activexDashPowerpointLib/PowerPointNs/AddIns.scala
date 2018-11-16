package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AddIns")
@js.native
class AddIns protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.AddIns_typekey`: AddIns = js.native
  def Add(FileName: java.lang.String): AddIn = js.native
  def Item(Index: js.Any): AddIn = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
}

