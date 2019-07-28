package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagOptionInput extends js.Object {
  /**
    * The TagOption key.
    */
  var Key: TagOptionKey
  /**
    * The TagOption value.
    */
  var Value: TagOptionValue
}

object CreateTagOptionInput {
  @scala.inline
  def apply(Key: TagOptionKey, Value: TagOptionValue): CreateTagOptionInput = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[CreateTagOptionInput]
  }
}

