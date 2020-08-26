package typings.activexDao.DAO

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  val AllPermissions: Double = js.native
  val Container: String = js.native
  @JSName("DAO.Document_typekey")
  var DAODotDocument_typekey: Document = js.native
  val DateCreated: VarDate = js.native
  val LastUpdated: VarDate = js.native
  val Name: String = js.native
  var Owner: String = js.native
  var Permissions: Double = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var UserName: String = js.native
  def CreateProperty(): Property = js.native
  def CreateProperty(
    Name: js.UndefOr[scala.Nothing],
    Type: js.UndefOr[scala.Nothing],
    Value: js.UndefOr[scala.Nothing],
    DDL: Boolean
  ): Property = js.native
  def CreateProperty(Name: js.UndefOr[scala.Nothing], Type: js.UndefOr[scala.Nothing], Value: js.Any): Property = js.native
  def CreateProperty(Name: js.UndefOr[scala.Nothing], Type: js.UndefOr[scala.Nothing], Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: js.UndefOr[scala.Nothing], Type: DataTypeEnum): Property = js.native
  def CreateProperty(
    Name: js.UndefOr[scala.Nothing],
    Type: DataTypeEnum,
    Value: js.UndefOr[scala.Nothing],
    DDL: Boolean
  ): Property = js.native
  def CreateProperty(Name: js.UndefOr[scala.Nothing], Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: js.UndefOr[scala.Nothing], Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String): Property = js.native
  def CreateProperty(Name: String, Type: js.UndefOr[scala.Nothing], Value: js.UndefOr[scala.Nothing], DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: js.UndefOr[scala.Nothing], Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: js.UndefOr[scala.Nothing], Value: js.Any, DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.UndefOr[scala.Nothing], DDL: Boolean): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any): Property = js.native
  def CreateProperty(Name: String, Type: DataTypeEnum, Value: js.Any, DDL: Boolean): Property = js.native
  def Properties(Item: String): Property = js.native
  def Properties(Item: Double): Property = js.native
}

