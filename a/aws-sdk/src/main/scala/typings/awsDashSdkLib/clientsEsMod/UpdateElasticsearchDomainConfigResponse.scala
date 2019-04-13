package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateElasticsearchDomainConfigResponse extends js.Object {
  /**
    * The status of the updated Elasticsearch domain. 
    */
  var DomainConfig: ElasticsearchDomainConfig
}

object UpdateElasticsearchDomainConfigResponse {
  @scala.inline
  def apply(DomainConfig: ElasticsearchDomainConfig): UpdateElasticsearchDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig)
  
    __obj.asInstanceOf[UpdateElasticsearchDomainConfigResponse]
  }
}

