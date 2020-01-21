package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sort extends js.Object {
  /**
    * The sort key of a sort object.
    */
  var Key: SortKey = js.native
  /**
    * The sort value of a sort object.
    */
  var Value: SortValue = js.native
}

object Sort {
  @scala.inline
  def apply(Key: SortKey, Value: SortValue): Sort = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sort]
  }
}

