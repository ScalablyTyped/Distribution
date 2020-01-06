package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagOptionInput extends js.Object {
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId = js.native
}

object DescribeTagOptionInput {
  @scala.inline
  def apply(Id: TagOptionId): DescribeTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTagOptionInput]
  }
}

