package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom presentation can show the pages of its presentation in a customized order.
  *
  * Such a presentation can use certain pages more than once, but it does not necessarily use all of the pages.
  */
trait CustomPresentation
  extends XIndexContainer
     with XNamed

object CustomPresentation {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    Name: String,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getName: () => String,
    hasElements: () => Boolean,
    insertByIndex: (Double, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setName: String => Unit
  ): CustomPresentation = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, Name = Name, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[CustomPresentation]
  }
}

