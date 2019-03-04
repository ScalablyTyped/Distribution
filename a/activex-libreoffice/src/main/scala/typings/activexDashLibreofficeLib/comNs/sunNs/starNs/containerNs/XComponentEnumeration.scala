package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a typified enumeration through components. */
trait XComponentEnumeration extends XEnumeration {
  /**
    * @returns the next component of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextComponent(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
}

object XComponentEnumeration {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    hasMoreElements: js.Function0[scala.Boolean],
    nextComponent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    nextElement: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XComponentEnumeration = {
    val __obj = js.Dynamic.literal(acquire = acquire, hasMoreElements = hasMoreElements, nextComponent = nextComponent, nextElement = nextElement, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XComponentEnumeration]
  }
}

