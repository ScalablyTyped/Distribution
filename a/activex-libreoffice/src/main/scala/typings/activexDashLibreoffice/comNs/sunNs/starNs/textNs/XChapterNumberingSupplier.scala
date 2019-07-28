package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the settings of the chapter numbering in a text document. */
trait XChapterNumberingSupplier extends XInterface {
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  val ChapterNumberingRules: XIndexReplace
  /** @returns the collection of numbering rules for this document.  This interface allows access to the properties of the numbering level via a sequence of {@l */
  def getChapterNumberingRules(): XIndexReplace
}

object XChapterNumberingSupplier {
  @scala.inline
  def apply(
    ChapterNumberingRules: XIndexReplace,
    acquire: () => Unit,
    getChapterNumberingRules: () => XIndexReplace,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChapterNumberingSupplier = {
    val __obj = js.Dynamic.literal(ChapterNumberingRules = ChapterNumberingRules, acquire = js.Any.fromFunction0(acquire), getChapterNumberingRules = js.Any.fromFunction0(getChapterNumberingRules), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XChapterNumberingSupplier]
  }
}

