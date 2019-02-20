package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a date or time text field.
  * @see com.sun.star.text.TextField
  */
trait DateTime
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains an offset to the date or time value in minutes. */
  var Adjust: scala.Double
  /**
    * this is the display format for this field. Depending on {@link IsDate} , this is either a {@link com.sun.star.text.DateDisplayFormat} or {@link
    * com.sun.star.text.TimeDisplayFormat} .
    *
    * This property is deprecated and is here only for components that do not support a {@link com.sun.star.util.NumberFormatter} .
    * @deprecated Deprecated
    * @see com.sun.star.text.DateDisplayFormat
    * @see com.sun.star.text.TimeDisplayFormat
    */
  var DateTimeFormat: scala.Double
  /** the is the content of this field. */
  var DateTimeValue: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /** If this flag is set to `TRUE` this field represents a date with an optional time. If it is set to `FALSE` only the time is used here. */
  var IsDate: scala.Boolean
  /**
    * If this flag is set to `FALSE` the date or time is always displayed as the current date or time.
    * @since OOo 1.1.2
    */
  var IsFixed: scala.Boolean
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    */
  var IsFixedLanguage: scala.Boolean
  /**
    * this is the number format for this field
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
}

