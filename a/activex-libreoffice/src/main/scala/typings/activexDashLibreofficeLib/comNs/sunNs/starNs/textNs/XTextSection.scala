package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide special data of a {@link TextSection} .
  * @see TextSection
  */
trait XTextSection extends XTextContent {
  /** @returns all text sections that are children of this text section (recursive). */
  val ChildSections: activexDashInteropLib.SafeArray[XTextSection]
  /** If the object is a child section, then this method returns the parent text section. */
  val ParentSection: XTextSection
  /** @returns all text sections that are children of this text section (recursive). */
  def getChildSections(): activexDashInteropLib.SafeArray[XTextSection]
  /** If the object is a child section, then this method returns the parent text section. */
  def getParentSection(): XTextSection
}

