package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBParameterGroupMessage extends js.Object {
  /**
    * The name of the DB parameter group. Constraints:   Must be the name of an existing DB parameter group   You can't delete a default DB parameter group   Cannot be associated with any DB instances  
    */
  var DBParameterGroupName: String
}

object DeleteDBParameterGroupMessage {
  @scala.inline
  def apply(DBParameterGroupName: String): DeleteDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName)
  
    __obj.asInstanceOf[DeleteDBParameterGroupMessage]
  }
}

