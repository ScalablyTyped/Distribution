package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains properties specifying the behavior of a {@link NumberFormatter} .
  * @see NumberFormatter
  */
trait NumberFormatProperties extends js.Object {
  /** contains a comment regarding the number format for display to the user. */
  var Comment: String
  /** contains the format string of the number format. */
  var FormatString: String
  /** contains the locale of the number format. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  /**
    * contains the type of the number format.
    * @see NumberFormat
    */
  var Type: Double
}

object NumberFormatProperties {
  @scala.inline
  def apply(Comment: String, FormatString: String, Locale: Locale, Type: Double): NumberFormatProperties = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], FormatString = FormatString.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatProperties]
  }
}

