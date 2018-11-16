package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.KeyBinding")
@js.native
class KeyBinding protected () extends js.Object {
  val Application: Application = js.native
  val Command: java.lang.String = js.native
  val CommandParameter: java.lang.String = js.native
  val Context: js.Any = js.native
  val Creator: scala.Double = js.native
  val KeyCategory: WdKeyCategory = js.native
  val KeyCode: scala.Double = js.native
  val KeyCode2: scala.Double = js.native
  val KeyString: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Protected: scala.Boolean = js.native
  var `Word.KeyBinding_typekey`: KeyBinding = js.native
  def Clear(): scala.Unit = js.native
  def Disable(): scala.Unit = js.native
  def Execute(): scala.Unit = js.native
  def Rebind(KeyCategory: WdKeyCategory, Command: java.lang.String): scala.Unit = js.native
  def Rebind(KeyCategory: WdKeyCategory, Command: java.lang.String, CommandParameter: js.Any): scala.Unit = js.native
}

