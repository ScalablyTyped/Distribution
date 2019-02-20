package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a database text field which is used as mail merge field.
  * @see com.sun.star.text.TextField
  */
trait Database
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.DependentTextField {
  /** contains the database content that was merged in the last database merge action. Initially it contains the column name in parenthesis (<>). */
  var Content: java.lang.String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** determines whether the number format is number display format is read from the database settings. */
  var DataBaseFormat: scala.Boolean
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: scala.Double
}

