package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRelationalDatabaseParametersRequest extends js.Object {
  /**
    * The database parameters to update.
    */
  var parameters: RelationalDatabaseParameterList
  /**
    * The name of your database for which to update parameters.
    */
  var relationalDatabaseName: ResourceName
}

object UpdateRelationalDatabaseParametersRequest {
  @scala.inline
  def apply(parameters: RelationalDatabaseParameterList, relationalDatabaseName: ResourceName): UpdateRelationalDatabaseParametersRequest = {
    val __obj = js.Dynamic.literal(parameters = parameters, relationalDatabaseName = relationalDatabaseName)
  
    __obj.asInstanceOf[UpdateRelationalDatabaseParametersRequest]
  }
}

