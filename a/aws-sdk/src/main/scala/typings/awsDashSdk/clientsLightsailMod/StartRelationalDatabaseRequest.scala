package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to start.
    */
  var relationalDatabaseName: ResourceName
}

object StartRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): StartRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
  
    __obj.asInstanceOf[StartRelationalDatabaseRequest]
  }
}

