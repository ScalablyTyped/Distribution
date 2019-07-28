package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseRequest extends js.Object {
  /**
    * The name of the database that you are looking up.
    */
  var relationalDatabaseName: ResourceName
}

object GetRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
  
    __obj.asInstanceOf[GetRelationalDatabaseRequest]
  }
}

