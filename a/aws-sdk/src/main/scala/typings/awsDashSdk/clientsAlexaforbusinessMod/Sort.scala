package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sort extends js.Object {
  /**
    * The sort key of a sort object.
    */
  var Key: SortKey
  /**
    * The sort value of a sort object.
    */
  var Value: SortValue
}

object Sort {
  @scala.inline
  def apply(Key: SortKey, Value: SortValue): Sort = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sort]
  }
}

