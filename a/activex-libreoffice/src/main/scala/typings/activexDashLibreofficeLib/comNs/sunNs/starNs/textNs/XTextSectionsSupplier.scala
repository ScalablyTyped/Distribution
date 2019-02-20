package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages the text sections within the context (i.e. the document). */
trait XTextSectionsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of text sections. */
  val TextSections: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of text sections. */
  def getTextSections(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

