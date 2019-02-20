package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text field that shows and element of the user data (name, address, phone, ...)
  * @see com.sun.star.text.TextField
  */
trait ExtendedUser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains the content. */
  var Content: java.lang.String
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: java.lang.String
  /** If this flag is set to `FALSE` the content is regularly updated. */
  var IsFixed: scala.Boolean
  /** specifies which part of the user data is displayed as described in {@link com.sun.star.text.UserDataPart} . */
  var UserDataType: scala.Double
}

