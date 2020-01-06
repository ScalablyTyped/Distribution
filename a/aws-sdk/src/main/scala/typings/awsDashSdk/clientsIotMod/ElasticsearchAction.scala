package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchAction extends js.Object {
  /**
    * The endpoint of your Elasticsearch domain.
    */
  var endpoint: ElasticsearchEndpoint = js.native
  /**
    * The unique identifier for the document you are storing.
    */
  var id: ElasticsearchId = js.native
  /**
    * The Elasticsearch index where you want to store your data.
    */
  var index: ElasticsearchIndex = js.native
  /**
    * The IAM role ARN that has access to Elasticsearch.
    */
  var roleArn: AwsArn = js.native
  /**
    * The type of document you are storing.
    */
  var `type`: ElasticsearchType = js.native
}

object ElasticsearchAction {
  @scala.inline
  def apply(
    endpoint: ElasticsearchEndpoint,
    id: ElasticsearchId,
    index: ElasticsearchIndex,
    roleArn: AwsArn,
    `type`: ElasticsearchType
  ): ElasticsearchAction = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchAction]
  }
}

