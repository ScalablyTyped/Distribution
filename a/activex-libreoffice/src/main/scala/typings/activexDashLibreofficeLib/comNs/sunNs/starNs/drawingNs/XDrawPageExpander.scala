package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by documents that can expand the contents of a summary on a {@link DrawPage} into a collection of {@link DrawPages} .
  * @deprecated Deprecated
  * @see XDrawPageSummarizer
  */
trait XDrawPageExpander
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a collection of {@link DrawPages} from the summary inside the given {@link DrawPage} and adds them to the same model as the source {@link
    * DrawPage} .
    */
  def expand(xPage: XDrawPage): XDrawPages
}

object XDrawPageExpander {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    expand: js.Function1[XDrawPage, XDrawPages],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDrawPageExpander = {
    val __obj = js.Dynamic.literal(acquire = acquire, expand = expand, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDrawPageExpander]
  }
}

