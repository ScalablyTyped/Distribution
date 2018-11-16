package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.AccessProperty")
@js.native
class AccessProperty protected () extends js.Object {
  var `Access._AccessProperty_typekey`: AccessProperty = js.native
  val Application: Application = js.native
  val Category: scala.Double = js.native
  val Inherited: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: activexDashDaoLib.DAONs.Properties = js.native
  var Type: scala.Double = js.native
  var Value: js.Any = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Properties(Item: java.lang.String): activexDashDaoLib.DAONs.Property = js.native
  def Properties(Item: scala.Double): activexDashDaoLib.DAONs.Property = js.native
}

