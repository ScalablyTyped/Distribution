package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by documents that can create summaries of their {@link DrawPages} .
  * @deprecated Deprecated
  */
trait XDrawPageSummarizer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** creates a new {@link DrawPage} with a summary of all {@link DrawPages} in the given collection. */
  def summarize(xPages: XDrawPages): XDrawPage
}

object XDrawPageSummarizer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    summarize: js.Function1[XDrawPages, XDrawPage]
  ): XDrawPageSummarizer = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, summarize = summarize)
  
    __obj.asInstanceOf[XDrawPageSummarizer]
  }
}

