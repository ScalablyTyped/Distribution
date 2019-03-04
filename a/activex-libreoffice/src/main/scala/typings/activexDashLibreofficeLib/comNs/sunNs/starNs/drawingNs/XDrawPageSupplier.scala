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
    acquire: js.Function0[scala.Unit],
    getDrawPage: js.Function0[XDrawPage],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDrawPageSupplier = {
    val __obj = js.Dynamic.literal(DrawPage = DrawPage, acquire = acquire, getDrawPage = getDrawPage, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDrawPageSupplier]
  }
}

