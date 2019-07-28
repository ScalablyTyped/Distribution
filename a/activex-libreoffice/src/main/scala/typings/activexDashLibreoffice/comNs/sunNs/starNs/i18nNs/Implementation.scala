package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link Implementation} name details returned in a sequence by {@link XLocaleData.getCollatorImplementations()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Implementation extends js.Object {
  var isDefault: Boolean
  var unoID: String
}

object Implementation {
  @scala.inline
  def apply(isDefault: Boolean, unoID: String): Implementation = {
    val __obj = js.Dynamic.literal(isDefault = isDefault, unoID = unoID)
  
    __obj.asInstanceOf[Implementation]
  }
}

