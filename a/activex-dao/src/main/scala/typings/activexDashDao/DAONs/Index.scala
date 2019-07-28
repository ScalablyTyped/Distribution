package typings.activexDashDao.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DAO.Index")
@js.native
class Index protected () extends js.Object {
  var Clustered: Boolean = js.native
  var `DAO.Index_typekey`: Index = js.native
  val DistinctCount: Double = js.native
  @JSName("Fields")
  var Fields_Original: Fields = js.native
  val Foreign: Boolean = js.native
  var IgnoreNulls: Boolean = js.native
  var Name: String = js.native
  var Primary: Boolean = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Required: Boolean = js.native
  var Unique: Boolean = js.native
  def CreateField(): Field = js.native
  def CreateField(Name: String): Field = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

