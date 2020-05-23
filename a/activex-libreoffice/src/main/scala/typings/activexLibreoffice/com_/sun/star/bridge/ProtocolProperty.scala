package typings.activexLibreoffice.com_.sun.star.bridge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** string/value pair */
trait ProtocolProperty extends js.Object {
  var Name: String
  var Value: js.Any
}

object ProtocolProperty {
  @scala.inline
  def apply(Name: String, Value: js.Any): ProtocolProperty = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolProperty]
  }
}

