package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueryLoggingConfigResponse extends js.Object {
  /**
    * A complex type that contains information about the query logging configuration that you specified in a GetQueryLoggingConfig request.
    */
  var QueryLoggingConfig: typings.awsDashSdk.clientsRoute53Mod.QueryLoggingConfig
}

object GetQueryLoggingConfigResponse {
  @scala.inline
  def apply(QueryLoggingConfig: QueryLoggingConfig): GetQueryLoggingConfigResponse = {
    val __obj = js.Dynamic.literal(QueryLoggingConfig = QueryLoggingConfig)
  
    __obj.asInstanceOf[GetQueryLoggingConfigResponse]
  }
}

