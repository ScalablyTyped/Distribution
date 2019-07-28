package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticsearchVersionStatus extends js.Object {
  /**
    *  Specifies the Elasticsearch version for the specified Elasticsearch domain.
    */
  var Options: ElasticsearchVersionString
  /**
    *  Specifies the status of the Elasticsearch version options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}

object ElasticsearchVersionStatus {
  @scala.inline
  def apply(Options: ElasticsearchVersionString, Status: OptionStatus): ElasticsearchVersionStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[ElasticsearchVersionStatus]
  }
}

