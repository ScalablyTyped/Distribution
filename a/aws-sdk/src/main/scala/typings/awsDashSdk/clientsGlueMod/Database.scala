package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  /**
    * The time at which the metadata database was created in the catalog.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Description of the database.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The location of the database (for example, an HDFS path).
    */
  var LocationUri: js.UndefOr[URI] = js.undefined
  /**
    * Name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString
  /**
    * These key-value pairs define parameters and properties of the database.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
}

object Database {
  @scala.inline
  def apply(
    Name: NameString,
    CreateTime: Timestamp = null,
    Description: DescriptionString = null,
    LocationUri: URI = null,
    Parameters: ParametersMap = null
  ): Database = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[Database]
  }
}

