package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AddIns")
@js.native
class AddIns protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.AddIns_typekey`: AddIns = js.native
  def Add(FileName: java.lang.String): AddIn = js.native
  def Add(FileName: java.lang.String, Install: js.Any): AddIn = js.native
  def Item(Index: js.Any): AddIn = js.native
  def Unload(RemoveFromList: scala.Boolean): scala.Unit = js.native
}

