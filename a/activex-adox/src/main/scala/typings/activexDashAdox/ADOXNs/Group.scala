package typings.activexDashAdox.ADOXNs

import typings.activexDashAdodb.ADODBNs.Properties
import typings.activexDashAdodb.ADODBNs.Property
import typings.activexDashAdox.activexDashAdoxNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Group")
@js.native
class Group protected () extends js.Object {
  var `ADOX.Group_typekey`: Group = js.native
  var Name: String = js.native
  var ParentCatalog: Catalog = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  @JSName("Users")
  val Users_Original: Users = js.native
  def GetPermissions(Name: String, ObjectType: ObjectTypeEnum): RightsEnum = js.native
  def GetPermissions(Name: Null, ObjectType: ObjectTypeEnum): RightsEnum = js.native
  /**
    * @param Name Specifies the name of the object for which to set permissions. Pass `null` if you want to get the permissions for the object container.
    * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
    */
  @JSName("GetPermissions")
  def GetPermissions_1(Name: String, ObjectType: `-1`, ObjectTypeId: js.Any): RightsEnum = js.native
  @JSName("GetPermissions")
  def GetPermissions_1(Name: Null, ObjectType: `-1`, ObjectTypeId: js.Any): RightsEnum = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  def SetPermissions(Name: String, ObjectType: ObjectTypeEnum, Action: ActionEnum, Rights: RightsEnum): Unit = js.native
  def SetPermissions(
    Name: String,
    ObjectType: ObjectTypeEnum,
    Action: ActionEnum,
    Rights: RightsEnum,
    Inherit: InheritTypeEnum
  ): Unit = js.native
  /**
    * @param Rights A bitmask of one or more of the **RightsEnum** constants, that indicates the rights to set.
    * @param Inherit [Inherit=0]
    * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
    */
  @JSName("SetPermissions")
  def SetPermissions_1(
    Name: String,
    ObjectType: `-1`,
    Action: ActionEnum,
    Rights: RightsEnum,
    Inherit: InheritTypeEnum,
    ObjectTypeId: js.Any
  ): Unit = js.native
  def Users(Item: String): User = js.native
  def Users(Item: Double): User = js.native
}

