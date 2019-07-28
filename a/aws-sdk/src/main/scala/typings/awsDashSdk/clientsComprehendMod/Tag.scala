package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The initial part of a key-value pair that forms a tag associated with a given resource. For instance, if you want to show which resources are used by which departments, you might use “Department” as the key portion of the pair, with multiple possible values such as “sales,” “legal,” and “administration.” 
    */
  var Key: TagKey
  /**
    *  The second part of a key-value pair that forms a tag associated with a given resource. For instance, if you want to show which resources are used by which departments, you might use “Department” as the initial (key) portion of the pair, with a value of “sales” to indicate the sales department. 
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}

object Tag {
  @scala.inline
  def apply(Key: TagKey, Value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Tag]
  }
}

