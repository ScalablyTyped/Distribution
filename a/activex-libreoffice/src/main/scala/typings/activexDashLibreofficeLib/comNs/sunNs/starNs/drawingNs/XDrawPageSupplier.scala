package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that provides a {@link DrawPage} .
  *
  * This interface is provided if the container only supports exactly one {@link DrawPage} . For containers which support multiple {@link DrawPages}
  * interface {@link XDrawPagesSupplier} is supported.
  * @deprecated Deprecated
  */
trait XDrawPageSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the {@link DrawPage} . */
  val DrawPage: XDrawPage
  /** returns the {@link DrawPage} . */
  def getDrawPage(): XDrawPage
}

