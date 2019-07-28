package typings.activexDashDao.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Relation")
@js.native
class Relation protected () extends js.Object {
  var Attributes: RelationAttributeEnum = js.native
  var `DAO.Relation_typekey`: Relation = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  var ForeignTable: String = js.native
  var Name: String = js.native
  var PartialReplica: Boolean = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Table: String = js.native
  def CreateField(): Field = js.native
  def CreateField(Name: String): Field = js.native
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

