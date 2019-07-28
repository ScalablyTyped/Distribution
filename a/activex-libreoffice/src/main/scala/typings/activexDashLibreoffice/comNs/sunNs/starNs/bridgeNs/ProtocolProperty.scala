package typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs

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
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[ProtocolProperty]
  }
}

