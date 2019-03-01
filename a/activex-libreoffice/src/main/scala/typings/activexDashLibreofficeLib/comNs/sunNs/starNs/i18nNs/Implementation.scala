package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link Implementation} name details returned in a sequence by {@link XLocaleData.getCollatorImplementations()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Implementation extends js.Object {
  var isDefault: scala.Boolean
  var unoID: java.lang.String
}

object Implementation {
  @scala.inline
  def apply(isDefault: scala.Boolean, unoID: java.lang.String): Implementation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("unoID")(unoID)
    __obj.asInstanceOf[Implementation]
  }
}

