package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseLogStreamsRequest extends js.Object {
  /**
    * The name of your database for which to get log streams.
    */
  var relationalDatabaseName: ResourceName
}

object GetRelationalDatabaseLogStreamsRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseLogStreamsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
  
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsRequest]
  }
}

