package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the settings of the chapter numbering in a text document. */
trait XChapterNumberingSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  val ChapterNumberingRules: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  def getChapterNumberingRules(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
}

object XChapterNumberingSupplier {
  @scala.inline
  def apply(
    ChapterNumberingRules: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
    acquire: () => scala.Unit,
    getChapterNumberingRules: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XChapterNumberingSupplier = {
    val __obj = js.Dynamic.literal(ChapterNumberingRules = ChapterNumberingRules, acquire = js.Any.fromFunction0(acquire), getChapterNumberingRules = js.Any.fromFunction0(getChapterNumberingRules), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XChapterNumberingSupplier]
  }
}

