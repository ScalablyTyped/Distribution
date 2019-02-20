package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of an author text field.
  * @see com.sun.star.text.TextField
  */
trait Author
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /**
    * this is the display format for this field
    * @see com.sun.star.text.AuthorDisplayFormat
    */
  var AuthorFormat: scala.Double
  /** the is the content of this field */
  var Content: java.lang.String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** determines whether the full name of the author is displayed rather than the initials. */
  var FullName: scala.Boolean
  /** If this flag is set to false the author will be overridden by the current author each time the document is saved. */
  var IsFixed: scala.Boolean
}

