package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchSettings extends js.Object {
  /**
    * The endpoint for the Elasticsearch cluster.
    */
  var EndpointUri: String
  /**
    * The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The maximum percentage of records that can fail to be written before a full load operation stops. 
    */
  var FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The Amazon Resource Name (ARN) used by service to access the IAM role.
    */
  var ServiceAccessRoleArn: String
}

object ElasticsearchSettings {
  @scala.inline
  def apply(
    EndpointUri: String,
    ServiceAccessRoleArn: String,
    ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined,
    FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
  ): ElasticsearchSettings = {
    val __obj = js.Dynamic.literal(EndpointUri = EndpointUri, ServiceAccessRoleArn = ServiceAccessRoleArn)
    if (!js.isUndefined(ErrorRetryDuration)) __obj.updateDynamic("ErrorRetryDuration")(ErrorRetryDuration)
    if (!js.isUndefined(FullLoadErrorPercentage)) __obj.updateDynamic("FullLoadErrorPercentage")(FullLoadErrorPercentage)
    __obj.asInstanceOf[ElasticsearchSettings]
  }
}

