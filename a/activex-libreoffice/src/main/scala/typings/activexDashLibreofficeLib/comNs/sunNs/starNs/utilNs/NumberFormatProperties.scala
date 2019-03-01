package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains properties specifying the behavior of a {@link NumberFormatter} .
  * @see NumberFormatter
  */
trait NumberFormatProperties extends js.Object {
  /** contains a comment regarding the number format for display to the user. */
  var Comment: java.lang.String
  /** contains the format string of the number format. */
  var FormatString: java.lang.String
  /** contains the locale of the number format. */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * contains the type of the number format.
    * @see NumberFormat
    */
  var Type: scala.Double
}

object NumberFormatProperties {
  @scala.inline
  def apply(
    Comment: java.lang.String,
    FormatString: java.lang.String,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Type: scala.Double
  ): NumberFormatProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Comment")(Comment)
    __obj.updateDynamic("FormatString")(FormatString)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[NumberFormatProperties]
  }
}

