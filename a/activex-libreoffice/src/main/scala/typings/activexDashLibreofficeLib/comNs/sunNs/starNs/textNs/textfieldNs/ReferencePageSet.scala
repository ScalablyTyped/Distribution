package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field that inserts additional page numbers.
  * @see com.sun.star.text.TextField
  * @see com.sun.star.text.textfield.ReferencePageGet
  */
trait ReferencePageSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** determines whether the {@link ReferencePageGet} text fields are displayed or not. */
  var NameOn: scala.Boolean
  /** determines an offset value to change the displayed value of a {@link ReferencePageGet} text field. */
  var Offset: scala.Double
}

