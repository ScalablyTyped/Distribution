package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by documents that can expand the contents of a summary on a {@link DrawPage} into a collection of {@link DrawPages} .
  * @deprecated Deprecated
  * @see XDrawPageSummarizer
  */
trait XDrawPageExpander extends XInterface {
  /**
    * creates a collection of {@link DrawPages} from the summary inside the given {@link DrawPage} and adds them to the same model as the source {@link
    * DrawPage} .
    */
  def expand(xPage: XDrawPage): XDrawPages
}

object XDrawPageExpander {
  @scala.inline
  def apply(
    acquire: () => Unit,
    expand: XDrawPage => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPageExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), expand = js.Any.fromFunction1(expand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDrawPageExpander]
  }
}

