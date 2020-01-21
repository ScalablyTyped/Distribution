package typings.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Parameter")
@js.native
class Parameter protected () extends js.Object {
  @JSName("DAO.Parameter_typekey")
  var DAODotParameter_typekey: Parameter = js.native
  var Direction: Double = js.native
  val Name: String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Type: Double = js.native
  var Value: js.Any = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

