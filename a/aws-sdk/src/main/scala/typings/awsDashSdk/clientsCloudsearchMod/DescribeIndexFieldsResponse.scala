package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIndexFieldsResponse extends js.Object {
  /**
    * The index fields configured for the domain.
    */
  var IndexFields: IndexFieldStatusList
}

object DescribeIndexFieldsResponse {
  @scala.inline
  def apply(IndexFields: IndexFieldStatusList): DescribeIndexFieldsResponse = {
    val __obj = js.Dynamic.literal(IndexFields = IndexFields)
  
    __obj.asInstanceOf[DescribeIndexFieldsResponse]
  }
}

