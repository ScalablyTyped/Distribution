package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseInput extends js.Object {
  /**
    * Description of the database
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
    * Thes key-value pairs define parameters and properties of the database.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
}

object DatabaseInput {
  @scala.inline
  def apply(
    Name: NameString,
    Description: DescriptionString = null,
    LocationUri: URI = null,
    Parameters: ParametersMap = null
  ): DatabaseInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[DatabaseInput]
  }
}

