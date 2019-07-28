package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a typified enumeration through components. */
trait XComponentEnumeration extends XEnumeration {
  /**
    * @returns the next component of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    */
  def nextComponent(): XComponent
}

object XComponentEnumeration {
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasMoreElements: () => Boolean,
    nextComponent: () => XComponent,
    nextElement: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentEnumeration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextComponent = js.Any.fromFunction0(nextComponent), nextElement = js.Any.fromFunction0(nextElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XComponentEnumeration]
  }
}

