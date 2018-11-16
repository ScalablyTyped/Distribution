package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Index")
@js.native
class Index protected () extends js.Object {
  var Clustered: scala.Boolean = js.native
  var `DAO.Index_typekey`: Index = js.native
  val DistinctCount: scala.Double = js.native
  @JSName("Fields")
  var Fields_Original: Fields = js.native
  val Foreign: scala.Boolean = js.native
  var IgnoreNulls: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var Primary: scala.Boolean = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Required: scala.Boolean = js.native
  var Unique: scala.Boolean = js.native
  def CreateField(): Field = js.native
  def CreateField(Name: java.lang.String): Field = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: java.lang.String): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: java.lang.String, Type: DataTypeEnum, Value: js.Any, DDL: scala.Boolean): Property = js.native
  def Fields(Item: java.lang.String): Field = js.native
  def Fields(Item: scala.Double): Field = js.native
  def Properties(Item: java.lang.String): Property = js.native
  def Properties(Item: scala.Double): Property = js.native
}

