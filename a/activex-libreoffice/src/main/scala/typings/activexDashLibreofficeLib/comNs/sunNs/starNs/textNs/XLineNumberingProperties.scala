package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the settings of the line numbering in a text document. */
trait XLineNumberingProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the {@link LineNumberingProperties} of the object. */
  val LineNumberingProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the {@link LineNumberingProperties} of the object. */
  def getLineNumberingProperties(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XLineNumberingProperties {
  @scala.inline
  def apply(
    LineNumberingProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getLineNumberingProperties: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLineNumberingProperties = {
    val __obj = js.Dynamic.literal(LineNumberingProperties = LineNumberingProperties, acquire = acquire, getLineNumberingProperties = getLineNumberingProperties, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLineNumberingProperties]
  }
}

