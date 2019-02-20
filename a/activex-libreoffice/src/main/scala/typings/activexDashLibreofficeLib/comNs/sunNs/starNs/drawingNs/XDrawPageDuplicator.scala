package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to duplicate pages within the same document. */
trait XDrawPageDuplicator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a duplicate of a {@link DrawPage} or {@link MasterPage} , including the {@link Shapes} on that page and inserts it into the same model.
    * @param xPage that is the source {@link DrawPage} or {@link MasterPage} that will be duplicated
    * @returns a newly created {@link DrawPage} or {@link MasterPage} that as all properties and copies of all {@link Shapes} from the source page.
    */
  def duplicate(xPage: XDrawPage): XDrawPage
}

