package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a page number text field.
  * @see com.sun.star.text.TextField
  */
trait PageNumber
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /**
    * determines the type of the numbering.
    * @see com.sun.star.style.NumberingType
    */
  var NumberingType: scala.Double
  /** determines an offset value to show a different page number. */
  var Offset: scala.Double
  /**
    * determines which page the field refers to.
    * @see com.sun.star.text.PageNumberType
    */
  var SubType: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.PageNumberType
  /** if the user text string is set then it is displayed when the value of NumberingType is set to {@link com.sun.star.style.NumberingType.CHAR_SPECIAL} */
  var UserText: java.lang.String
}

