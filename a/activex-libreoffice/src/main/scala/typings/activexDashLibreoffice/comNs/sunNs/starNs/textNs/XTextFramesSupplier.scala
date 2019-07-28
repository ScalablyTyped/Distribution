package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link TextFrame} instances in this context (e.g. document). */
trait XTextFramesSupplier extends XInterface {
  /** returns a collection of text frames. */
  val TextFrames: XNameAccess
  /** returns a collection of text frames. */
  def getTextFrames(): XNameAccess
}

object XTextFramesSupplier {
  @scala.inline
  def apply(
    TextFrames: XNameAccess,
    acquire: () => Unit,
    getTextFrames: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextFramesSupplier = {
    val __obj = js.Dynamic.literal(TextFrames = TextFrames, acquire = js.Any.fromFunction0(acquire), getTextFrames = js.Any.fromFunction0(getTextFrames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextFramesSupplier]
  }
}

