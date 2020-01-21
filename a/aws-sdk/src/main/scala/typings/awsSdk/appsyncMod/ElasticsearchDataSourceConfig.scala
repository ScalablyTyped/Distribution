package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDataSourceConfig extends js.Object {
  /**
    * The AWS Region.
    */
  var awsRegion: String = js.native
  /**
    * The endpoint.
    */
  var endpoint: String = js.native
}

object ElasticsearchDataSourceConfig {
  @scala.inline
  def apply(awsRegion: String, endpoint: String): ElasticsearchDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElasticsearchDataSourceConfig]
  }
}

