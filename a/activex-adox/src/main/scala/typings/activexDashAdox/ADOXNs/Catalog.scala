package typings.activexDashAdox.ADOXNs

import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdox.activexDashAdoxNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Catalog")
@js.native
class Catalog protected () extends js.Object {
  var `ADOX.Catalog_typekey`: Catalog = js.native
  /** Can be set to a Connection object or a string. Returns the active Connection object, or `null` */
  var ActiveConnection: String | Connection | Null = js.native
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
  def Create(ConnectString: String): Unit = js.native
  def GetObjectOwner(ObjectName: String, ObjectType: ObjectTypeEnum): String = js.native
  /**
    * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification
    */
  @JSName("GetObjectOwner")
  def GetObjectOwner_1(ObjectName: String, ObjectType: `-1`, ObjectTypeId: js.Any): String = js.native
  def Groups(Item: String): Group = js.native
  def Groups(Item: Double): Group = js.native
  def Procedures(Item: String): Procedure = js.native
  def Procedures(Item: Double): Procedure = js.native
  def SetObjectOwner(ObjectName: String, ObjectType: ObjectTypeEnum, UserName: String): Unit = js.native
  /**
    * @param UserName Specifies the name of the **User** or **Group** to own the object
    * @param ObjectTypeId Specifies the GUID for a provider object type that is not defined by the OLE DB specification
    */
  @JSName("SetObjectOwner")
  def SetObjectOwner_1(ObjectName: String, ObjectType: `-1`, UserName: String, ObjectTypeId: js.Any): Unit = js.native
  def Tables(Item: String): Table = js.native
  def Tables(Item: Double): Table = js.native
  def Users(Item: String): User = js.native
  def Users(Item: Double): User = js.native
  def Views(Item: String): View = js.native
  def Views(Item: Double): View = js.native
}

