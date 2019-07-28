package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of an event from an {@link XDataEditor} . */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait DataEditorEventType extends js.Object

object DataEditorEventType {
  /** specifies that the data editing was canceled by the user (data not stored). */
  @scala.inline
  def CANCELED: `1` = this.cast(1)
  /** specifies that the data editing is done (data stored). */
  @scala.inline
  def DONE: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

