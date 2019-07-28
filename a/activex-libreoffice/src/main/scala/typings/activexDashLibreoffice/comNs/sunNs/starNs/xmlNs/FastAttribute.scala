package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
trait FastAttribute extends js.Object {
  /** the token corresponding to the attribute */
  var Token: Double
  /** the attribute value */
  var Value: String
}

object FastAttribute {
  @scala.inline
  def apply(Token: Double, Value: String): FastAttribute = {
    val __obj = js.Dynamic.literal(Token = Token, Value = Value)
  
    __obj.asInstanceOf[FastAttribute]
  }
}

