package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIndexRequest extends js.Object {
  /**
    * The name of the index to describe.
    */
  var Id: IndexId = js.native
}

object DescribeIndexRequest {
  @scala.inline
  def apply(Id: IndexId): DescribeIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeIndexRequest]
  }
}

