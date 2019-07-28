package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The tag key.
    */
  var Key: String
  /**
    * The tag value.
    */
  var Value: String
}

object Tag {
  @scala.inline
  def apply(Key: String, Value: String): Tag = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[Tag]
  }
}

