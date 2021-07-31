package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends StObject {
  
  var Clustered: Boolean = js.native
  
  def CreateField(): Field = js.native
  def CreateField(Name: String): Field = js.native
  
  def CreateProperty(): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: js.Any): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: Unit, Value: Unit, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: Unit, Type: DataTypeEnum, Value: Unit, DDL: Boolean): Property = js.native
  
  @JSName("DAO.Index_typekey")
  var DAODotIndex_typekey: Index = js.native
  
  val DistinctCount: Double = js.native
  
  def Fields(Item: String): Field = js.native
  def Fields(Item: Double): Field = js.native
  @JSName("Fields")
  var Fields_Original: Fields = js.native
  
  val Foreign: Boolean = js.native
  
  var IgnoreNulls: Boolean = js.native
  
  var Name: String = js.native
  
  var Primary: Boolean = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var Required: Boolean = js.native
  
  var Unique: Boolean = js.native
}
