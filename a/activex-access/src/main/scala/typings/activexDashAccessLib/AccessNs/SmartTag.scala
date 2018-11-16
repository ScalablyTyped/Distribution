package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.SmartTag")
@js.native
class SmartTag protected () extends js.Object {
  var `Access.SmartTag_typekey`: SmartTag = js.native
  val Application: Application = js.native
  val IsMissing: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: SmartTagProperties = js.native
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions = js.native
  val XML: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Properties(Index: java.lang.String): SmartTagProperty = js.native
  def Properties(Index: scala.Double): SmartTagProperty = js.native
  def SmartTagActions(Index: java.lang.String): SmartTagAction = js.native
  def SmartTagActions(Index: scala.Double): SmartTagAction = js.native
}

