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
    acquire: js.Function0[scala.Unit],
    getChapterNumberingRules: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XChapterNumberingSupplier = {
    val __obj = js.Dynamic.literal(ChapterNumberingRules = ChapterNumberingRules, acquire = acquire, getChapterNumberingRules = getChapterNumberingRules, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XChapterNumberingSupplier]
  }
}

