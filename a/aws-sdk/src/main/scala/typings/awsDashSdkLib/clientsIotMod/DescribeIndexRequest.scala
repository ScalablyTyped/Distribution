package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIndexRequest extends js.Object {
  /**
    * The index name.
    */
  var indexName: IndexName
}

object DescribeIndexRequest {
  @scala.inline
  def apply(indexName: IndexName): DescribeIndexRequest = {
    val __obj = js.Dynamic.literal(indexName = indexName)
  
    __obj.asInstanceOf[DescribeIndexRequest]
  }
}

