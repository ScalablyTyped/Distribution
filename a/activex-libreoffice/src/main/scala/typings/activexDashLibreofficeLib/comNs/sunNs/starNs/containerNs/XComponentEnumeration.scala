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
    acquire: () => scala.Unit,
    hasMoreElements: () => scala.Boolean,
    nextComponent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    nextElement: () => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XComponentEnumeration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextComponent = js.Any.fromFunction0(nextComponent), nextElement = js.Any.fromFunction0(nextElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XComponentEnumeration]
  }
}

