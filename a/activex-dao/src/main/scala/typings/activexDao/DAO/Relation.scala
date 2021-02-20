package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relation extends StObject {
  
  var Attributes: RelationAttributeEnum = js.native
  
  def CreateField(): Field = js.native
  def CreateField(Name: String): Field = js.native
  
  @JSName("DAO.Relation_typekey")
  var DAODotRelation_typekey: Relation = js.native
  
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  @JSName("Fields")
  val Fields_Original: Fields = js.native
  
  var ForeignTable: String = js.native
  
  var Name: String = js.native
  
  var PartialReplica: Boolean = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var Table: String = js.native
}
