package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A name that is valid for a specified locale.
  * @see com.sun.star.sheet.XCompatibilityNames
  */
trait LocalizedName extends js.Object {
  /** The locale for which this name is valid. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  /** The name itself. */
  var Name: String
}

object LocalizedName {
  @scala.inline
  def apply(Locale: Locale, Name: String): LocalizedName = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedName]
  }
}

