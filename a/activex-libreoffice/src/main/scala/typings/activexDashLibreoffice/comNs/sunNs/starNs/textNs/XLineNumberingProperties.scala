package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the settings of the line numbering in a text document. */
trait XLineNumberingProperties extends XInterface {
  /** @returns the {@link LineNumberingProperties} of the object. */
  val LineNumberingProperties: XPropertySet
  /** @returns the {@link LineNumberingProperties} of the object. */
  def getLineNumberingProperties(): XPropertySet
}

object XLineNumberingProperties {
  @scala.inline
  def apply(
    LineNumberingProperties: XPropertySet,
    acquire: () => Unit,
    getLineNumberingProperties: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLineNumberingProperties = {
    val __obj = js.Dynamic.literal(LineNumberingProperties = LineNumberingProperties, acquire = js.Any.fromFunction0(acquire), getLineNumberingProperties = js.Any.fromFunction0(getLineNumberingProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLineNumberingProperties]
  }
}

