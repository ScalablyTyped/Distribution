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
  @scala.inline
  implicit class ElasticsearchDataSourceConfigOps[Self <: ElasticsearchDataSourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
  }
  
}

