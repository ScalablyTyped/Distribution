package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a hidden text field.
  * @see com.sun.star.text.TextField
  */
trait HiddenText
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains the condition. */
  var Condition: java.lang.String
  /**
    * contains the text content of the hidden text field.
    *
    * The content is displayed if the condition evaluates to `FALSE` .
    */
  var Content: java.lang.String
  /**
    * contains the result of the last evaluation of the condition.
    *
    * This property has to be read/written in file export/import to save and restore the result without initiation of a new evaluation.
    */
  var IsHidden: scala.Boolean
}

