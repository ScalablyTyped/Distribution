package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of an annotation text field.
  * @see com.sun.star.text.TextField
  */
trait Annotation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains the name of the author of the annotation. */
  var Author: java.lang.String
  /** contains the annotation's content */
  var Content: java.lang.String
  /** contains the creation date. */
  var Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /** contains the creation date. */
  var DateTimeValue: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * contains the initials of the author of the annotation.
    * @since LibreOffice 4.0
    */
  var Initials: java.lang.String
  /**
    * contains the name of the annotation.
    * @since LibreOffice 4.0
    */
  var Name: java.lang.String
}

