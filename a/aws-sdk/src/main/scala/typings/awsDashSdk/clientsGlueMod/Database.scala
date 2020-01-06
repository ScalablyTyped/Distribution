package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  /**
    * Creates a set of default permissions on the table for principals. 
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * The time at which the metadata database was created in the catalog.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the database.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The location of the database (for example, an HDFS path).
    */
  var LocationUri: js.UndefOr[URI] = js.native
  /**
    * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString = js.native
  /**
    * These key-value pairs define parameters and properties of the database.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
}

object Database {
  @scala.inline
  def apply(
    Name: NameString,
    CreateTableDefaultPermissions: PrincipalPermissionsList = null,
    CreateTime: Timestamp = null,
    Description: DescriptionString = null,
    LocationUri: URI = null,
    Parameters: ParametersMap = null
  ): Database = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (CreateTableDefaultPermissions != null) __obj.updateDynamic("CreateTableDefaultPermissions")(CreateTableDefaultPermissions.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
}

