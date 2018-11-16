package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Container")
@js.native
class Container protected () extends js.Object {
  val AllPermissions: scala.Double = js.native
  var `DAO.Container_typekey`: Container = js.native
  @JSName("Documents")
  val Documents_Original: Documents = js.native
  var Inherit: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  var Owner: java.lang.String = js.native
  var Permissions: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var UserName: java.lang.String = js.native
  def Documents(Item: java.lang.String): Document = js.native
  def Documents(Item: scala.Double): Document = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
}

