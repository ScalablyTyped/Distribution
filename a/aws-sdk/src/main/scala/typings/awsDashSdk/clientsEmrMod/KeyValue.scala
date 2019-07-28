package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  /**
    * The unique identifier of a key value pair.
    */
  var Key: js.UndefOr[XmlString] = js.undefined
  /**
    * The value part of the identified key.
    */
  var Value: js.UndefOr[XmlString] = js.undefined
}

object KeyValue {
  @scala.inline
  def apply(Key: XmlString = null, Value: XmlString = null): KeyValue = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[KeyValue]
  }
}

