package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchAction extends js.Object {
  /**
    * The endpoint of your Elasticsearch domain.
    */
  var endpoint: ElasticsearchEndpoint
  /**
    * The unique identifier for the document you are storing.
    */
  var id: ElasticsearchId
  /**
    * The Elasticsearch index where you want to store your data.
    */
  var index: ElasticsearchIndex
  /**
    * The IAM role ARN that has access to Elasticsearch.
    */
  var roleArn: AwsArn
  /**
    * The type of document you are storing.
    */
  var `type`: ElasticsearchType
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
    val __obj = js.Dynamic.literal(endpoint = endpoint, id = id, index = index, roleArn = roleArn)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ElasticsearchAction]
  }
}

