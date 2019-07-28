package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A name that is valid for a specified locale.
  * @see com.sun.star.sheet.XCompatibilityNames
  */
trait LocalizedName extends js.Object {
  /** The locale for which this name is valid. */
  var Locale: typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** The name itself. */
  var Name: String
}

object LocalizedName {
  @scala.inline
  def apply(Locale: Locale, Name: String): LocalizedName = {
    val __obj = js.Dynamic.literal(Locale = Locale, Name = Name)
  
    __obj.asInstanceOf[LocalizedName]
  }
}

