package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataSourceRequest extends js.Object {
  /**
    * The unique identifier of the data source to describe.
    */
  var Id: DataSourceId = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsDashSdk.clientsKendraMod.IndexId = js.native
}

object DescribeDataSourceRequest {
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): DescribeDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDataSourceRequest]
  }
}

