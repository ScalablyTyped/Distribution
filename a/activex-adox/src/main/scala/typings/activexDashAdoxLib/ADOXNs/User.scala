package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.User")
@js.native
class User protected () extends js.Object {
  var `ADOX.User_typekey`: User = js.native
  @JSName("Groups")
  val Groups_Original: Groups = js.native
  var Name: java.lang.String = js.native
  var ParentCatalog: Catalog = js.native
  @JSName("Properties")
  val Properties_Original: activexDashAdodbLib.ADODBNs.Properties = js.native
  def ChangePassword(OldPassword: java.lang.String, NewPassword: java.lang.String): scala.Unit = js.native
  def GetPermissions(Name: java.lang.String, ObjectType: ObjectTypeEnum): RightsEnum = js.native
  /**
           * @param Name Specifies the name of the object for which to set permissions. Pass `null` if you want to get the permissions for the object container.
           * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
           */
  def GetPermissions(Name: java.lang.String, ObjectType: ObjectTypeEnum, ObjectTypeId: js.Any): RightsEnum = js.native
  def GetPermissions(Name: scala.Null, ObjectType: ObjectTypeEnum): RightsEnum = js.native
  /**
           * @param Name Specifies the name of the object for which to set permissions. Pass `null` if you want to get the permissions for the object container.
           * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
           */
  def GetPermissions(Name: scala.Null, ObjectType: ObjectTypeEnum, ObjectTypeId: js.Any): RightsEnum = js.native
  def Groups(Item: java.lang.String): Group = js.native
  def Groups(Item: scala.Double): Group = js.native
  def Properties(Index: java.lang.String): activexDashAdodbLib.ADODBNs.Property = js.native
  def Properties(Index: scala.Double): activexDashAdodbLib.ADODBNs.Property = js.native
  def SetPermissions(Name: java.lang.String, ObjectType: ObjectTypeEnum, Action: ActionEnum, Rights: RightsEnum): scala.Unit = js.native
  def SetPermissions(
    Name: java.lang.String,
    ObjectType: ObjectTypeEnum,
    Action: ActionEnum,
    Rights: RightsEnum,
    Inherit: InheritTypeEnum
  ): scala.Unit = js.native
  /**
           * @param Rights A bitmask of one or more of the **RightsEnum** constants, that indicates the rights to set.
           * @param Inherit [Inherit=0]
           * @param ObjectTypeId Specifies the GUID for a provider object type not defined by the OLE DB specification.
           */
  def SetPermissions(
    Name: java.lang.String,
    ObjectType: ObjectTypeEnum,
    Action: ActionEnum,
    Rights: RightsEnum,
    Inherit: InheritTypeEnum,
    ObjectTypeId: js.Any
  ): scala.Unit = js.native
}

