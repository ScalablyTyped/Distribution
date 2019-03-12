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

object XDrawPageSupplier {
  @scala.inline
  def apply(
    DrawPage: XDrawPage,
    acquire: () => scala.Unit,
    getDrawPage: () => XDrawPage,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDrawPageSupplier = {
    val __obj = js.Dynamic.literal(DrawPage = DrawPage, acquire = js.Any.fromFunction0(acquire), getDrawPage = js.Any.fromFunction0(getDrawPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDrawPageSupplier]
  }
}

