package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagOptionInput extends js.Object {
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId
}

object DescribeTagOptionInput {
  @scala.inline
  def apply(Id: TagOptionId): DescribeTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DescribeTagOptionInput]
  }
}

