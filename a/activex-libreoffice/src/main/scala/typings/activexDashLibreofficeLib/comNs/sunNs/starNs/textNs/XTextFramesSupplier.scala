package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link TextFrame} instances in this context (e.g. document). */
trait XTextFramesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns a collection of text frames. */
  val TextFrames: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** returns a collection of text frames. */
  def getTextFrames(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XTextFramesSupplier {
  @scala.inline
  def apply(
    TextFrames: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getTextFrames: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextFramesSupplier = {
    val __obj = js.Dynamic.literal(TextFrames = TextFrames, acquire = acquire, getTextFrames = getTextFrames, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextFramesSupplier]
  }
}

