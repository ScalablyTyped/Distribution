package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a pair assembled from a name and a value. */
trait NamedValue extends js.Object {
  /** specifies the name part of the pair */
  var Name: String
  /** specifies the value part of the pair. */
  var Value: js.Any
}

object NamedValue {
  @scala.inline
  def apply(Name: String, Value: js.Any): NamedValue = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[NamedValue]
  }
}

