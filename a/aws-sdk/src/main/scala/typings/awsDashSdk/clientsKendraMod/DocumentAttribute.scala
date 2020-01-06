package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttribute extends js.Object {
  /**
    * The identifier for the attribute.
    */
  var Key: DocumentAttributeKey = js.native
  /**
    * The value of the attribute.
    */
  var Value: DocumentAttributeValue = js.native
}

object DocumentAttribute {
  @scala.inline
  def apply(Key: DocumentAttributeKey, Value: DocumentAttributeValue): DocumentAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentAttribute]
  }
}

