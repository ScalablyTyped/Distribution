package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInput extends js.Object {
  /**
    * Creates a set of default permissions on the table for principals. 
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined
  /**
    * A description of the database.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The location of the database (for example, an HDFS path). 
    */
  var LocationUri: js.UndefOr[URI] = js.undefined
  /**
    * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString
  /**
    * These key-value pairs define parameters and properties of the database. These key-value pairs define parameters and properties of the database.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
}

object DatabaseInput {
  @scala.inline
  def apply(
    Name: NameString,
    CreateTableDefaultPermissions: PrincipalPermissionsList = null,
    Description: DescriptionString = null,
    LocationUri: URI = null,
    Parameters: ParametersMap = null
  ): DatabaseInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (CreateTableDefaultPermissions != null) __obj.updateDynamic("CreateTableDefaultPermissions")(CreateTableDefaultPermissions)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[DatabaseInput]
  }
}

