package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to set marks in an outputstream and to later jump back to these marks.
  *
  * The implementation stores the data as long as marks exists and later writes these data into the output stream, that has been set previously at the
  * {@link XActiveDataSource} interface.
  */
trait MarkableOutputStream
  extends XOutputStream
     with XMarkableStream
     with XActiveDataSource
     with XConnectable

