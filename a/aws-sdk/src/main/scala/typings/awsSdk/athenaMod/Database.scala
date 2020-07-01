package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  /**
    * An optional description of the database.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The name of the database.
    */
  var Name: NameString = js.native
  /**
    * A set of custom key/value pairs.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
}

object Database {
  @scala.inline
  def apply(Name: NameString, Description: DescriptionString = null, Parameters: ParametersMap = null): Database = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Database]
  }
}

