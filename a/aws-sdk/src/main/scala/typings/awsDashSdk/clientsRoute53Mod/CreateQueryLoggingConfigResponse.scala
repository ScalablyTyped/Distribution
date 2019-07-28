package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueryLoggingConfigResponse extends js.Object {
  /**
    * The unique URL representing the new query logging configuration.
    */
  var Location: ResourceURI
  /**
    * A complex type that contains the ID for a query logging configuration, the ID of the hosted zone that you want to log queries for, and the ARN for the log group that you want Amazon Route 53 to send query logs to.
    */
  var QueryLoggingConfig: typings.awsDashSdk.clientsRoute53Mod.QueryLoggingConfig
}

object CreateQueryLoggingConfigResponse {
  @scala.inline
  def apply(Location: ResourceURI, QueryLoggingConfig: QueryLoggingConfig): CreateQueryLoggingConfigResponse = {
    val __obj = js.Dynamic.literal(Location = Location, QueryLoggingConfig = QueryLoggingConfig)
  
    __obj.asInstanceOf[CreateQueryLoggingConfigResponse]
  }
}

