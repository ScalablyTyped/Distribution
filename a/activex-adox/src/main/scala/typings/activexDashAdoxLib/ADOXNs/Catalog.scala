package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Catalog")
@js.native
class Catalog protected () extends js.Object {
  var `ADOX.Catalog_typekey`: Catalog = js.native
  /** Can be set to a Connection object or a string. Returns the active Connection object, or `null` */
  var ActiveConnection: java.lang.String | activexDashAdodbLib.ADODBNs.Connection | scala.Null = js.native
  @JSName("Groups")
  val Groups_Original: Groups = js.native
  @JSName("Procedures")
  val Procedures_Original: Procedures = js.native
  @JSName("Tables")
  val Tables_Original: Tables = js.native
  @JSName("Users")
  val Users_Original: Users = js.native
  @JSName("Views")
  val Views_Original: Views = js.native
  /**
           * The **Create** method creates and opens a new ADO Connection to the data source specified in _ConnectString_. If successful, the new **Connection** object is assigned to the **ActiveConnection** property.
           *
           * An error will occur if the provider does not support creating new catalogs.
           *
           * @param ConnectString Connection string
           */
  def Create(ConnectString: java.lang.String): scala.Unit = js.native
  def GetObjectOwner(ObjectName: java.lang.String, ObjectType: ObjectTypeEnum): java.lang.String = js.native
  /**
           * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification
           */
  def GetObjectOwner(ObjectName: java.lang.String, ObjectType: ObjectTypeEnum, ObjectTypeId: js.Any): java.lang.String = js.native
  def Groups(Item: java.lang.String): Group = js.native
  def Groups(Item: scala.Double): Group = js.native
  def Procedures(Item: java.lang.String): Procedure = js.native
  def Procedures(Item: scala.Double): Procedure = js.native
  def SetObjectOwner(ObjectName: java.lang.String, ObjectType: ObjectTypeEnum, UserName: java.lang.String): scala.Unit = js.native
  /**
           * @param UserName Specifies the name of the **User** or **Group** to own the object
           * @param ObjectTypeId Specifies the GUID for a provider object type that is not defined by the OLE DB specification
           */
  def SetObjectOwner(
    ObjectName: java.lang.String,
    ObjectType: ObjectTypeEnum,
    UserName: java.lang.String,
    ObjectTypeId: js.Any
  ): scala.Unit = js.native
  def Tables(Item: java.lang.String): Table = js.native
  def Tables(Item: scala.Double): Table = js.native
  def Users(Item: java.lang.String): User = js.native
  def Users(Item: scala.Double): User = js.native
  def Views(Item: java.lang.String): View = js.native
  def Views(Item: scala.Double): View = js.native
}

