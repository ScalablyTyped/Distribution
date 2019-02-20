package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs.docinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field that provides information about the duration the document has been edited.
  * @see com.sun.star.text.TextField
  */
trait EditTime
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** contains the date and time as double value. */
  var DateTimeValue: scala.Double
  /**
    * If this flag is set to false the author will be overridden by the current author each time the document is saved. If this flag is set to `FALSE` the
    * date or time is always displayed as the current date or time.
    * @since OOo 1.1.2
    */
  var IsFixed: scala.Boolean
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    */
  var IsFixedLanguage: scala.Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
}

