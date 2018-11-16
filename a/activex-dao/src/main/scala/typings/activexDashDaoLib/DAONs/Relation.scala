package typings
package activexDashDaoLib.DAONs

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
  var ForeignTable: java.lang.String = js.native
  var Name: java.lang.String = js.native
  var PartialReplica: scala.Boolean = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Table: java.lang.String = js.native
  def CreateField(): Field = js.native
  def CreateField(Name: java.lang.String): Field = js.native
  def Fields(Item: java.lang.String): Field = js.native
  def Fields(Item: scala.Double): Field = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
}

