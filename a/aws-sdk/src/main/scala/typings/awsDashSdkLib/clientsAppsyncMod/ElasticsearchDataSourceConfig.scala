package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchDataSourceConfig extends js.Object {
  /**
    * The AWS Region.
    */
  var awsRegion: String
  /**
    * The endpoint.
    */
  var endpoint: String
}

object ElasticsearchDataSourceConfig {
  @scala.inline
  def apply(awsRegion: String, endpoint: String): ElasticsearchDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, endpoint = endpoint)
  
    __obj.asInstanceOf[ElasticsearchDataSourceConfig]
  }
}

