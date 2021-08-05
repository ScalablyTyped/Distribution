package typings.activexDao.DAO

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  val AllPermissions: Double = js.native
  
  val Container: String = js.native
  
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
  
  /* private */ @JSName("DAO.Document_typekey")
  var DAODotDocument_typekey: Document = js.native
  
  val DateCreated: VarDate = js.native
  
  val LastUpdated: VarDate = js.native
  
  val Name: String = js.native
  
  var Owner: String = js.native
  
  var Permissions: Double = js.native
  
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var UserName: String = js.native
}
