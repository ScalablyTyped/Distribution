package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A name that is valid for a specified locale.
  * @see com.sun.star.sheet.XCompatibilityNames
  */
trait LocalizedName extends js.Object {
  /** The locale for which this name is valid. */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** The name itself. */
  var Name: java.lang.String
}

object LocalizedName {
  @scala.inline
  def apply(Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, Name: java.lang.String): LocalizedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[LocalizedName]
  }
}

