package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
trait FastAttribute extends js.Object {
  /** the token corresponding to the attribute */
  var Token: scala.Double
  /** the attribute value */
  var Value: java.lang.String
}

object FastAttribute {
  @scala.inline
  def apply(Token: scala.Double, Value: java.lang.String): FastAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Token")(Token)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[FastAttribute]
  }
}

